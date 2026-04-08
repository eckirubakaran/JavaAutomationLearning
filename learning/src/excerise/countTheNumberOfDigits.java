package excerise;

import java.util.Scanner;

public class countTheNumberOfDigits {
	
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your Number :");
		
		int num=scan.nextInt();
		int count=0;
		
		while(num >0) {
			num=num/10;
			count=count+1;
			
		}
		
		
		System.out.println("The Total Digits are " + count);
		
	}

}
