package encapsulation;

public class One {
	
	
	private String Name;
	private int Age;
	
//	Approach One , Using Constructor
	
//	One(String n , int a){
//		
//		Name =n;
//		Age = a;
//	}
//	String print() {
//		
//		return (Name + Age);
//	}
//	------------------------------------------------------
	
//	Approach Two , Using Method Only in Same Class
	
	public void print1() {
		
		Name="Kiruba";
		Age =22;
		
		System.out.println((Name + Age));
	}
//	-----------------------------------------------------

	
	
//	Approach Three , if you want use in another class , we need to use getter and setter Method
	
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this .Age = Age;
	}
	
//	public static void main(String[] args) {
//		
//		One obj=new One("Kiruba" , 22);  constructor
//		System.out.println(obj.print());
	
//		obj.print1();
//		
//		
//		
//	}

}
