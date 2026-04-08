package inheritExcerises;

class Person{
	
	String name ="Gopika";
	int age = 17;
	void intro() {
		System.out.println("Hi I am"+ name +" ," +"age "+ age);
	}
}

class Student extends Person{
	
	int grade= 11;
	
	void study( ) {
		
		System.out.println(name +"is studying in grade"+ grade);
	}
}

class CollegeStudent extends Student{
	
	String college ="KSR";
	
	void attendLecture() {
		
		System.out.println(name+" attends lecture at "+college + "College");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		
		CollegeStudent obj=new CollegeStudent();
		obj.intro();
		obj.study();
		obj.attendLecture();
		
	
	}

}
