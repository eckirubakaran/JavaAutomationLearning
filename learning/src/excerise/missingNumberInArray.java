package excerise;

public class missingNumberInArray {

	public static void main(String[] args) {
		
//		Array should be in range and no Duplicate Number
		
		int num[]= {1,2,3,4,5,6,7,9,10};
		
		int sum1=0;
		
		for (int value:num) {
			sum1=sum1+value;
		}
		
		System.out.println("Total  Array Sum is " + sum1);

	int sum2=0;
	
		for (int i=0;i<=10;i++) {
			
			sum2=sum2+i;
		}

		System.out.println("Total Sum is "+sum2);
		
		int first=sum2-sum1;
		
		System.out.println("First Missing number is "+ first);
		
		
}}
