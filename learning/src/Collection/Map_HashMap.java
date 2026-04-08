package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {

	public static void main(String[] args) {
		
		Map<Integer , String> hm=new HashMap<Integer , String>();
		
		hm.put(101, "Vanitha");
		hm.put(102, "Kiruba");
		hm.put(103, "Manjula");
		hm.put(104, "Hari");
		hm.put(105, "Dharani");
		
		System.out.println(hm);
		
//		size
		System.out.println(hm.size());
		
//		remove a pair
		
		hm.remove(105);
		System.out.println(hm);
		
//		get a value using key
		
		System.out.println(hm.get(101));
		
//		get all the keys only
		
		System.out.println(hm.keySet());

//		get all the value
		
		System.out.println(hm.values());
		
//		get all the keys and value in set
		
		System.out.println(hm.entrySet());
		
//		using for each
		
		for(Object value:hm.entrySet()) {
			
			System.out.println(value);
		}
		

		
	
	}

}
