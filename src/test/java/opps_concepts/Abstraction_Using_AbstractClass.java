package opps_concepts;

abstract class Bike{

	 abstract void run();
}
class Honda extends Bike{

@Override
void run()
{
		System.out.println("honda bike is running");
}
	
	
}
class Abstraction_Using_AbstractClass{
	public static void main(String[] args) {
		Bike b=new Honda();
		b.run();
		
	}}


