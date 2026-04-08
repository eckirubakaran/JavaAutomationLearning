package pack1;

import java.util.Scanner;

public class ifPrgm {
	
	
	static void one() {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter you old height");
		
		int old=in.nextInt();
		
        System.out.println("Enter you New height");
		
		int New =in.nextInt();
		
		if (New > old) {
			
			int Your_New_Height=New;
			
			System.out.println("Your height is increased and new height is " + Your_New_Height +"CM");
		}
		else {
			System.out.println("Your height is not increased");
			
		}

	}
	
	static void two() {
		
		Scanner in=new Scanner (System.in);
		System.out.println("Welcome to the Portal : Please tell your Name");
		
		String name=in.nextLine();
		
		System.out.println("Your Lovely Name is "+ name);
		
		System.out.println("Are you male or female or Not to Dislosed?");
		
		String gender=in.nextLine();
		
		System.out.println("Your Gender is "+ gender);
		
		if(gender.equalsIgnoreCase("male")) {
			System.out.println("Hello Mr. "+ name);	
		}
		else if(gender.equalsIgnoreCase("female")) {
			System.out.println("Hello Lady. "+ name);	
		}
		else{
			System.out.println("You didn't disclosed Your gender");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		two();
		
		
	}

}
