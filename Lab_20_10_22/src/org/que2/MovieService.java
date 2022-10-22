package org.que2;

public class MovieService {
	
	public static boolean addMovie(Movietheatre movie) {
		boolean result=false;
		MovieDAO.addMovie(movie);
		return result;
	}
	
	public static Movietheatre[] displayMovie() {
		return MovieDAO.displayMovie();
	}

}
