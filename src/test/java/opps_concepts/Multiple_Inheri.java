package opps_concepts;

interface abc1{
	void show();
}
interface abc2{
	void show();
} 
public class Multiple_Inheri implements abc1,abc2{

	public void show() {
		System.out.println("i am abc");
		
	}
public static void main(String[] args) {
		Multiple_Inheri m=new Multiple_Inheri();
		m.show();
	}

	

}
