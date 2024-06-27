package com.day3.scanner;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
    	//scanner object to accept user inputs
    	//ctrl+shift+o to include necessary classes through import automatically 
    	
    	Scanner ob= new Scanner(System.in);
    	
    	String name;
    	System.out.println("Enter Person Name: ");
    	name=ob.next();
    	System.out.println("Enter Person age: ");
    	int age = ob.nextInt();
    	System.out.println("Enter Person gender: ");
    	String gender=ob.next();
    	System.out.println("Enter Person income: ");
    	int income=ob.nextInt();
    	
    	//person object and initialize values using setter
    	
    	tax_calci t = new tax_calci();
    	t.setAge(age);
    	t.setGender(gender);
    	t.setIncome(income);
    	t.setName(name);
    		
    	calculator cal=new calculator();
    	cal.calculatetax(t);
    	System.out.println(t);
    }
}
