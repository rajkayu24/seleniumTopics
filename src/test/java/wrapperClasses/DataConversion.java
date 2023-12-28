package wrapperClasses;

public class DataConversion {

	public static void main(String[] args) {
		
		//Convert  String to fundamental data type 
		
		//convert String to int
		String s="123456";//this is string 
		System.out.println(Integer.parseInt(s));//123456-this is number
	   
		/*	
		String s1="Welcome";
		System.out.println(Integer.parseInt(s1));// java.lang.NumberFormatException
	
		//convert String to double******
		
		String s2="Automation";
		System.out.println(Double.parseDouble(s2)); //java.lang.NumberFormatException
		*/
		
		String s3="12340";
		System.out.println(Double.parseDouble(s3));//12340.0
		
		//note:-String to char conversion not possible
				
		//similarly other conversions also happen.....
		
		//Now,Convert fundamental data type to String*********************
		
		//Convert int to String****************
		
		int i=80;
		System.out.println(String.valueOf(i));//80<-this is String
		//here the valueOf() method convert any data type to String 
		float f=80.4f;
		System.out.println(String.valueOf(f));//80.4<-this is String
		
		char c='a';
		System.out.println(String.valueOf(c));//a<-this is string
		boolean b=true;
		System.out.println(String.valueOf(b));//true<-this is string 
		
	}
}
