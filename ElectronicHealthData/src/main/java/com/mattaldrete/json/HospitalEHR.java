package com.mattaldrete.json;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
		
		jsonToShAllData(jsonString);

	}

	
	
	public static String jsonToString(URL url) {
		String jsonString = "";
		try {
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();

//			System.out.println(responsecode);

			List<StateHospitalAllData> stateHospitals = new ArrayList<StateHospitalAllData>();

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
	
	
	public static void jsonToShAllData(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			StateHospitalAllData[] state = mapper.readValue(jsonString, StateHospitalAllData[].class);
			
			
			
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
