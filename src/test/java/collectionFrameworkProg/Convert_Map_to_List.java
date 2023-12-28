package collectionFrameworkProg;

import java.util.*;
public class Convert_Map_to_List {

	public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        List<String> valueList = new ArrayList<String>(map.values());

        System.out.println("Key List: " + keyList);//Key List: [1, 2, 3, 4, 5]
        System.out.println("Value List: " + valueList);//Value List: [a, b, c, d, e]
	}

}
