package com.file.model;

import java.io.Serializable;

public class Engine implements Serializable {

	private int rmp;
	private String type;
	
	public Engine(int rmp, String type) {
		super();
		this.rmp = rmp;
		this.type = type;
	}

	public int getRmp() {
		return rmp;
	}



	public void setRmp(int rmp) {
		this.rmp = rmp;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public void start() {
		System.out.println("Starting engine");
	}
	
	public void stop() {
		System.out.println("Stopping engine");
	}
	
}
