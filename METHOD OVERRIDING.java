package code;


//METHOD OVERRIDING
 public class Vehicle {
	 void run() {
		System.out.println("Vehicle is running");
	}
}
	class bike extends Vehicle {
		 void run() {
			System.out.println("bike is running");
		
		 }
		
	public  static void main(String[] args) {
//		Vehicle v= new Vehicle();
//		v.run();
	
	bike b= new bike();
	b.run();
		
	}

	}
