package excerise;

import java.util.Arrays;

public class arraySortingUsingLoop {
	
	
//	public static void sort() {
//		int a1[]= {37,87,43,90,34,17,30,48};
//		
//		Arrays.sort(a1);
//		
//		System.out.println(Arrays.toString(a1));
//		
//		
//		
//	}

	public static void main(String[] args) {
		
//		sort();

		
		
		int a[]= {37,87,43,90,34,17,30,48};
		
//		this loop is used to move the largest element to last position
		for(int i=0;i<a.length-1;i++) {
			
//			this loop is used to compare the values in array
			for(int j=0;j<a.length-1;j++) {
				
//				Symbol only different for ascending and descending order
			if(a[j]>a[j+1]) {    // ascending order
				
//				if (a[j]<a[j+1]])	{    Descending order
				
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(a));

	}

}
