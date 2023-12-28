package collectionFrameworkProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_Array_to_List {

	 public static void main(String[] args) {

		    // create an array
		    String[] array = {"Java", "Python", "C"};
		    System.out.println("Array: " + Arrays.toString(array));//Array: [Java, Python, C]

		    // convert array to list
		    List languages= new ArrayList<>(Arrays.asList(array));//Here, the asList() method of the Arrays class
		    // converts the specified array into a list.

		    System.out.println("List: " + languages);//List: [Java, Python, C]

		  }
}
