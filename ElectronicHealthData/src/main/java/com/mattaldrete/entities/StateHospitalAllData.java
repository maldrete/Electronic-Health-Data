package com.mattaldrete.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateHospitalAllData {

	private String region;
	@JsonProperty(value = "region_code")
	private String regionCode;
	private int period;
	private double pct_hospitals_basic_ehr_notes;
	private String pct_rural_hospitals_basic_ehr_notes;
	private String pct_small_hospitals_basic_ehr_notes;
	private String pct_critical_access_hospitals_basic_ehr_notes;
	private String pct_hospitals_basic_ehr_no_notes;
	private String pct_rural_hospitals_basic_ehr_no_notes;
	private String pct_small_hospitals_basic_ehr_no_notes;
	private String pct_critical_access_hospitals_basic_ehr_no_notes;
	private String pct_hospitals_cehrt;
	private String pct_small_rural_hospitals_cehrt;
	private String pct_cah_hospitals_cehrt;
	private String pct_hospitals_share_labs_any_outside_provs;
	private String pct_hospitals_share_labs_any_outside_hospitals;
	private String pct_hospitals_share_labs_any_outside_ambu_provs;
	private String pct_hospitals_patients_ecopy_ehr;
	private String pct_hospitals_patients_ecopy_discharge_instr;
	private String pct_hospitals_share_care_summaries_any_outside_provs;
	private String pct_hospitals_share_care_summaries_any_outside_hospitals;
	private String pct_hospitals_share_care_summaries_any_outside_ambu_provs;
	private String pct_hospitals_patients_vdt;
	private String pct_hospitals_patients_secure_message;
	private String pct_hospitals_find_clinical_info;
	private String pct_hospitals_send_clinical_info;
	private String pct_hospitals_receive_clinical_info;
	private String pct_hospitals_integrate_any_clinical_info;
	private String pct_hospitals_integrate_scr;
	private String pct_hospitals_send_receive_find_integrate;
	private String pct_hospitals_api;
	private String pct_hospitals_integrate_pdmp;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getPct_hospitals_basic_ehr_notes() {
		return pct_hospitals_basic_ehr_notes;
	}

	public void setPct_hospitals_basic_ehr_notes(double pct_hospitals_basic_ehr_notes) {
		this.pct_hospitals_basic_ehr_notes = pct_hospitals_basic_ehr_notes;
	}

	public String getPct_rural_hospitals_basic_ehr_notes() {
		return pct_rural_hospitals_basic_ehr_notes;
	}

	public void setPct_rural_hospitals_basic_ehr_notes(String pct_rural_hospitals_basic_ehr_notes) {
		this.pct_rural_hospitals_basic_ehr_notes = pct_rural_hospitals_basic_ehr_notes;
	}

	public String getPct_small_hospitals_basic_ehr_notes() {
		return pct_small_hospitals_basic_ehr_notes;
	}

	public void setPct_small_hospitals_basic_ehr_notes(String pct_small_hospitals_basic_ehr_notes) {
		this.pct_small_hospitals_basic_ehr_notes = pct_small_hospitals_basic_ehr_notes;
	}

	public String getPct_critical_access_hospitals_basic_ehr_notes() {
		return pct_critical_access_hospitals_basic_ehr_notes;
	}

	public void setPct_critical_access_hospitals_basic_ehr_notes(String pct_critical_access_hospitals_basic_ehr_notes) {
		this.pct_critical_access_hospitals_basic_ehr_notes = pct_critical_access_hospitals_basic_ehr_notes;
	}

	public String getPct_hospitals_basic_ehr_no_notes() {
		return pct_hospitals_basic_ehr_no_notes;
	}

	public void setPct_hospitals_basic_ehr_no_notes(String pct_hospitals_basic_ehr_no_notes) {
		this.pct_hospitals_basic_ehr_no_notes = pct_hospitals_basic_ehr_no_notes;
	}

	public String getPct_rural_hospitals_basic_ehr_no_notes() {
		return pct_rural_hospitals_basic_ehr_no_notes;
	}

	public void setPct_rural_hospitals_basic_ehr_no_notes(String pct_rural_hospitals_basic_ehr_no_notes) {
		this.pct_rural_hospitals_basic_ehr_no_notes = pct_rural_hospitals_basic_ehr_no_notes;
	}

	public String getPct_small_hospitals_basic_ehr_no_notes() {
		return pct_small_hospitals_basic_ehr_no_notes;
	}

	public void setPct_small_hospitals_basic_ehr_no_notes(String pct_small_hospitals_basic_ehr_no_notes) {
		this.pct_small_hospitals_basic_ehr_no_notes = pct_small_hospitals_basic_ehr_no_notes;
	}

	public String getPct_critical_access_hospitals_basic_ehr_no_notes() {
		return pct_critical_access_hospitals_basic_ehr_no_notes;
	}

	public void setPct_critical_access_hospitals_basic_ehr_no_notes(
			String pct_critical_access_hospitals_basic_ehr_no_notes) {
		this.pct_critical_access_hospitals_basic_ehr_no_notes = pct_critical_access_hospitals_basic_ehr_no_notes;
	}

	public String getPct_hospitals_cehrt() {
		return pct_hospitals_cehrt;
	}

	public void setPct_hospitals_cehrt(String pct_hospitals_cehrt) {
		this.pct_hospitals_cehrt = pct_hospitals_cehrt;
	}

	public String getPct_small_rural_hospitals_cehrt() {
		return pct_small_rural_hospitals_cehrt;
	}

	public void setPct_small_rural_hospitals_cehrt(String pct_small_rural_hospitals_cehrt) {
		this.pct_small_rural_hospitals_cehrt = pct_small_rural_hospitals_cehrt;
	}

	public String getPct_cah_hospitals_cehrt() {
		return pct_cah_hospitals_cehrt;
	}

	public void setPct_cah_hospitals_cehrt(String pct_cah_hospitals_cehrt) {
		this.pct_cah_hospitals_cehrt = pct_cah_hospitals_cehrt;
	}

	public String getPct_hospitals_share_labs_any_outside_provs() {
		return pct_hospitals_share_labs_any_outside_provs;
	}

	public void setPct_hospitals_share_labs_any_outside_provs(String pct_hospitals_share_labs_any_outside_provs) {
		this.pct_hospitals_share_labs_any_outside_provs = pct_hospitals_share_labs_any_outside_provs;
	}

	public String getPct_hospitals_share_labs_any_outside_hospitals() {
		return pct_hospitals_share_labs_any_outside_hospitals;
	}

	public void setPct_hospitals_share_labs_any_outside_hospitals(
			String pct_hospitals_share_labs_any_outside_hospitals) {
		this.pct_hospitals_share_labs_any_outside_hospitals = pct_hospitals_share_labs_any_outside_hospitals;
	}

	public String getPct_hospitals_share_labs_any_outside_ambu_provs() {
		return pct_hospitals_share_labs_any_outside_ambu_provs;
	}

	public void setPct_hospitals_share_labs_any_outside_ambu_provs(
			String pct_hospitals_share_labs_any_outside_ambu_provs) {
		this.pct_hospitals_share_labs_any_outside_ambu_provs = pct_hospitals_share_labs_any_outside_ambu_provs;
	}

	public String getPct_hospitals_patients_ecopy_ehr() {
		return pct_hospitals_patients_ecopy_ehr;
	}

	public void setPct_hospitals_patients_ecopy_ehr(String pct_hospitals_patients_ecopy_ehr) {
		this.pct_hospitals_patients_ecopy_ehr = pct_hospitals_patients_ecopy_ehr;
	}

	public String getPct_hospitals_patients_ecopy_discharge_instr() {
		return pct_hospitals_patients_ecopy_discharge_instr;
	}

	public void setPct_hospitals_patients_ecopy_discharge_instr(String pct_hospitals_patients_ecopy_discharge_instr) {
		this.pct_hospitals_patients_ecopy_discharge_instr = pct_hospitals_patients_ecopy_discharge_instr;
	}

	public String getPct_hospitals_share_care_summaries_any_outside_provs() {
		return pct_hospitals_share_care_summaries_any_outside_provs;
	}

	public void setPct_hospitals_share_care_summaries_any_outside_provs(
			String pct_hospitals_share_care_summaries_any_outside_provs) {
		this.pct_hospitals_share_care_summaries_any_outside_provs = pct_hospitals_share_care_summaries_any_outside_provs;
	}

	public String getPct_hospitals_share_care_summaries_any_outside_hospitals() {
		return pct_hospitals_share_care_summaries_any_outside_hospitals;
	}

	public void setPct_hospitals_share_care_summaries_any_outside_hospitals(
			String pct_hospitals_share_care_summaries_any_outside_hospitals) {
		this.pct_hospitals_share_care_summaries_any_outside_hospitals = pct_hospitals_share_care_summaries_any_outside_hospitals;
	}

	public String getPct_hospitals_share_care_summaries_any_outside_ambu_provs() {
		return pct_hospitals_share_care_summaries_any_outside_ambu_provs;
	}

	public void setPct_hospitals_share_care_summaries_any_outside_ambu_provs(
			String pct_hospitals_share_care_summaries_any_outside_ambu_provs) {
		this.pct_hospitals_share_care_summaries_any_outside_ambu_provs = pct_hospitals_share_care_summaries_any_outside_ambu_provs;
	}

	public String getPct_hospitals_patients_vdt() {
		return pct_hospitals_patients_vdt;
	}

	public void setPct_hospitals_patients_vdt(String pct_hospitals_patients_vdt) {
		this.pct_hospitals_patients_vdt = pct_hospitals_patients_vdt;
	}

	public String getPct_hospitals_patients_secure_message() {
		return pct_hospitals_patients_secure_message;
	}

	public void setPct_hospitals_patients_secure_message(String pct_hospitals_patients_secure_message) {
		this.pct_hospitals_patients_secure_message = pct_hospitals_patients_secure_message;
	}

	public String getPct_hospitals_find_clinical_info() {
		return pct_hospitals_find_clinical_info;
	}

	public void setPct_hospitals_find_clinical_info(String pct_hospitals_find_clinical_info) {
		this.pct_hospitals_find_clinical_info = pct_hospitals_find_clinical_info;
	}

	public String getPct_hospitals_send_clinical_info() {
		return pct_hospitals_send_clinical_info;
	}

	public void setPct_hospitals_send_clinical_info(String pct_hospitals_send_clinical_info) {
		this.pct_hospitals_send_clinical_info = pct_hospitals_send_clinical_info;
	}

	public String getPct_hospitals_receive_clinical_info() {
		return pct_hospitals_receive_clinical_info;
	}

	public void setPct_hospitals_receive_clinical_info(String pct_hospitals_receive_clinical_info) {
		this.pct_hospitals_receive_clinical_info = pct_hospitals_receive_clinical_info;
	}

	public String getPct_hospitals_integrate_any_clinical_info() {
		return pct_hospitals_integrate_any_clinical_info;
	}

	public void setPct_hospitals_integrate_any_clinical_info(String pct_hospitals_integrate_any_clinical_info) {
		this.pct_hospitals_integrate_any_clinical_info = pct_hospitals_integrate_any_clinical_info;
	}

	public String getPct_hospitals_integrate_scr() {
		return pct_hospitals_integrate_scr;
	}

	public void setPct_hospitals_integrate_scr(String pct_hospitals_integrate_scr) {
		this.pct_hospitals_integrate_scr = pct_hospitals_integrate_scr;
	}

	public String getPct_hospitals_send_receive_find_integrate() {
		return pct_hospitals_send_receive_find_integrate;
	}

	public void setPct_hospitals_send_receive_find_integrate(String pct_hospitals_send_receive_find_integrate) {
		this.pct_hospitals_send_receive_find_integrate = pct_hospitals_send_receive_find_integrate;
	}

	public String getPct_hospitals_api() {
		return pct_hospitals_api;
	}

	public void setPct_hospitals_api(String pct_hospitals_api) {
		this.pct_hospitals_api = pct_hospitals_api;
	}

	public String getPct_hospitals_integrate_pdmp() {
		return pct_hospitals_integrate_pdmp;
	}

	public void setPct_hospitals_integrate_pdmp(String pct_hospitals_integrate_pdmp) {
		this.pct_hospitals_integrate_pdmp = pct_hospitals_integrate_pdmp;
	}

	public StateHospitalAllData(String region, String regionCode, int period, double pct_hospitals_basic_ehr_notes,
			String pct_rural_hospitals_basic_ehr_notes, String pct_small_hospitals_basic_ehr_notes,
			String pct_critical_access_hospitals_basic_ehr_notes, String pct_hospitals_basic_ehr_no_notes,
			String pct_rural_hospitals_basic_ehr_no_notes, String pct_small_hospitals_basic_ehr_no_notes,
			String pct_critical_access_hospitals_basic_ehr_no_notes, String pct_hospitals_cehrt,
			String pct_small_rural_hospitals_cehrt, String pct_cah_hospitals_cehrt,
			String pct_hospitals_share_labs_any_outside_provs, String pct_hospitals_share_labs_any_outside_hospitals,
			String pct_hospitals_share_labs_any_outside_ambu_provs, String pct_hospitals_patients_ecopy_ehr,
			String pct_hospitals_patients_ecopy_discharge_instr,
			String pct_hospitals_share_care_summaries_any_outside_provs,
			String pct_hospitals_share_care_summaries_any_outside_hospitals,
			String pct_hospitals_share_care_summaries_any_outside_ambu_provs, String pct_hospitals_patients_vdt,
			String pct_hospitals_patients_secure_message, String pct_hospitals_find_clinical_info,
			String pct_hospitals_send_clinical_info, String pct_hospitals_receive_clinical_info,
			String pct_hospitals_integrate_any_clinical_info, String pct_hospitals_integrate_scr,
			String pct_hospitals_send_receive_find_integrate, String pct_hospitals_api,
			String pct_hospitals_integrate_pdmp) {
		super();
		this.region = region;
		this.regionCode = regionCode;
		this.period = period;
		this.pct_hospitals_basic_ehr_notes = pct_hospitals_basic_ehr_notes;
		this.pct_rural_hospitals_basic_ehr_notes = pct_rural_hospitals_basic_ehr_notes;
		this.pct_small_hospitals_basic_ehr_notes = pct_small_hospitals_basic_ehr_notes;
		this.pct_critical_access_hospitals_basic_ehr_notes = pct_critical_access_hospitals_basic_ehr_notes;
		this.pct_hospitals_basic_ehr_no_notes = pct_hospitals_basic_ehr_no_notes;
		this.pct_rural_hospitals_basic_ehr_no_notes = pct_rural_hospitals_basic_ehr_no_notes;
		this.pct_small_hospitals_basic_ehr_no_notes = pct_small_hospitals_basic_ehr_no_notes;
		this.pct_critical_access_hospitals_basic_ehr_no_notes = pct_critical_access_hospitals_basic_ehr_no_notes;
		this.pct_hospitals_cehrt = pct_hospitals_cehrt;
		this.pct_small_rural_hospitals_cehrt = pct_small_rural_hospitals_cehrt;
		this.pct_cah_hospitals_cehrt = pct_cah_hospitals_cehrt;
		this.pct_hospitals_share_labs_any_outside_provs = pct_hospitals_share_labs_any_outside_provs;
		this.pct_hospitals_share_labs_any_outside_hospitals = pct_hospitals_share_labs_any_outside_hospitals;
		this.pct_hospitals_share_labs_any_outside_ambu_provs = pct_hospitals_share_labs_any_outside_ambu_provs;
		this.pct_hospitals_patients_ecopy_ehr = pct_hospitals_patients_ecopy_ehr;
		this.pct_hospitals_patients_ecopy_discharge_instr = pct_hospitals_patients_ecopy_discharge_instr;
		this.pct_hospitals_share_care_summaries_any_outside_provs = pct_hospitals_share_care_summaries_any_outside_provs;
		this.pct_hospitals_share_care_summaries_any_outside_hospitals = pct_hospitals_share_care_summaries_any_outside_hospitals;
		this.pct_hospitals_share_care_summaries_any_outside_ambu_provs = pct_hospitals_share_care_summaries_any_outside_ambu_provs;
		this.pct_hospitals_patients_vdt = pct_hospitals_patients_vdt;
		this.pct_hospitals_patients_secure_message = pct_hospitals_patients_secure_message;
		this.pct_hospitals_find_clinical_info = pct_hospitals_find_clinical_info;
		this.pct_hospitals_send_clinical_info = pct_hospitals_send_clinical_info;
		this.pct_hospitals_receive_clinical_info = pct_hospitals_receive_clinical_info;
		this.pct_hospitals_integrate_any_clinical_info = pct_hospitals_integrate_any_clinical_info;
		this.pct_hospitals_integrate_scr = pct_hospitals_integrate_scr;
		this.pct_hospitals_send_receive_find_integrate = pct_hospitals_send_receive_find_integrate;
		this.pct_hospitals_api = pct_hospitals_api;
		this.pct_hospitals_integrate_pdmp = pct_hospitals_integrate_pdmp;
	}

	public StateHospitalAllData() {

	}

	@Override
	public String toString() {
		return "StateHospitalAllData [region=" + region + ", regionCode=" + regionCode + ", period=" + period
				+ ", pct_hospitals_basic_ehr_notes=" + pct_hospitals_basic_ehr_notes
				+ ", pct_rural_hospitals_basic_ehr_notes=" + pct_rural_hospitals_basic_ehr_notes
				+ ", pct_small_hospitals_basic_ehr_notes=" + pct_small_hospitals_basic_ehr_notes
				+ ", pct_critical_access_hospitals_basic_ehr_notes=" + pct_critical_access_hospitals_basic_ehr_notes
				+ ", pct_hospitals_basic_ehr_no_notes=" + pct_hospitals_basic_ehr_no_notes
				+ ", pct_rural_hospitals_basic_ehr_no_notes=" + pct_rural_hospitals_basic_ehr_no_notes
				+ ", pct_small_hospitals_basic_ehr_no_notes=" + pct_small_hospitals_basic_ehr_no_notes
				+ ", pct_critical_access_hospitals_basic_ehr_no_notes="
				+ pct_critical_access_hospitals_basic_ehr_no_notes + ", pct_hospitals_cehrt=" + pct_hospitals_cehrt
				+ ", pct_small_rural_hospitals_cehrt=" + pct_small_rural_hospitals_cehrt + ", pct_cah_hospitals_cehrt="
				+ pct_cah_hospitals_cehrt + ", pct_hospitals_share_labs_any_outside_provs="
				+ pct_hospitals_share_labs_any_outside_provs + ", pct_hospitals_share_labs_any_outside_hospitals="
				+ pct_hospitals_share_labs_any_outside_hospitals + ", pct_hospitals_share_labs_any_outside_ambu_provs="
				+ pct_hospitals_share_labs_any_outside_ambu_provs + ", pct_hospitals_patients_ecopy_ehr="
				+ pct_hospitals_patients_ecopy_ehr + ", pct_hospitals_patients_ecopy_discharge_instr="
				+ pct_hospitals_patients_ecopy_discharge_instr
				+ ", pct_hospitals_share_care_summaries_any_outside_provs="
				+ pct_hospitals_share_care_summaries_any_outside_provs
				+ ", pct_hospitals_share_care_summaries_any_outside_hospitals="
				+ pct_hospitals_share_care_summaries_any_outside_hospitals
				+ ", pct_hospitals_share_care_summaries_any_outside_ambu_provs="
				+ pct_hospitals_share_care_summaries_any_outside_ambu_provs + ", pct_hospitals_patients_vdt="
				+ pct_hospitals_patients_vdt + ", pct_hospitals_patients_secure_message="
				+ pct_hospitals_patients_secure_message + ", pct_hospitals_find_clinical_info="
				+ pct_hospitals_find_clinical_info + ", pct_hospitals_send_clinical_info="
				+ pct_hospitals_send_clinical_info + ", pct_hospitals_receive_clinical_info="
				+ pct_hospitals_receive_clinical_info + ", pct_hospitals_integrate_any_clinical_info="
				+ pct_hospitals_integrate_any_clinical_info + ", pct_hospitals_integrate_scr="
				+ pct_hospitals_integrate_scr + ", pct_hospitals_send_receive_find_integrate="
				+ pct_hospitals_send_receive_find_integrate + ", pct_hospitals_api=" + pct_hospitals_api
				+ ", pct_hospitals_integrate_pdmp=" + pct_hospitals_integrate_pdmp + "]";
	}

}
