package com.day9;

public class main {
       public static void main(String [] args){
    	  arraysoperation a=new arraysoperation();
    	  int b []= {10,20,3,4,24};
    	 int c=a.getOddCount(b);
    	 int c1=a.getEvenCount(b);
    	 System.out.println("odd number of elements are:"+c);
    	 System.out.println("even number of elements are:"+c1);
         a.printArray(b);
       
       }
}
