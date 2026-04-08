package WrapperClass;

// Wrapper is coverting the String(Object ) to Primitive types and Primitive TYpes to Object

public class StringToPrimitiveTYpes {
	
	static String s="Hello";
	static String s1="123456";
	 static String tf="true";
	 
	 static String s3=new String("World");
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println(Integer.parseInt(s1));
		System.out.println(Double.parseDouble(s1));
		System.out.println(Long.parseLong(s1));
		System.out.println(Boolean.parseBoolean(tf));
//		String cant covert to Char
//		System.out.println(Character.parsechar);
		
		System.out.println(Boolean.parseBoolean(s3)); 
	}

}
