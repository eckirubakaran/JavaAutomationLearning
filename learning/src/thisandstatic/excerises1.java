package thisandstatic;

public class excerises1 {
	
	 String testName;
	 static int testcount;
	 
	 excerises1(String testName){
		 
		 this.testName=testName;
		 testcount++;
	 }
	 
	 static int count1() {
		 return testcount;
	 }
	public static void main(String[] args) {
		
		excerises1 t1 = new excerises1("Login Test");
		excerises1 t2 = new excerises1("Login Test");
		System.out.println(count1());
		
		
	}

}
