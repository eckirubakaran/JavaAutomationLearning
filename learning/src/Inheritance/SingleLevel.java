package Inheritance;

//Child Class is A
class A extends SingleLevel {
	 int b=200;
	 String Name="Karan";
	
}
// Main Public Class
public class SingleLevel {
	
	int a=100;
	String Name ="Gopi";
	
	

	public static void main(String []args) {
		
		
		A sl=new A();
		System.out.println(sl.a); 
		System.out.println(sl.b);
		
		
		
	}
	
	

}
