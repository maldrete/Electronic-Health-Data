package com.mattaldrete.json;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mattaldrete.entities.StateHospital;
import com.mattaldrete.entities.StateHospitalAllData;

public class HospitalEHR {

	public static void main(String[] args) {

		URL url = null;
		try {
			url = new URL("https://dashboard.healthit.gov/api/open-api.php?source=AHA_2008-2017.csv");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		String jsonString = jsonToString(url);
//		System.out.println(jsonString);

		List<StateHospital> hospitals = jsonToJavaObject(jsonString);
		System.out.println("2014 List size: " + hospitals.size());

		List<StateHospital> hospitalsSorted = sortDescByEHC(hospitals);
		System.out.println(hospitalsSorted);
		
		
		String fileName = "ehr.csv";
		
		convertToCSV(hospitalsSorted, fileName);

	}

	public static String jsonToString(URL url) {
		String jsonString = "";
		try {
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();

//			System.out.println(responsecode);
			if (responsecode != 200) {
				throw new RuntimeException("HttpRepsonseCode: " + responsecode);
			} else {
				Scanner sc = new Scanner(url.openStream());

				while (sc.hasNext()) {
					jsonString += sc.nextLine();
				}

//				System.out.println("JSON data in string format");
//				System.out.println(jsonString);
//				System.out.println("done");
				sc.close();
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonString;
	}

	public static List<StateHospital> jsonToJavaObject(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		List<StateHospital> shList = new ArrayList<StateHospital>();

		try {
			// Data is an array of objects
			StateHospitalAllData[] state = mapper.readValue(jsonString, StateHospitalAllData[].class);

			for (int i = 0; i < state.length; i++) {
				int period = state[i].getPeriod();
				String regionCode = state[i].getRegionCode();

				if ((period == 2014) && (!regionCode.contentEquals("US"))) {
					StateHospital sh = new StateHospital();
					sh.setRegion(state[i].getRegion());
					sh.setRegionCode(state[i].getRegionCode());
					sh.setPeriod(state[i].getPeriod());
					sh.setPct_hospitals_basic_ehr_notes(state[i].getPct_hospitals_basic_ehr_notes());
					shList.add(sh);

				}
			}

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return shList;
	}

	public static List<StateHospital> sortDescByEHC(List<StateHospital> shList) {
		Collections.sort(shList, new Comparator<StateHospital>() {

			@Override
			public int compare(StateHospital o1, StateHospital o2) {
				return Double.valueOf(o2.getPct_hospitals_basic_ehr_notes())
						.compareTo(o1.getPct_hospitals_basic_ehr_notes());
			}
		});

		return shList;
	}

	public static void convertToCSV(List<StateHospital> data, String fileName) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println("State\t" + "EHR %\t" + "Period\t");
			for (StateHospital sh : data) {
				pw.println(sh.getRegion() + "\t" + sh.getPct_hospitals_basic_ehr_notes() + "\t" + sh.getPeriod());
			}

			pw.flush();
			pw.close();

			JOptionPane.showMessageDialog(null, "File Created");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
