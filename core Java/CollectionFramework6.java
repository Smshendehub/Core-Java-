package demo;
import java.util.*;

public class CollectionFramework6 {

	public static void main(String[] args) {
		// Maps in hashMap we have to specify key as well as value
		HashMap<Integer,String> p=new HashMap<Integer,String>();
		// we use put to add and . remove to remove
		p.put(2,"saurabh");
        p.put(3, "mahadev");
        p.put(1, "Shende");
        System.out.println(p);     //output---> [1=saurabh, 2=Mahadev ,3=Shende]   not follows index order
        p.remove(1);
        System.out.println(p);   //output-->[2=mahadev , 3=shende]
        p.replace(2,"vicky");
        System.out.println(p);     
        
        // tree map usage
        TreeMap<Integer,String> q=new TreeMap<Integer,String>();
        q.put(5, "manthan");
        q.put(4, "aage");
        System.out.println(q);  // follows order according to index
        q.descendingMap();
        //q.ascendingMap();
        System.out.println(q);
	}

}
