package question3.main;

public class Main {

	public static void main(String[] abc) {
		
		Runnable myThread = ( ) -> {
			System.out.println("Welcome to Lambda expression Thread ");
        };
        Thread obj = new Thread(myThread);
        obj.start();
    }
}


