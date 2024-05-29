package demo;
import java.util.*;
public class Inputs {

	public static void main(String[] args) {
	
       Scanner sc=new Scanner(System.in);
       /* user input methods
       System.out.println("enter name");
       String name=sc.nextLine();
       System.out.println("enetet age");
       int age=sc.nextInt();
       System.out.println( name+  " your age is " +age); */
		
		// sum of natural numbers
       System.out.println("enter limit till you want to print sum of natural no: ");
	   int n = sc.nextInt();
	   int sum=0;
	   for(int i=1;i<=n;i++) {
		   sum=sum+i;
		   
	   }
	   System.out.println("sum of natural no: "+sum); 
	   //Product of natural numbers
	   System.out.println("enter limit to print product: ");
	   int num=sc.nextInt();
	   int mul=1;
	   for(int i=1;i<=num;i++) {
		   mul=mul*i;
	   }
	   System.out.println("Product is :" +mul);
	   
	   // to find sum of all divisor of natural num a divisor
	   System.out.println("enetr value of a: ");
	   int a =sc.nextInt();
	   int suma=0;
	   int count=0;
	   for(int i=1;i<=a;i++) {
		   if(a%i==0) {
			   suma=suma+i;
			   count++;
		   }
	   }
	   System.out.println(suma);
	   System.out.println(count);
	}
	

}
