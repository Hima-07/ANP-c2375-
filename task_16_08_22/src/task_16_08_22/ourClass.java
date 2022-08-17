package task_16_08_22;

public class ourClass {
	public void star() {
	System.out.println("Star");
}

public void displayInstriction() {
	System.out.println("DisplayInstruction");
	
}
public void exit() {
	System.out.println("Exit");
}



public static void main(String[] arg) {
	int menuInput =1;
	ourClass Demo1 = new ourClass();
	
	switch(menuInput) {		
	case 1:
		Demo1.star();
		break;
	case 2:
		Demo1.displayInstriction();
		break;
	case 3:
		Demo1.exit();
		break;
	default:
		System.out.println("Invalid Input this time");
		
	}
	
	
	
}
}


