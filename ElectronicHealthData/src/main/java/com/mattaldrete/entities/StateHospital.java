package com.mattaldrete.entities;

public class StateHospital {

	private String region;
	private String regionCode;
	private int period;
	private double pct_hospitals_basic_ehr_notes;

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

	public StateHospital(String region, String regionCode, int period, double pct_hospitals_basic_ehr_notes) {
		super();
		this.region = region;
		this.regionCode = regionCode;
		this.period = period;
		this.pct_hospitals_basic_ehr_notes = pct_hospitals_basic_ehr_notes;
	}

	public StateHospital() {

	}

	@Override
	public String toString() {
		return "StateHospital [region=" + region + ", regionCode=" + regionCode + ", period=" + period
				+ ", pct_hospitals_basic_ehr_notes=" + pct_hospitals_basic_ehr_notes + "]\n";
	}

}
