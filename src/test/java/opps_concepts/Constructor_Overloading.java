package opps_concepts;

public class Constructor_Overloading {
int a=10;
int b=10;
	
	Constructor_Overloading(){
	System.out.println(a);	
	
	}
Constructor_Overloading(int a){
		System.out.println(a);
	}
Constructor_Overloading(int a,int b){
	System.out.println(a+b);
}

public static void main(String[] args) {
	Constructor_Overloading co1=new Constructor_Overloading();
	Constructor_Overloading co2=new Constructor_Overloading(10);
	Constructor_Overloading co3=new Constructor_Overloading(10,20);
	
		
}
}
