package excerise;

public class largestAndSmallestNumberInArray {

	
	public static void Largest() {
		
		int a[]= {1,2,3,4,5,6,7,8,99,44,3,4,76,16,98,56,100,333,64};
		
		int largest=a[0];
		
		for(int value:a) {
			
			if (value>largest) {
				
				largest=value;
			}
		}
		
		System.out.println("The largest Number is "+ largest);
		
	}
	public static void main(String[] args) {
		Largest();
		
	}

}
