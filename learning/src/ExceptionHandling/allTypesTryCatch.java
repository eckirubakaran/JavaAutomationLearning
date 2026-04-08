package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class allTypesTryCatch {
	
	 static void ArithmeticException() {
		 
		 int a=200;
		 int b=0;
		 
		 try {
			 System.out.println(a/b);
		 }
		 catch (Exception e) {
			 System.out.println(e.getMessage());
		 }}
		 
	static void NullPointerException()	 {
		
		String name=null;
		
		try {
			 System.out.println(name.length());
		 }
		 catch (Exception e) {
			 System.out.println(e.getMessage());
		 }
		
		
	}
	
	static void throwsException()throws IOException  {}
		
	static void ArrayIndexOutOfBoundsException() {
		
		
		int a[]= {1,2,3,4};
		
		try {
		
		System.out.println(a.length);
		System.out.println(a[5]);}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		finally {
			
			System.out.println("Executing Finally Method");
		}
		
		
		try {
			FileInputStream file=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		}
		
	}
	 
	
	
	public static void main(String[] args) throws IOException {
		
		ArithmeticException();
		NullPointerException();
		ArrayIndexOutOfBoundsException();
		throwsException();
	}

}
