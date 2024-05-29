package demo;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		int []num= {5,4,1,7,9,2};             
		
		Arrays.sort(num);         // use to sort array in ascending order.

		System.out.println(Arrays.toString(num));      // output-->[1,2,4,5,7,9]

	}

}
