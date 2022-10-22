package org.que2;

import java.util.Objects;

public class Movietheatre {
	
	private String movieName;
	private float movieStartTime;
	private float movieEndTime;
	private double movieTicketPrice;
	
	
	public Movietheatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Movietheatre(String movieName, float movieStartTime, float movieEndTime, double movieTicketPrice) {
		super();
		this.movieName = movieName;
		this.movieStartTime = movieStartTime;
		this.movieEndTime = movieEndTime;
		this.movieTicketPrice = movieTicketPrice;
	}


	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(float movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	public float getMovieEndTime() {
		return movieEndTime;
	}
	public void setMovieEndTime(float movieEndTime) {
		this.movieEndTime = movieEndTime;
	}
	public double getMovieTicketPrice() {
		return movieTicketPrice;
	}
	public void setMovieTicketPrice(double movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}
	


	@Override
	public String toString() {
		return "Movietheatre [movieName=" + movieName + ", movieStartTime=" + movieStartTime + ", movieEndTime="
				+ movieEndTime + ", movieTicketPrice=" + movieTicketPrice + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(movieEndTime, movieName, movieStartTime, movieTicketPrice);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movietheatre other = (Movietheatre) obj;
		return Float.floatToIntBits(movieEndTime) == Float.floatToIntBits(other.movieEndTime)
				&& Objects.equals(movieName, other.movieName)
				&& Float.floatToIntBits(movieStartTime) == Float.floatToIntBits(other.movieStartTime)
				&& Double.doubleToLongBits(movieTicketPrice) == Double.doubleToLongBits(other.movieTicketPrice);
	}
	
	

}
