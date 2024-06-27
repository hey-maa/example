package com.day3.scanner;
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
    	 
        constructor_pract c1 = new constructor_pract();
        
    	
    }
}
