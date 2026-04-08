package overLoadingAndoverRiding;

//Here we not changing the Parameter and method name  and it can acheive through  inhertiance only 


class one
{
	void one1() {
		
		System.out.println("Printing One1");
	}


}


class two extends one

{
	@Override
	void one1() {
		
		System.out.println("Printing One2");
	}


}


public class OverRiding {

	public static void main(String[] args) {
		
		two ob=new two();
		ob.one1();
		
	}
}
