package excerise;

public class findEvenOddNumberInArray {

	public static void main(String[] args) {
	
		int number[]= {1,2,3,4,5,6,7,8,9,0};
		
		for(int i=0;i<number.length;i++) {
			
			if(number[i]%2==0) {
				
				System.out.println("This is an Even Number "+number[i]);
			}	
			else {
				System.out.println("This is an Odd Number "+number[i]);
			}
			
		}

	}

}
