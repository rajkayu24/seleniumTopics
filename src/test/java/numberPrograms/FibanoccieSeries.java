package numberPrograms;
//write a program for Fibannoccie series 1 to 10
public class FibanoccieSeries {

	public static void main(String[] args) {
	int a=0,b=1,c,n=10;
	System.out.print(a+" "+b);
	
	for(int i=3;i<=10;i++) {
      c=a+b;
      System.out.print(" "+c);
		a=b;
        b=c;
        
	}

}}
