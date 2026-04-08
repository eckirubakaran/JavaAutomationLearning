package excerise;

import java.util.Scanner;

public class primeNumberCheck {

	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter You Number :");
		int num=scan.nextInt();
		
		int count=0;
		
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				
				if (num%i==0) {
					count=count+1;
				}
			}
			
			if (count == 2) {
				
				System.out.println( num + " is a Prime Number");
			}
			else{
				
				System.out.println( num + " is not a Prime Number");
			}
			
		}else {
			
			System.out.println(num +" is not a Prime Number");
		}
	}
}
