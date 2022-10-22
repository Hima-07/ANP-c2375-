package org.que2;

public class MovieDAO {
	
	static Movietheatre MovieArr[] =new Movietheatre[70];
	
	public static boolean addMovie(Movietheatre movie) {
		boolean result = false;
		
		for(int i=0;i<MovieArr.length;i++) {
			if(MovieArr[i]==null) {
				MovieArr[i]=movie;
				return true;
			}
		}
		return result;
	}
	public static Movietheatre[] displayMovie() {
		return MovieArr;
	}

}
