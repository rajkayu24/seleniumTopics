package javaconcepts;

public class Conditionalstatements {

	public static void main(String[] args) {
		//use of-- if else
		/*
		int age=18;
		if(age>=18)
		{
			System.out.println("eligible for vote");
		}
		*/
	
		//use of-- if else 
     	/*	
		int age=12;
		if(age>=18)
		{
			System.out.println("eligible for vote");
		}else {
			System.out.println("not eligible for vote");
		}
	    */
		
		//use of--  nested if else	
	/*	int number=12;
		if(number>0)
		{
			System.out.println("number is positive");
		}else if(number<0) {
			System.out.println("number is negative");
		}else{
			System.out.println("number is zero");
		}
		
		*/
		

		//use of--switch case
	int day=1;
			
		switch(day)
		{
			case 1: System.out.println("sunday");break;
			case 2: System.out.println("monday");break;
			case 3: System.out.println("Tuesday");break;
			case 4: System.out.println("Wednesday");break;
			case 5: System.out.println("Thursday");break;
			case 6: System.out.println("Friday");break;	
		    default:
			System.out.println("Saturday");
	 }
	}
}