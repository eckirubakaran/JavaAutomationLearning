package abstractionAndInterface;


interface class1{
	
	
	default void One() {
		System.out.println("This is a Default Method..");
	}
	
	static void Two() {
		System.out.println("This is a Static Method..");
	}
	
	void Three();
}

interface class2 extends  class1{
	

	default void One1() {
		System.out.println("This is a Default1 Method..");
	}
	
	static void Two1() {
		System.out.println("This is a Static1 Method..");
	}
	
	void Three1();
}
public class InterfaceClass implements class2{

	
  public void Three() {
		System.out.println("This is a Abstract Method");
		
	}
  public void Three1() {
	  
	  System.out.println("This is a Abstract1 Method");
		
  }
  
  public static void main(String[] args) {
	  
	  
//	  Scenario 1
	  InterfaceClass obj=new InterfaceClass();
	  obj.One();
	  obj.Three();
	  obj.One1();
	  obj.Three1();
//	  if we call static method , need to class using interface.methodName
	  class1.Two();
	  class2.Two1();
	  
	  
//	  Scenario 2 and its usual approach
	  
	  class2 obj1=new InterfaceClass();
	  
	  obj1.One();
	  obj1.Three();
	  obj1.One1();
	  obj1.Three1();
//	  if we call static method , need to class using interface.methodName
	 class1.Two();
	 class2.Two1();
}
	
	

}
