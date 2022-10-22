package org.que2;

import java.util.Scanner;

public class MovietheatreView {
	
	static Scanner sObj = new Scanner(System.in);
	
	public static boolean addMovie() {
		
		System.out.println("Enter movie Name");
		String movieName = sObj.nextLine();
		
		System.out.println("Enter Start Time of Movie");
		float movieStartTime=sObj.nextFloat();
		
		System.out.println("Enter End Time of Movie");
		float movieEndTime = sObj.nextFloat();
		
		System.out.println("Enter the Price of ticket");
		double moviePrice =sObj.nextDouble();
		
		System.out.println("  ");
		
		Movietheatre movie=new Movietheatre(movieName,movieStartTime,movieEndTime,moviePrice);
		MovieService.addMovie(movie);
		return true;
	}
	
	public static Movietheatre[] displayMovie() {
		return MovieService.displayMovie();
	}
}
