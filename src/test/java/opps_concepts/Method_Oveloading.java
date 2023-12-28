package opps_concepts;

public class Method_Oveloading {
int a=2;
int b=4;
double c;
	public void sum() {
		
		System.out.println(a+b);
	}
	public void sum(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Method_Oveloading mo=new Method_Oveloading();
		mo.sum();
		mo.sum(10,20);
		

	}

}
