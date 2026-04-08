package excerise;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your Number :");
		
		int num=scan.nextInt();
		int revnum=0;
		int reversednum=num;
		
		while(num >0)
		{
			
			revnum=revnum*10 +num%10;
			num=num/10;
				
		}	
		
		if (reversednum==revnum) {
			
			System.out.println("This is a Palindrome Number " + revnum);
		}
		else {
			
			System.out.println("This is Not a Palindrome Number " + revnum);
		}
		
	
	
	}

}
