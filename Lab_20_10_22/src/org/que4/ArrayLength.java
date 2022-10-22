package org.que4;

import java.util.Scanner;

public class ArrayLength {
	
	static int values[]=new int[5];
	static int targetValue;
	
	static Scanner sObj = new Scanner(System.in);
	
	public static void main(String[] abc) {
		
		System.out.println("Enter the any 5 values for array");
		for (int i=0;i<5;i++) {
			values[i]=sObj.nextInt();
			sObj.nextLine();
		}
		System.out.println("Enter the Targeted Value");
		targetValue = sObj.nextInt();
		calculate(targetValue,values);
	}
	
	public static void calculate(int targetValue, int[] values) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<values.length;j++) {
				if (values[i]+values[j]==targetValue) {
					System.out.println("pair found(%d%d)");
					return; 
				}
			}	
		}
		System.out.println("no pair found");
	}
	
	
}
