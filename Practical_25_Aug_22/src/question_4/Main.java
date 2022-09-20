package question_4;

public abstract class Main implements Attackable {
	
	public static void main (String[] abc) {
		
		Attackable obj = new Sword();
		obj.attack();
		Attackable obj1 = new Knife();
		obj1.attack();
		Attackable obj2 = new Gun();
		obj2.attack();
		
	}

}
