package question_1;

public class ArrayService {
	public  int calculateAverage(int arr[]) {
		int i,sum=0;
		for(i=0;i<5;i++) {
			sum=sum+arr[i];		
		}
		return sum/5;
	}
	
	
}


