package collection;
/* 
 * 	 Java program to demonstrate
 *     working of LinkedHashMap
 */
	 
import java.util.*;

class LinkedHashMapExample {
public static void main(String args[])
	{

			// create an instance of LinkedHashMap
			LinkedHashMap<Integer, String> lhm;
			lhm = new LinkedHashMap<Integer, String>();

			// insert element in LinkedHashMap
			lhm.put(100, "Amit");

			// inser first null key
			lhm.put(null, "Ajay");
			lhm.put(101, "Vijay");
			lhm.put(102, "Rahul");

			// insert second null key
			// which replace first null key value
			lhm.put(null, "Anuj");

			// insert duplicate
			// which replace first 102 key value
			lhm.put(102, "Saurav");

			// iterate and print the key/value pairs
			lhm.entrySet().stream().forEach((m) -> {
				System.out.println(m.getKey() + " "
								+ m.getValue());
			});
		}
}
