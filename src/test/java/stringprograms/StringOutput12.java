package stringprograms;

public class StringOutput12 {
	public static void main(String[] args) {
		String s="123dheeraj123";//actual lentgh is 13
		
		String revString="";
		
	char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>0;i--)//for(int i=7-1;i>0;i++) means index 6th se start hokar index 1 tak 
		{
			revString=revString+ch[i];
			
		}
		System.out.println(revString);//321jareehd32-->lenght 12 which we want as a output
		System.out.println(revString.length());//string length 12 because total length of string is 13
		//but  we read data from 12 th index to 1 only we didnot include 0 th index so no 1 it did not consider 
		
	}
	}

