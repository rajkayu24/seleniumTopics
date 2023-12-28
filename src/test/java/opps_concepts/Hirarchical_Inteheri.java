package opps_concepts;

class Animal2{
	void eat() {
		System.out.println("i am eating");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("i am barking");
	}
}
class BabyDog2 extends Animal2{
	void run(){
		System.out.println("i am running");
	}
}
class Cow extends Animal2{
	void meow() {
		System.out.println("meow.....");
		}
	
}
public class Hirarchical_Inteheri {

public static void main(String[] args) {

	Dog2 d=new Dog2();
	d.eat();
	d.bark();
	BabyDog2 bd=new BabyDog2();
	bd.eat();
	bd.run();
	Cow c=new Cow();
	c.eat();
	c.meow();
	

		
}

}
