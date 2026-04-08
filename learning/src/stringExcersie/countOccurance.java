package stringExcersie;

public class countOccurance {

	public static void main(String[] args) {
		
     String s="Use when you want to check if two references point to the same object";
     
     char des='t';
     
     int count=0;
     
    for (int i=0;i<=s.length()-1;i++){
    	 
    	char req=s.charAt(i);
    	
    	if(des==req) {
    		
    		count++;
    	}
    		 
     }
    System.out.println(count);
	}
}
