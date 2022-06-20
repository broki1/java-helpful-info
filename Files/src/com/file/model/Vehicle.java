package com.file.model;

public class Vehicle {

	protected String color;
	protected int maxSpeed;
	protected String typeOfTank;
	protected int seatingCapacity;
	
	public Vehicle(String color, int maxSpeed, String typeOfTank, int seatingCapacity) {
		super();
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.typeOfTank = typeOfTank;
		this.seatingCapacity = seatingCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getTypeOfTank() {
		return typeOfTank;
	}

	public void setTypeOfTank(String typeOfTank) {
		this.typeOfTank = typeOfTank;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
}
