package com.day9;

import java.util.Arrays;

public class arrays {
   public static void main(String [] args) {
	   //single dimensional array
	   int [] arr= {12,10,22,1,2,3};
	   System.out.println(Arrays.toString(arr));
	   
	   //looping through array elements
	   
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
	   System.out.println();
	   //sorting the array
	   Arrays.sort(arr);
	   System.out.println(Arrays.toString(arr));
	   
	   //binary search
	   
	   System.out.println(Arrays.binarySearch(arr, 1));
	   System.out.println(Arrays.binarySearch(arr, 4));
	   
	   //compare
	   
	   int arr1 []= {1,2,3,4,5};
	   System.out.println(Arrays.toString(arr1));
	   
	   if(Arrays.compare(arr,arr1)==0) {
		   System.out.println("Arrays are same");
	   }
	   else {
		   System.out.println();
	   }
	   //copy array
	   
	   int arr3 []=Arrays.copyOf(arr1,2);
			   System.out.println(Arrays.toString(arr3));
	   
	   
	   //copy of range
	   
	   int arr4 []=Arrays.copyOfRange(arr3, 1,3);
	   System.out.println(Arrays.toString(arr4));	   
			   
	  //fill array with specific number
	
	   Arrays.fill(arr3,5);
	   System.out.println(Arrays.toString(arr4));
	   
	   
   }
}

