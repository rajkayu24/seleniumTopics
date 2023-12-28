package stringprograms;
import java.util.*;
public class OccerenceOfEachCharInString {

	public static void main(String[] args) {
		String s="testing selenium";
		//replace the whitespace
		s=s.replace(" ", "");
		char ch[]=s.toCharArray();
		int count=0;
		Map<Character,Integer> m=new HashMap<Character,Integer>();
	    
		for(int i=0;i<ch.length;i++) {
		count=0;
	    for(int j=0;j<ch.length;j++) {
		if(ch[i]==ch[j]) {
			count++;
		}
		
	}
	m.put(ch[i],count);
	
	}

System.out.println(m);
	}

}
