package question_3;

public class Main {
	static int ugcount = 0;
	static int pgcount = 0;
	static int dcount = 0;
	
	public static void countObject(Degree...object) {
		for (Degree obj : object) {
			if (obj instanceof undergraduate) {
				ugcount++;
			}
			else if(obj instanceof postgraduate) {
				pgcount++;
			}
			else if (obj instanceof Degree) {
				dcount++;
			}
			
			
		}
		System.out.println("The Number of UG object : "+ugcount);
		System.out.println("The Number of PG object : "+pgcount);
		System.out.println("the Number of Degree object : "+dcount);
	}
		public static void main(String[] abc) {
			
			Degree deg = new Degree();
			postgraduate ug = new postgraduate();
			undergraduate pg = new undergraduate();
			Degree deg1 = new Degree();
			postgraduate ug1 = new postgraduate();
			undergraduate pg1 = new undergraduate();
			undergraduate pg2 = new undergraduate();
			countObject(deg,ug,pg,deg1,ug1,pg1,pg2);
			
		}
		
	
	
	
	


}
