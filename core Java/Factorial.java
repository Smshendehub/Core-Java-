package demo;

public class Factorial {
	public static void factorial(int num) {
		if(num<0) {
		System.out.println("enter valid value of num");	
		return;
		}
		int fact=1;
		for(int i=num;i>=1;i--){
		fact=fact*i;                   //fact=n*(n-1)*(n-2).....
		}
		System.out.println(fact);
		return;
		//return fact;
	
		}
		
	

	public static void main(String[] args) {
		//int fact=factorial(5);                                     //fact=5*4*3*2*1.
		//System.out.println(fact);
		//factorial(5);
		int num=5;
		factorial(num);
	 }
	}


