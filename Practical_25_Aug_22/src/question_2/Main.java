package question_2;

public class Main {
	
	public static void main(String[] args) {
		
		RBI obj;
		obj = new SBI();
		System.out.println("SBI rate of interest : " + obj.getInterestRate());
		System.out.println("SBI withdrawal limit : " + obj.getwithdrawalLimit());
		obj = new ICICI();
		System.out.println("ICICI rate of interest : " + obj.getInterestRate());
		System.out.println("ICICI withdrawal limit : " + obj.getwithdrawalLimit());
		obj = new PNB();
		System.out.println("PNB rate of interest : " + obj.getInterestRate());
		System.out.println("PNB withdrawal limit : " + obj.getwithdrawalLimit());
		

	}

}

