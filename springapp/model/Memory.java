package com.fis.springapp.model;

import org.springframework.beans.factory.annotation.Value;

public class Memory {
	@Value("${con.fig}")
	private String config;

	public Memory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memory(String config) {
		super();
		this.config = config;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	@Override
	public String toString() {
		return "Memory [config=" + config + "]";
	}
	

}
