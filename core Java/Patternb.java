package demo;

public class Patternb {

	public static void main(String[] args) {
		/*****
		 ****
		 ***
		 **
		 */
        for( int i=1;i<=5;i++) {           //another logic is i=5;i>=1;i--
        	for( int j=1;j<=6-i;j++) {     //  j=1; j<=5;j++
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
