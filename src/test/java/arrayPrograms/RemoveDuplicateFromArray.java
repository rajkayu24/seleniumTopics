package arrayPrograms;

import java.util.*;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
	int a[]= {2,3,4,5,6,5,4,7,2,4};
	
	Set<Integer> set=new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		set.add(a[i]);
	}
	Integer b[]=new Integer[set.size()];//here u r creating array of same size of set
	set.toArray(b);//here u r copying value from set into array b
	System.out.println(Arrays.toString(b));
	

	}

}
