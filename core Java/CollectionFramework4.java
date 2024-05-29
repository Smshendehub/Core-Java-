package demo;
import java.util.*;

public class CollectionFramework4 {

	public static void main(String[] args) {
		// Hash set creation but order is not sorted.
		HashSet<Integer> x = new HashSet<Integer>();
		
		// we use add to add element.
           x.add(20);
           x.add(30);
           x.add(40);
           x.add(40); //  duplicate value not posssible.
           System.out.println(x);   // output[20,40,30]--> not in order also duplicate value not printed. 
           
           // to remove use . remove 
           //x.remove(20);
           x.removeAll(x);  // to remove all  values of x
           System.out.println( x);  // output-->[]
            // also use ad all in same way x.addAll(); set added to set or lists.
            
            // tree set for sorted order always use ascending order.
            TreeSet<Integer> y=new TreeSet<Integer>();
            y.add(70);
            y.add(60);
            y.add(50);
            System.out.println(y); // output-->[50,60,70] in ascending order always.
            
            TreeSet<Integer> z=new TreeSet<Integer>();
            z.add(90);
            z.add(100);
            z.add(80);
            y.addAll(z); // to combine tree elements 
           System.out.println(y);  //output-->[50,60,70,80,90,100]
            
           
          //  we cannot add hashset to treeset 
	}

}
