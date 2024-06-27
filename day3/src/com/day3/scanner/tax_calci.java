package com.day3.scanner;

public class tax_calci {
	
	//data member
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	//in order to access and set the above private variables outside the class i need to apply getter setter method 
	//right click in space source->generate getters and setters->select variables
	
	//now there are two ways to call theses variable either by calling get method for each variable or just use object and to string 
	//all at once
	
	//object class method return string representation of tax_calci object
	@Override
	public String toString() {
		return "tax_calci [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	

}

