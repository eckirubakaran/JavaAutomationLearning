package pack1;

public class demo1 {
	
	  int a = 1;
	 int b = 10;
	
	public void add() {
		
		System.out.println(a+b);
	}
	
	static void comp() { 
		        int i = 1;
		        int j = 2;
		        String k = "a";
		        System.out.println(i + j + k);
		        System.out.println(i + k + j);
		        System.out.println(k + i + j);
		    	
	}
	static void boo() {
		
		  int i = 4;
	        
	        i++;
	        
	        System.out.println(i);
	}

	public static void main(String[] args) {
		
		demo1 ob=new demo1();
		ob.add();
		comp();
		boo();
		

	}

}
