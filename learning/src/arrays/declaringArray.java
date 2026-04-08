package arrays;

public class declaringArray {
    	
	public static void main(String[] args) {
	
//		Approach 1 of Declaring a Array	
			int a[]=new int[3];
			a[0]=100;
			a[1]=200;
			a[2]=300;		
				  
//			Approach 2 of Declaring a Array	    	
	    	String name[]={"Kiruba","Mohana","Eshwer"};
			
//			Finding the Length of the Array	
	    	
	    	System.out.println(name.length);
	    	System.out.println(a.length);
	    	
//	    	Read a single value from the Array
	    	
	    	System.out.println(a[2]);
	    	System.out.println(name[0]);
	    	
//	    	Read a Multiple Value from the Array - We can use Loop Concept
	    	
	    	for(int i=0;i<a.length;i++) {
	    		System.out.println(i);
	    		
	    	}
	    	
	    	for (String StoreName : name) {
	    		
	    		System.out.println(StoreName);
				
			}
	    	
		
//		
	}}


