package thisandstatic;

public class StaticKeyword {
//	Non Static Variables and Methods should call with  Object Creation
//	Static variables and Methods are call without Object Creation
	
	int a;
	static String Name="Karan";
	
	void print() {
		 
		System.out.println("This is Non - Static Method");
	}
	static void print1() {
		 
		System.out.println("This is Static Method");
	}


	
//	public static void main(String[] args) {
//		
//		StaticKeyword obj=new StaticKeyword();
//		obj.a=23;
//		System.out.println(obj.a);
//		System.out.println(Name);
//		print1();
//		obj.print();
//		
//	}

}
