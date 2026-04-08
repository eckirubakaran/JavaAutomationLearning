package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {
		
//		Heterogenious Data
//		List value=new ArrayList();
		List<Integer> value = new ArrayList<>();

//		Adding the Values

		value.add(1);
		value.add(2);
		value.add(199);
		value.add(null);
		value.add(1234);
		value.add(null);

		System.out.println(value);

//		Size 

		System.out.println(value.size());
//		add the value in middle

		value.add(4, 6789);

		System.out.println(value);

// replace the Values

		value.set(3, 9862);
		System.out.println(value);

// Getting the Single value

		System.out.println(value.get(3));

//  reading all elements

		for (Integer list : value) {
			System.out.println(list);
		}

//  Reading all value using Iterator

		Iterator it = value.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

//  Remove particular Elements

		List<Integer> list1 = new ArrayList<>();

		list1.add(9862);
		list1.add(null);

		value.removeAll(list1);

		System.out.println(value);
		
//		Remove all the elements
		
		value.clear();
		System.out.println(value);
	}

}
