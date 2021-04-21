package collection;
 
/*  
 *  Java program to demonstrate
 *  working of LinkedHashSet
 */
import java.util.*;

class LinkedHashSetExample {

	public static void main(String args[])
		{
			// create an instance of LinkedHashSet
			LinkedHashSet<String> lhs
				= new LinkedHashSet<String>();

			// insert element in LinkedHashMap
			lhs.add("Amit");

			// insert first null key
			lhs.add(null);
			lhs.add("Vijay");
			lhs.add("Rahul");

			// insert second null key
			// which replace first null key value
			lhs.add(null);
			// insert duplicate
			lhs.add("Vijay");

			// create an iterator
			// iterate and print the elements
			Iterator<String> itr = lhs.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
}


