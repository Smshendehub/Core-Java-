package demo;
import java.util.*;

public class CollectionFramework3 {

	public static void main(String[] args) {
		// Queue in Framework we use Priority Queue.
		PriorityQueue<String>s1=new PriorityQueue<String>();
	// we use offer to add values and poll to remove (FIFO)---> First In First Out.
		s1.offer("sonu");
		s1.offer("raja");
		s1.offer("rani");
		
		System.out.println(s1);
		
	System.out.println(s1.poll());  // raja out coz first in first out
	
	//we will also use peek and other methods too.
		
	}

}
