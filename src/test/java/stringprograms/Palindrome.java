package stringprograms;


public class Palindrome {

	public static void main(String[] args) {
		  String original="madam", reverse = ""; // here in reverse value inside double quote there should not be space 
	        
	     int length = original.length();   
	     
	     for ( int i = length - 1; i >= 0; i-- ) 
	      {
	         reverse = reverse + original.charAt(i);  
	      }
	      
	    
	       if (original.equals(reverse)) 
	        {
	        System.out.println("Entered string/number is a palindrome.");  
	        } else { 
	         System.out.println("Entered string/number isn't a palindrome.");   
	      }
	   }  
	}  