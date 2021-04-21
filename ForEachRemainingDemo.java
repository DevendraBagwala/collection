package collection;

import java.awt.List;
import java.util.Arrays;
import java.util.Iterator;

/* 
 * this class has ForEachRemaining of collection class
 */
public class ForEachRemainingDemo {

	public static void main(String[] args) {
	    java.util.List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
	    Iterator<Integer> itr = ((java.util.List<Integer>) input).iterator();
	    itr.forEachRemaining(num -> System.out.println(num));
	  }
}
