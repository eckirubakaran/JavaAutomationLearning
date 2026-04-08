package TypeCasting;


class Main{}

class subOne extends Main{}

class subTwo extends Main{}

public class ObjectCasting {
	
	public static void main(String[] args) {
		
		
//		Three rules should match to Acheive ObjectCasting
		
//		subOne so=(subOne)main;
//		a      b     c      d
		
//		Rule 1: C and SHould	have some releationship like parent and Child
		
//		Rule 2:C should either match with A or should have relationship with parent Class (Main)
		
//		Rule 3:c should match the subone in line 26
		
		Main main=new subOne();
		
		subOne so=(subOne)main;
	}

}
