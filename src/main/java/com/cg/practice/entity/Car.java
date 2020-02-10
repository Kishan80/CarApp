package com.cg.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity

public class Car {
	@Id
	@GeneratedValue
	private int carNo;
	@Pattern(regexp="^[a-zA-Z]{1,20}", message = "Enter only Character")
	
	private String companyName;
	@Pattern(regexp="^[a-zA-Z]{1,20}")
	private String model;
	@Pattern(regexp="^[a-zA-Z]{1,20}") 
	private String colour;
	private double price;
	
	public Car() {
		super();
	}

	public Car(int carNo, String companyName, String model, String colour, double price) {
		super();
		this.carNo = carNo;
		this.companyName = companyName;
		this.model = model;
		this.colour = colour;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", companyName=" + companyName + ", model=" + model + ", colour=" + colour
				+ ", price=" + price + "]";
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	
	
	
}
