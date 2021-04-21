package collection;
import java.util.*;
/* 
 *  this class has array list Iterator of collection class
 */
public class ListIteratorEx {
 public static void main(String[] argv) throws NullPointerException
    {
        try {
  
            // Creating object of List<Integer>
            List<Integer> arrlist = new ArrayList<>();
  
            // adding element to arrlist
            arrlist.add(1);
            arrlist.add(3);
            arrlist.add(6);
            arrlist.add(9);
  
            // print arrlist
            System.out.println("ArrayList: "
                               + arrlist);
  
            // Creating object of ListIterator<String>
            // using listIterator() method
            ListIterator<Integer>
                iterator = arrlist.listIterator();
  
            // Printing the iterated value
            System.out.println("\nUsing ListIterator:\n");
            while (iterator.hasNext()) {
                System.out.println("Value is : "
                                   + iterator.next());
            }
        }
  
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
