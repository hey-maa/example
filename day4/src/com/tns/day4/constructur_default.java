package com.tns.day4;

public class constructur_default {
	private String custName;
	private int custId;
	private String custCity;
	
//parametrised constructor 
	//right click->source->generate constructor using fields->select all
	//this. ->it refers to current variable value in the constructor 
	// this() and this. are different
	public constructur_default(String custName, int custId, String custCity) {
		super();
		this.custName = custName;
		this.custId = custId;
		this.custCity = custCity;
	}

//default constructor
	//right click->source->generate constructor using fields->deselect all
	public constructur_default() {
		System.out.println("Default");
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	@Override
	public String toString() {
		return "constructor_pract [custName=" + custName + ", custId=" + custId + ", custCity=" + custCity + "]";
	}

}
