package opps_concepts;


interface A{
	void a();
	void b();
void c();

	
}
 class B implements A{

	public void a() {
		System.out.println("i am a");
	}

	public void b() {
		System.out.println("i am b");

		
	}

	public void c() {
		System.out.println("i am c");

	}
	
}
public class AbstractionUsingInterface1{

	public static void main(String args[]) {
		
	A a=new B();
	a.a();
	a.b();
	a.c();
	}}
