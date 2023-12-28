package numberPrograms;

public class FibanoccieSereisUsingRecursion {
	static int a=0,b=1,c;
	
public void printFib(int i) {
		if(i>=1) {
			c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		printFib(i-1);
	}}
	
		public static void main(String[] args) {
	System.out.print(a+" "+b);
	
	FibanoccieSereisUsingRecursion b=new FibanoccieSereisUsingRecursion();	
	b.printFib(10);
		
	}

		
	}
	

