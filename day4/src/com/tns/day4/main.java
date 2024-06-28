package com.tns.day4;

import java.util.Scanner;


public class main {
    public static void main() {
    	Scanner obj = new Scanner(System.in);
    	int id;
    	System.out.println("Enter the id : ");
    	
    	id=obj.nextInt();
    	
    	System.out.println("Enter the name : ");
    	String name = obj.next();
    	
    	System.out.println("Enter the city : ");
    	String city = obj.nextLine();
    	 
        constructur_default c1 = new constructur_default();
        constructur_default c2 = new constructur_default(name,id,city);
        System.out.println(c1);
        System.out.println(c2);
    	
    }
}

