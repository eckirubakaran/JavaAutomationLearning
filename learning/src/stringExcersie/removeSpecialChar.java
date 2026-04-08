package stringExcersie;

public class removeSpecialChar {

	public static void main(String[] args) {
		String s="https://youtu.be/dTWfNdfpr_g";
		
	s=s.replaceAll("[^A-Za-z0-9]", "");
	
	System.out.println(s);

	}

}
