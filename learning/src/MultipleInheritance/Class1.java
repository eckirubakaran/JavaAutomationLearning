package MultipleInheritance;

public class Class1 implements Interface1 ,Interface2 {

	@Override
	public void m3() {
		System.out.println("Print M3");
		
	}

	@Override
	public void m1() {
		System.out.println("Print M1");
		
	}
	
	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.m1();
		obj.m2();
		
		obj.m3();
		obj.m4();
		
		
		
	}

}
