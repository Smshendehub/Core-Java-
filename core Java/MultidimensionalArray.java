package demo;

public class MultidimensionalArray {

	public static void main(String[] args) {
	   int matrix[][]= {{0,1},{3,4}};
	     int elements =matrix[1][1];
	     for(int i=0;i<matrix.length;i++) {              //i for row 0,1
	    	  for(int j=0;j<matrix.length;j++) {
	    		  System.out.print(" " +matrix[i][j]);       // j for coloumn 0,1
	    	  }
	    	  System.out.println(); 
	     }
	}

}
//ouput--->    0 1
  //           3 4