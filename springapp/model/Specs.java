package com.fis.springapp.model;

public class Specs {
	private String processor;
	private int harddisksize;
	private int screensize;
	public Specs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specs(String processor, int harddisksize, int screensize) {
		super();
		this.processor = processor;
		this.harddisksize = harddisksize;
		this.screensize = screensize;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getHarddisksize() {
		return harddisksize;
	}
	public void setHarddisksize(int harddisksize) {
		this.harddisksize = harddisksize;
	}
	public int getScreensize() {
		return screensize;
	}
	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	@Override
	public String toString() {
		return "Specs [processor=" + processor + ", harddisksize=" + harddisksize + ", screensize=" + screensize + "]";
	}
	

}
