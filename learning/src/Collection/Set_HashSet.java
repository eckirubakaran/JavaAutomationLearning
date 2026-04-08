package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_HashSet  {

	public static void main(String[] args) {
		
		Set myset=new HashSet();
		
//		Removes the Duplicate
		myset.add(100);
		myset.add("String");
		myset.add(null);
		myset.add(100);
		myset.add("Welcome");
		myset.add(null);
		
		System.out.println(myset);
		
		
		myset.remove(100);
		System.out.println(myset);
		
//		getting specific value through List
		
		List list=new ArrayList(myset);
		
		System.out.println(list);
		System.out.println(list.get(2));
		
//		Iterator
		
		Iterator it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		clear
		myset.clear();
		
		System.out.println(myset.size());
		
		System.out.println(myset.isEmpty());

		
	}

}
