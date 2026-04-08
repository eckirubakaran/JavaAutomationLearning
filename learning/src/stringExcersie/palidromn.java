package stringExcersie;
import java.util.Scanner;

public class palidromn {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your String Value:");
		String word=scan.nextLine();
		String rev="";
		
		for(int i=word.length()-1;i>=0;i--) {
			
			rev=rev+word.charAt(i);
		}
		
		if(rev.equals(word)) {
			
			System.out.println(rev+" and "+ word +" are the Palidrome");
		}
		else
		{
			System.out.println("Its not a Palidrom");
		}		

	}

}
