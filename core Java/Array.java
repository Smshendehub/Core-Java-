package demo;

public class Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5}; 
		//int arr[];       //array declaration
		//arr=new int[5];   // array initiallization
		int length=arr.length;
		//System.out.println(length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
