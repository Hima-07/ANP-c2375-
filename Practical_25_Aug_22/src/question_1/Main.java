package question_1;

import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	
	ArrayService obj = new ArrayService();
	
	int arr[]=new int[5];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 5 Elements of the Array: ");
	
	for(int i=0;i<5;i++) {
		arr[i]=sc.nextInt();
	}
	int avg=obj.calculateAverage(arr);
	System.out.println("Average of the given Array is "+avg);
	}
}