package com.fis.springapp.model;

import org.springframework.beans.factory.annotation.Value;

public class Battery {
	@Value("${batt.name}")
	private String battName;
	@Value("16")
	private int volts;
	public Battery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Battery(String battName, int volts) {
		super();
		this.battName = battName;
		this.volts = volts;
	}
	public String getBattName() {
		return battName;
	}
	public void setBattName(String battName) {
		this.battName = battName;
	}
	public int getVolts() {
		return volts;
	}
	public void setVolts(int volts) {
		this.volts = volts;
	}
	@Override
	public String toString() {
		return "Battery [battName=" + battName + ", volts=" + volts + "]";
	}

}
