package demo;

public class MethodAndFunctionA {
	public static int calculateSum(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int sum=calculateSum(a,b);
	System.out.println("sum="+sum);
	}

}
