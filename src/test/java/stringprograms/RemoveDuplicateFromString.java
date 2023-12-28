package stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str="coconut";
		
	Set<Character> set=new LinkedHashSet<Character>();
	 for(int i=0;i<str.length();i++) {
		 set.add(str.charAt(i));//c o n u t
		 
	 }
	 
StringBuffer sb=new StringBuffer();

for(Character c:set)
{
     sb.append(c);//conut
}
System.out.println("String text after removing the duplicate character:"+sb);
 }
}
