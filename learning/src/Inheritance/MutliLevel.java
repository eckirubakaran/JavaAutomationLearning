package Inheritance;

class one{
	
	void print() {
		System.out.println("A Class is Printing");
	}
}
class two extends one{
	
	void print0() {
		System.out.println("B Class is Printing");
	}
}
class three extends two{
	
	void print1() {
		System.out.println("C Class is Printing");
	}
}

public class MutliLevel {

	public static void main(String[] args) {
		
		three obj=new three();
		obj.print();
		obj.print0();
		obj.print1();
		
	}

}
