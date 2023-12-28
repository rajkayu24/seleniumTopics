package opps_concepts;

class Animal1{
	void eat() {
		System.out.println("i am eating");
	}
}
 class Dog1 extends Animal1{
void bark() {
	System.out.println("i am barking");
}
}
class BabyDog extends Dog1{
	void run() {
		System.out.println("i am running");
	}
}


public class Multilevel_Inheri {

	public static void main(String[] args) {
	BabyDog b=new BabyDog();
	b.eat();
	b.bark();
	b.run();
	}

}

