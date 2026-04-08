package overLoadingAndoverRiding;

// Here we just changing the Parameter with same method name  and it can acheive through polymorphism and as well as inhertiance

// through inheritance
class InheritOverLoading extends OverLoading{
	
	void ABC (int a , int b) {
		
		System.out.println( a + " "+ b);
	}
	
}

// with small class

public class OverLoading {
	
	void ABC (int a){
		
		System.out.println(a);
		
	}
	
	void ABC (int a , String b) {
		
		System.out.println( a + " "+ b);
	}
	
	
	
	public static void main(String[] args) {
		
		OverLoading obj=new OverLoading();
		
		obj.ABC(20);
		obj.ABC(10,"Kiruba");
		
		InheritOverLoading ob=new InheritOverLoading();
		ob.ABC(10,300);
		
		
		
	}

}
