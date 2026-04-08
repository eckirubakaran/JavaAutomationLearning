package WrapperClass;

public class PrimitiveTypesToString {
	
	int a =10;
	short b=1234;
	long c=1234567;
	double d=10.20;
	float e=100.400f;
	char f='Z';
	boolean g=false;
	
	public void intToString() {
		
		System.out.println("Before "+ a);
		
		String s=String.valueOf(a);
		 System.out.println( "After "+ a);
	}
	
	
public void intToshort() {
		
		System.out.println("Before "+ b);
		
		String s=String.valueOf(b);
		 System.out.println( "After "+ b);
	}
public void intTolong() {
	
	System.out.println("Before "+ c);
	
	String s=String.valueOf(c);
	 System.out.println( "After "+ c);
}
public void intTodouble() {
	
	System.out.println("Before "+ d);
	
	String s=String.valueOf(d);
	 System.out.println( "After "+d);
}
public void intTofloat() {
	
	System.out.println("Before "+ g);
	
	String s=String.valueOf(g);
	 System.out.println( "After "+ g);
}
public void intToboolean() {
	
	System.out.println("Before "+ f);
	
	String s=String.valueOf(f);
	 System.out.println( "After "+ f);
}
public void intTochar() {
	
	System.out.println("Before "+ a);
	
	String s=String.valueOf(a);
	 System.out.println( "After "+ a);
}
	public static void main(String[] args) {
		PrimitiveTypesToString obj=new PrimitiveTypesToString();
		
		obj.intToString();
		obj.intToboolean();
		obj.intTochar();
		obj.intTodouble();
		obj.intTolong();
		obj.intToshort();
		
		
	}

}
