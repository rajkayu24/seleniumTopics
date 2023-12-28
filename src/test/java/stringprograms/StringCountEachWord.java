package stringprograms;

public class StringCountEachWord {

	public static void main(String[] args) {
	 String st ="Welcome to hyderabad";
	
	// char ch[]=st.toCharArray();
	int count=1;
	for(int i=0;i<st.length();i++)
	{
		if(st.charAt(i)==' '&& st.charAt(i+1)!=' ')
		{
			count++;
		}
	}
	 System.out.println("no. of word in string:"+count);
	}

}
