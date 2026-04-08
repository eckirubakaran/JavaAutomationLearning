package stringExcersie;

public class ReverseString {

	String Name="Kiruba Karan";
	String ReversedName="";
	
	
	public void directMethod() {
		
		for(int i=Name.length()-1;i>=0;i--) {
			
//	char newName=Name.charAt(i);
//	String Reversedname=ReversedName+newName;
//	System.out.println(Reversedname); it will print each word in each line
			
//	ReversedName=ReversedName+Name.charAt(i);
			
		}
		System.out.println(ReversedName); // it will print in one line
		
		
		
	}
	
	public void charArray() {
		
		
		char a[]=Name.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			
			ReversedName=ReversedName+a[i];
		}
		System.out.println(ReversedName);
	}
	
//	Using String Buffer
	
	public void stringBuffer() {
		
		StringBuffer s=new StringBuffer(Name);
		System.out.println(s.reverse());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString obj=new ReverseString();
//		obj.directMethod();
//		obj.charArray();
		obj.stringBuffer();

	}

}
