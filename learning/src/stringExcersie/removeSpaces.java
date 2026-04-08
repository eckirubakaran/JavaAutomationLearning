package stringExcersie;

import java.util.Arrays;

public class removeSpaces {

	public static void main(String[] args) {
	
		String s="Would    you like me   to  also explain   String   pool ";
		
		s=s.replaceAll("\\s", "");
		
		System.out.println(s);

	}

}
