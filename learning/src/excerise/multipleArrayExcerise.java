package excerise;

import java.util.Arrays;
import java.util.Scanner;

public class multipleArrayExcerise {

	public void serachElementInArray() {

		int a[] = { 10, 100, 20, 250, 40, 60, 10 };
		int sreachElement = 2500;

//		This to print the element not found scenario
		boolean found = false;

		for (int i = 1; i < a.length; i++) {

			if (a[i] == sreachElement) {

				System.out.println("Element Found " + a[i]);
//				After founding the element , we are making the status to true
				found = true;
				break;
			}

		}

		if (found == false) {
			System.out.println("Element Not Found");
		}
	}
//	--------------------------------------------------------------------------------------------------------

	public void numberOfRepetations() {

		String alpha[] = { "a", "b", "c", "d", "A", "B", "a", "c", "B", "d" };
		String repeat = "a";
		int count = 0;

		for (String x : alpha) {

			if (x.equals(repeat)) {
				count++;
			}
		}
		System.out.println(count);
	}

//	------------------------------------------------------------------------------------------------------

	public void findTwoDimensionalArrayOccurance() {

		int a[][] = { { 1, 2 }, { 2, 4 }, { 4, 3 }, { 1, 2 }, { 4, 3 } };

		int count = 0;

		int repeat[] = { 4, 3 };

		for (int arr[] : a) {

			if (Arrays.equals(arr, repeat)) {

				count++;
			}

		}

		System.out.println(count);
	}
//	----------------------------------------------------------------------------------------------------------
	
//	Print Array in Reverse Order
	
	public void reverseArray(){
		
		int a[]= {1,2,3,4,5,6};
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.println(a[i]);
		}
		
		
		
	}
//	------------------------------------------------------------------------------------------------------------
	
//	Get a Input from User for Array Creation
	
	public void arrayCreationByUser() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Set Your Array lenght ");
		int arLenght=sc.nextInt();
		
		int a[]=new int[arLenght];
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println("Enter Your "+i +" Index Number");
			
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
//	Sorting a Arrays using Loop
//	Find the Missing Number in Array
//	Find largest and lowest number in Array
//	Find Second Largest Number in Array

	public static void main(String[] args) {

		multipleArrayExcerise obj = new multipleArrayExcerise();
//		obj.serachElementInArray();
//		obj.numberOfRepetations();
//		obj.findTwoDimensionalArrayOccurance();
//		obj.reverseArray();
		obj.arrayCreationByUser();

	}

}
