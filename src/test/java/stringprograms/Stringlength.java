package stringprograms;

public class Stringlength {

	public static void main(String[] args) {
		String s="sheetal";
		 char ch[]=s.toCharArray();
		 int count=0;
		 for(int i=0;i<ch.length;i++) {
			 count++;
		 }
	System.out.println("the length of string is:"+count);
	}

}
