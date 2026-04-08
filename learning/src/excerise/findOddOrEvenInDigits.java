package excerise;

public class findOddOrEvenInDigits {
	
	public static void main(String[] args) {
		
		
		int num=24689;
		
		int evenNumber=0;
		int oddNumber=0;
		
		while (num!=0) {
			
			int dignum=num%10;
			num=num/10;
			
			if (dignum%2==0) {
				
				evenNumber=evenNumber+1;
			}
			else {
				oddNumber=oddNumber+1;
			}
			
			
		}
		
		if(evenNumber>1) {
			
			System.out.println("The Even Number counts are " + evenNumber);
		}
		else {
			
			System.out.println("The Even Number count is "+ evenNumber);
		}
		
        if(oddNumber>1) {
			
			System.out.println("The Even Number counts are " + oddNumber);
		}
		else {
			
			System.out.println("The Even Number count is "+ oddNumber);
		}
		
		
	}

}
