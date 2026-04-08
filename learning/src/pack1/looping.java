package pack1;

import java.util.Scanner;

public class looping {

	public static void whileLoop() {

		int a = 1;

		while (a <= 10) {

			System.out.println("Hello");
			a++;
		}
	}

	public void ifwhileloop() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your Starting Value");

		int Start = input.nextInt();

		System.out.println("Enter your Ending  Value");

		int End = input.nextInt();

		while (Start <= End) {

			if (Start % 2 == 0) {

				System.out.println("The Even Number is " + Start);

			} else {
				System.out.println("This is Not an Even Number " + Start);
			}
			Start++;
		}
	}
	
	public void decrementWhile()
	{
		int i=10;
		
		while(i>=1) {
			
			System.out.println(i);
			i--;
		}
	}
		
		public void doWhile() {
			
			
			int i=20;
			do {
				
				System.out.println(i);
				i--;
			}while(i>=1);
			
		}
		
		public void forOddEven() {
			
			
			for(int i=2;i<=20;i++) {
				
				
				if (i%2==0) {
					
				System.out.println("This is an Even Number " + i);
				}
				else {
					System.out.println("This is an  Number " + i);
					
				}
			}
		}
		
		public void forDec() {
			
			for (int i=10;i>=1;i-=2) {
				
				System.out.println(i);
			}
		}
		
		public void continueJump() {
			
			for (int i=1;i<=10;i++) {
				
				if (i==3 ||i== 5  || i==7 ) {
					
					continue;
				}
				System.out.println(i);
			}	
			
		}
		
		
	
	public static void main(String[] args) {

//		whileLoop();
		looping obj = new looping();
//		obj.ifwhileloop();
//		obj.decrementWhile();
//		obj.doWhile();
//		obj.forOddEven();
//		obj.forDec();
		obj.continueJump();
	}

}
