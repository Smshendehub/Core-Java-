package demo;
import java.util.*;

public class CollectionFramework2 {

	public static void main(String[] args) {
		// Creating Stack in Framework  it use last-in-first-out(LIFO).
		Stack<String> s1=new Stack<String>();
        // In stack we use push to add and pop to remove
		s1.push("mamppu");
		s1.push("bro");
		s1.push("love");
		s1.push("you");
		System.out.println(s1);  //output-->[mamppu, bro, love, you]
		 
	    s1.pop();  // It uses last in first out "you" removed 
		System.out.println(s1); // output-->[mamppu, bro, love]
	
	 System.out.println(s1.peek()); // to push element to top it is use  output---> love
	 // to search in stack 
	 int location=s1.search("bro");
	 System.out.println(location);  // output-->2 coz bro located at 2nd index.
	 
	 // to calculate size of stack
	 int length=s1.size();
	 System.out.println(length);  // output---> 3 length of stack is 4 but we removed 1 so it remain 3.
	}
}
