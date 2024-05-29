package demo;
import java.util.*;
public class CollectionFramework5 {

	public static void main(String[] args) {
		// creation of array deque it can add and remove elements from both ends 
	   // uses add, push , pop , poll , peek , remove .
		
	ArrayDeque<Integer> m=new ArrayDeque<Integer>();
	
	m.add(10);
	m.add(20);
	m.add(30);
	System.out.println(m);     m.pop();                // last in first out     System.out.println(m);
       m.poll(); //first in fist in first out
       System.out.println(m);
     m.push(40);
    System.out.println(m);
    System.out.println(m.peek());
    m.remove(10);
    System.out.println(m);
   m.addFirst(25);
   System.out.println(m);
     m.addLast(35);
    System.out.println(m);
    
	}

}
