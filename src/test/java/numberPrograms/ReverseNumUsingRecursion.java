package numberPrograms;

public class ReverseNumUsingRecursion {

	public static void revnum(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}else {
			System.out.print(num%10);
			revnum(num/10);
			
		}
	}
	
	public static void main(String[] args) {
	revnum(123);
	}
	}
	

