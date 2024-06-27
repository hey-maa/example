package com.day3.scanner;

public class calculator {
     //function to calculate tax
	//eequalsIgnoreCase will ignore case difference like feMale Female etc.
	public void calculatetax(tax_calci t) {
		if (t.getAge()>65 || t.getGender().equalsIgnoreCase("female") || t.getAge()<=18) {
			t.setTax(0);
			System.out.println("Tax not applicable");
		}
		else {
			if (t.getIncome() <= 160000) {
				t.setTax(0);
			}
			else if(t.getIncome() >160000 && t.getIncome()<=500000) {
				t.setTax((t.getIncome() - 160000 )* 10/100);
			}
			else if (t.getIncome() >500000 && t.getIncome()<=800000) {
				t.setTax((t.getIncome()- 500000)* 20/100 + 34000);
			}
			else {
				t.setTax((t.getIncome()- 800000)* 30/100 + 94000);
			}
		}
	}
}
