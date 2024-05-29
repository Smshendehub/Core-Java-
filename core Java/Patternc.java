package demo;

public class Patternc {

	public static void main(String[] args) {
	   /*     * 
		     **
		    ***
		   ****
		  *****/
		for(int i=1;i<=5;i++) {                   // i------>row
			for( int k=1;k<=(5-i);k++) {          // k------>space
				System.out.print(" ");
			}
			for( int j=1;j<=(i);j++) {              // j-------> column
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
