package interviewProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Prog to Remove duplicate from the array and convert into list
public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		String a[]= {"java","php","c++","java"};
		
		Set<String> set=new HashSet<String>(Arrays.asList(a));
		System.out.println("array without duplicete:"+set);
		
		List<String> li=new ArrayList<String>(set);
		
		System.out.println("array in list form:"+li);
		
		
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
					
				}
			}
		}*/

	}

}
