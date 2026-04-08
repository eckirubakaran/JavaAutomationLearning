package excerise;

import java.util.Scanner;

public class loopExcerise {
	
	/* Reverse a number
	 * plaidorme number
	 * count the number as digits
	 * count the number of even and odd digtis
	 * find the sum of digits
	 *  */
	
//	Reverse the String without Leading Zeros
	
	public void  revNumber() {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Your Reversing Number :");
		int x=in.nextInt();
		int revdigit=0;
		
		while(x>0) {
			
			revdigit=revdigit*10 + x%10;
			x=x/10;
		
			
		}
		System.out.println("The Reversed Number is "+revdigit);
		
	}
//	With leading Zeros
	
	public  void stringBuffer() {
		
Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Your Reversing Number :");
		
		String num=in.nextLine();
		
		StringBuffer rev = new StringBuffer(num);
		
		String revNumber=rev.reverse().toString();
		System.out.println(revNumber);
	}

	public static void main(String[] args) {
		loopExcerise obj=new loopExcerise();
		
//		obj.revNumber();
		obj.stringBuffer();
		
	}

}
