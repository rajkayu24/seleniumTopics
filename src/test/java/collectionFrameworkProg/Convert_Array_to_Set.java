package collectionFrameworkProg;
import java.util.*;
import java.util.Arrays;
import java.util.Set;

public class Convert_Array_to_Set {

	public static void main(String[] args) {
		 String[] array = {"a", "b", "c"};
	        Set<String> set = new HashSet<>(Arrays.asList(array));

	        System.out.println("Set: " + set);//Set: [a, b, c]
	    }
	
	}

