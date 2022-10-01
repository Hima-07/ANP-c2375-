package question1.exception;

public class InvalidNamedException extends Exception{
	String name;
	public InvalidNamedException(String name){
	    this.name = name;
	}
	@Override
	public String toString() {
	    return name + " " + "is invalid name";

		}
}
