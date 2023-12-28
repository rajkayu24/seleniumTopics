package stringprograms;
//interview they may ask this que indirectly like input is "abbcaaabc" 
//and output should be a4 or they may ask b3 or c2 

public class OccerenceOfCharInString {

	public static void main(String[] args) {
	String s="abbcaaabc";
	char ch[] =s.toCharArray();
	int len = ch.length;
	int count=0;
	for(int i=0;i<len;i++) {
		if(s.charAt(i)=='a') {
			count++;
		}
	}
	System.out.println("occerence of character a in given string:"+count);
	}
}
//similarly we can find occerence of any no which will ask in interview 
//if they ask b than u need to write b instead of a
//output==occerence of character a in given string:4
