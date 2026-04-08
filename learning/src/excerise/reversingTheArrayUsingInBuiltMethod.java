package excerise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class reversingTheArrayUsingInBuiltMethod {

	public static void main(String[] args) {
		int []a={1,40,39,58,20,37,56,93};
		
//		Reversing order in ascending order Approach 1
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
//		Reversing the Array ascending Approach 2
		
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		
		
//		Reversing order in descending order
		Integer []b={1,40,39,58,20,37,56,93};
		
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
	}

}
