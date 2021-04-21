package collection;
import java.util.*;
/* 
 * this class has Map of collection class
 */
public class MapExample {

	 public static void main(String args[]){  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Devendra");  
		  map.put(101,"Pravin");  
		  map.put(102,"Nishant");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
