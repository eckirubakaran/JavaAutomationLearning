package thisandstatic;

public class ThisKeyowrd {
	
	int a;
	String name;
	
//	this keyword is used to refer the Class Variables
	
//	Constructor
//	if the class and constructor variables are different , don't need to use this keyword
	ThisKeyowrd(int Age , String Peru){
		
		a=Age;
		name=Peru;	
		
	}
	
//	if the class and constructor variables are same , we  need to use this keyword
	ThisKeyowrd( String name,int a){
		
	this.a=a;
	this.name=name;	
		
	}
	
	void dis() {
		
		System.out.println(a + " " +name);
	}
	
	

	public static void main(String[] args) {
		
//		ThisKeyowrd obj=new ThisKeyowrd(10 , "Kiruba");
		ThisKeyowrd obj=new ThisKeyowrd("Kiruba",23);
		obj.dis();
		
		
		
	}

}
