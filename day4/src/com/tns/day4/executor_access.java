package com.tns.day4;

public class executor_access {
	public static void main(String [] args) {
      access_modifier a = new access_modifier();
      a.methodDefault();
      a.methodProtected();
      a.methodPublic();
      //instanceof keyword used to check if a variable is instance of the class
      //syso+control+space
      System.out.println(a instanceof access_modifier );
      
	}   
}
