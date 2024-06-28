package com.tns.day4_2;

import com.tns.day4.access_modifier;

public class subclass {
	access_modifier a =new access_modifier();
	//singleton class
	//when we restrict to create only one instance of a particular class and use it access all the number of methods,variables
	private static subclass s =new subclass();
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private subclass(){
		System.out.println("private constructor called");
	}
	//factory method
	public static subclass getObject() {
		return s;  
	}
	@Override
	public String toString() {
		return "subclass [a=" + a + ", id=" + id + "]";
	}
	
	
	
}
