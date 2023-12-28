package opps_concepts;

//methodOverriding
class Vehicle{
	  void run() {
		System.out.println("Vehicle is running");
	}
}

public class Bike1 extends Vehicle {
void run() {
	
System.out.println("bike is running");
}
	public static void main(String[] args) {
		Bike1 b=new Bike1();
		b.run();
	}

}
