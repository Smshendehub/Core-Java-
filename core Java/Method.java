package demo;

public class Method {
	public static int Multiply(int a,int b) {
		int multiplication=a*b;
		return multiplication;
	}

	public static void main(String[] args) {
		// multiply two numbers 
      int a=20;
      int b=30;
      int multiplication=Multiply(a,b);
      System.out.println("a*b="+multiplication);
	}

}
