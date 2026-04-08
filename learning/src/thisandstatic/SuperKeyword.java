package thisandstatic;


class class1{
	

	
	
	int a;
	String Name="Kiruba";
	
	public void main1() {
		
		System.out.println("Calling Main1 Method...");
		System.out.println( a+ " " + Name);
	}
}
public class SuperKeyword extends class1 {
	
	

	int a;
	String Name="Karan";
	
	public void main1() {
		
		super.a=11;
		super.main1();
		
		
		System.out.println("Calling SuperKeyword Method...");
		System.out.println( a+ " " + Name);
	}

	public static void main(String[] args) {
		
		
		SuperKeyword SK=new SuperKeyword();
		SK.a=10;
		SK.main1();

	}

}
