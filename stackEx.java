package collection;
import java.util.Stack;
/* 
 * this class has stack of collection class
 */
public class stackEx {

	 public static void main(String[] args) {

	        Stack<Integer> stack = new Stack<>();

	        stack.push(50);
	        stack.push(40);
	        stack.push(30);
	        stack.push(20);
	        stack.push(10);
	        System.out.println(stack);
	        System.out.println(stack.pop());
	        System.out.println(stack);
	        System.out.println(stack.peek());

	    }
}
