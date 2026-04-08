package inheritExcerises;


class car extends Vehicle{
	int doors = 4;
	
	void honk() {
		
		System.out.println("Car is honking: Beep Beep!");
	}
}

public class Vehicle {
	
	
	String brand ="KWID";
	int speed =120;
	void move() {
		 
		 System.out.println(brand + " Is Moving !");
	 }
	
	

	public static void main(String[] args) {
		
		car obj=new car();
		
	System.out.println("Brand: "+ obj.brand);
	System.out.println("Speed: "+ obj.speed);
	System.out.println("Doors: "+ obj.doors);
	obj.move();
	obj.honk();
	}

}
