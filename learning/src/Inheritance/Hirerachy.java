package Inheritance;

class Parent{
	
	void par(int age) {
		
		System.out.println("Parent Age is  "+ age);
	}
}

class Child1 extends Parent{
	
	void par1(int age) {
		
		System.out.println("Child 1 Age is  "+ age);
	}
}

class Child2 extends Parent{
	
	void par2(int age) {
		
		System.out.println("Child2 Age is  "+ age);
	}
}

public class Hirerachy {
	
	public static void main(String[] args) {
		
		Child2 c2=new Child2();
		c2.par(50);
		c2.par2(20);
		
		Child1 c1=new Child1();
		c1.par(50);
		c1.par1(25);
		
		
	}

}
