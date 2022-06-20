package com.file.model;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {

	private String make;
	private int year;
	private Engine engine;
	private Wheel[] wheels = new Wheel[4];
	
	public Car(String color, int maxSpeed, String typeOfTank, int seatingCapacity, String make, int year, Engine engine,
			Wheel[] wheels) {
		super(color, maxSpeed, typeOfTank, seatingCapacity);
		this.make = make;
		this.year = year;
		this.engine = engine;
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
}
