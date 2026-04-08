package thisandstatic;

public class StaticMain {
	

	public static void main(String[] args) {
		
//		StaticKeyword obj=new StaticKeyword();
		
//	if you want to call the Static Var and Methods in Another Class , we need to use Class Name before that	
		System.out.println(StaticKeyword.Name);
		StaticKeyword.print1();
		
		
	}

}
