package question2.main;

import question2.thread.Thankyou;
import  question2.thread.Welcome;

public class Main  {
	
	public static void main(String[] abc) {
		for (int i=1;i<6;i++) {
			try {
				Thankyou obj = new Thankyou();
				obj.start();
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println("Exception");
			}	
		}
		
		for (int i=1;i<4;i++) {
			try {
				Welcome obj = new Welcome();
				obj.start();
				Thread.sleep(4000);
			}
			catch(Exception e) {
				System.out.println("Exception");
			}	
		}
		
	}
}
