package TypeCasting;

public class PrimitiveTypesCasting {

	public static void main(String[] args) {
		
		
//		UpCasting
		
		int intValue=32119;
		
		long longValue=intValue;
		
		System.out.println(longValue);
		
		float floatValue=200.083f;
		double doubleValue=floatValue;
		System.out.println(doubleValue);
		
		
//		DownCasting
		
		long longValue1=1234567890;
		
		int intValue1=(int)longValue1;
		
		System.out.println(intValue1);
		
		byte byteValue=(byte)longValue1;
		
		System.out.println(byteValue);
		
		
		
		double doubleValue1=1234.97857457;
		float floatValue1=(float)doubleValue1;
		System.out.println(floatValue1);
		

	}

}
