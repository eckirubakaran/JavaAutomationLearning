package excerise;

import java.util.Arrays;

public class sumOfDigits {

	public static void main(String[] args) {
		
		int num=56783;
		
		int total=0;
		
		while(num !=0) {
			
			total = total+num%10;
			num=num/10;
		}
		
		System.out.println("The Total of the Digits is " + total);

//		
//		String s="Hello World";
//		System.out.println(s.substring(0,4));'
		
		String name="Kiruba Karan";
		
		String name1=name.toLowerCase();
		String arr[]=name1.split("");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0].equals("kiruba"));
	}

}
