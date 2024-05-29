package demo;
import java.util.*;

public class CollectionFramework1 {

	public static void main(String[] args) {
		// how to create array list in framework
        ArrayList<String> students=new ArrayList<String>();
        students.add("saurabh");
        students.add("mahadev");
        students.add("shende");
        System.out.println(students); // ouput--->[saurabh,mahadev,shende] 
        ArrayList<Integer> student=new ArrayList<Integer>();
        student.add(10);    // to add we use .add method.
        student.add(20);
        student.add(30);
        student.add(40);
        System.out.println(student);  // output-->[10,20,30,40]
        // to add value at any index we use 
        student.add(2,25);
        System.out.println(student);  // output-->[10,20,25,30,40]
         student.remove(3); 
         System.out.println(student);  // output-->[10,20,25,40] 40 removed.
        System.out.println(student.remove(2));  // to remove specific value of given index.ouput---> 25 -->25 was removed.
         
        // create another array list
        
        ArrayList<Integer>student1=new ArrayList<Integer>();
        student1.add(50);
        student1.add(60);
        student1.add(70);
        
        System.out.println(student1);  // output-->[50,60,70]
        
        // to add elemnts of one list to another
        
        student.addAll(student1);
        System.out.println(student);  // output-->[10,20,40,50,60,70].
        
        // create LinkedList In Same Way as given below
        LinkedList<Integer> student2=new LinkedList<Integer>();   // we can also use List insted of LinkedList
        student2.add(80);
        student2.add(90);
        student2.add(100);
        System.out.println(student2);  // output--->[80,90,100]
       
	}

}
