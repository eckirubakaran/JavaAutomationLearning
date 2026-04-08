package abstractionAndInterface;

public abstract class abstractClass {

	abstract void class2();

	public void class1() {

		System.out.println("class 1 is Calledd...");
	}
}
	class objectCalling extends abstractClass {

		@Override
		void class2() {
			System.out.println("Abstract Method is calling");

		}
		
		public static void main(String[] args) {
			
			objectCalling obj=new objectCalling();
			obj.class1();
			obj.class2();
		}

	}

