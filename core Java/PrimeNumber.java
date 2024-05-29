package demo;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number to chrck primr or not: ");
     int n=sc.nextInt();
     int count=0;
     for(int i=2;i<n;i++) {
    	 if(n%i==0) {
    		 count++;
    	 }
    	 
     }
     if(count==0) {
		 System.out.println("number is prime");
		 
	 }
	 else {
		 System.out.println("number not prime");
		 
	 }
     
	}

}
