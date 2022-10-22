package org.que3;

import java.io.FileWriter;
import java.util.Scanner;

public class TextFile  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			FileWriter obj =new FileWriter("FileName.txt");
			System.out.println("Enter Your Text : ");
			String abc = sc.next();
			obj.write(abc);
			obj.close();
		}catch(Exception e){
			System.out.println("Error");
			
		}
		

	}

}
