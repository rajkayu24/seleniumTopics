package collectionFrameworkProg;

import java.util.ArrayList;
import java.util.List;

public class Convert_List_to_Array {

	//AL TO ARRAY or List TO Array program will same 
		 public static void main(String[] args) {
// ArrayList<String> languages = new ArrayList<String>();//u can write any one st this or below
			 List<String> languages = new ArrayList<String>();

			    // Add elements in the list
			    languages.add("Java");
			    languages.add("Python");
			    languages.add("JavaScript");
			    System.out.println("List: " + languages);//List: [Java, Python, JavaScript]

			    // Create a new array of String type
			    String[] arr = new String[languages.size()];

			    // Convert ArrayList into the string array
			    languages.toArray(arr);
			    System.out.print("Array: ");
			    for(String item:arr) {
			      System.out.print(item+", ");//Array: Java, Python, JavaScript
			    }
			  }
			

	}

