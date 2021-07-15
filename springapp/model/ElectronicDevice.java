package com.fis.springapp.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class ElectronicDevice implements Serializable, Comparable<ElectronicDevice> {
	
	@Value("001")
	private int divId;
	@Value("${details.name}")
	private String divName;
	@Value("20000")
	private int price;
	private int ratingstar;
	private String color;
	private Battery batt;
	private Memory meme;
	

	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ElectronicDevice(int divId, String divName, int price, int ratingstar, String color, Battery batt,
			Memory meme) {
		super();
		this.divId = divId;
		this.divName = divName;
		this.price = price;
		this.ratingstar = ratingstar;
		this.color = color;
		this.batt = batt;
		this.meme = meme;
	}
	


	public int getDivId() {
		return divId;
	}


	public void setDivId(int divId) {
		this.divId = divId;
	}


	public String getDivName() {
		return divName;
	}


	public void setDivName(String divName) {
		this.divName = divName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getRatingstar() {
		return ratingstar;
	}


	public void setRatingstar(int ratingstar) {
		this.ratingstar = ratingstar;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Battery getBatt() {
		return batt;
	}


	public void setBatt(Battery batt) {
		this.batt = batt;
	}


	public Memory getMeme() {
		return meme;
	}


	public void setMeme(Memory meme) {
		this.meme = meme;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batt == null) ? 0 : batt.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + divId;
		result = prime * result + ((divName == null) ? 0 : divName.hashCode());
		result = prime * result + ((meme == null) ? 0 : meme.hashCode());
		result = prime * result + price;
		result = prime * result + ratingstar;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDevice other = (ElectronicDevice) obj;
		if (batt == null) {
			if (other.batt != null)
				return false;
		} else if (!batt.equals(other.batt))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (divId != other.divId)
			return false;
		if (divName == null) {
			if (other.divName != null)
				return false;
		} else if (!divName.equals(other.divName))
			return false;
		if (meme == null) {
			if (other.meme != null)
				return false;
		} else if (!meme.equals(other.meme))
			return false;
		if (price != other.price)
			return false;
		if (ratingstar != other.ratingstar)
			return false;
		return true;
	}
	


	@Override
	public String toString() {
		return "ElectronicDevice [divId=" + divId + ", divName=" + divName + ", price=" + price + ", ratingstar="
				+ ratingstar + ", color=" + color + ", batt=" + batt + ", meme=" + meme + "]";
	}


	public int compareTo(ElectronicDevice o) {
		// TODO Auto-generated method stub
		return this.divName.compareTo(o.divName);
	}
	public void doInIt()
	{
		System.out.println(" do init called ");
		// provide path to the file 
	}
	
	public void doDestroy()
	{
		// write data to the file
		System.out.println(" do destroy  called ");
	}

}
