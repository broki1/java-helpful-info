package com.file.model;

import java.io.Serializable;

public class Wheel implements Serializable {

	private String type;
	private int sizeInInches;
	private String position;
	
	public Wheel(String type, int sizeInInches, String position) {
		super();
		this.type = type;
		this.sizeInInches = sizeInInches;
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSizeInInches() {
		return sizeInInches;
	}

	public void setSizeInInches(int sizeInInches) {
		this.sizeInInches = sizeInInches;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
