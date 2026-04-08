package arrays;

public class multiDimensional {

	public static void main(String[] args) {

//		Declaring a Array - Approach 1
		
		String name[][]=new String[4][2];
		
		name[0][0]="Kiruba";
		name[0][1]="Karan";

		name[1][0]="MS";
		name[1][1]="Dhoni";

		name[2][0]="Virat";
		name[2][1]="Kohli";

		name[3][0]="Rohit";
		name[3][1]="Sharam";
		
		System.out.println(name[1][1]);
		
//		Approach 2
		
		String name1[][]= {{"ab","cd"},{"ef","gh"},{"ij","kl"}};
		
		
// 		Find the Length
		
		System.out.println(name.length); // Rows Counts
		System.out.println(name[1].length); // Column Counts
		
//		Read a Single Value
		
		System.out.println(name[0][0]);
		
//      Read a Multiple Value
		
		for (int r=0;r<=name.length-1;r++) {
			
			for(int c=0;c<=name[r].length-1;c++) {
				
				System.err.print(name[r][c] + "   ");
			}
			System.out.println();
				
		}
		
		for(String arr[]:name1) {
			
			for(String x:arr) {
				
				System.out.print(x +"  ");
			}
			System.out.println();
		}
		
	}

}
