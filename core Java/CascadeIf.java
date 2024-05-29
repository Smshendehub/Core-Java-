package demo;

public class CascadeIf {

	public static void main(String[] args) {
	int a=20 , b=22;
	if(a==b) {
		System.out.println("a is equal to b");
	}
	else if(a>b) {
		System.out.println("a is greater than b");
	}
	else {
		System.out.println("b is greater than a and a is not equal to b");
	}

	}

}
