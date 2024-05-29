package demo;

import java.util.Arrays;

public class CopyArray {
	//copying array

	public static void main(String[] args) {
		int [] orignal= {1,2,3,4,5};
		int []copy=Arrays.copyOf(orignal,7);   //  7--->string length we want to copy orignal.
		//updating array
		copy[5]=8;     // we can update (replace) fifth index to 8          
		System.out.println(Arrays.toString(orignal));     // output-->[1,2,3,4,5]
		System.out.println(Arrays.toString(copy));     //  output-->[1,2,3,4,5,0,0] & [1,2,3,4,5,8,0] 
		

	}

}
