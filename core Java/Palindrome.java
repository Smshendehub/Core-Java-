package demo;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// if we read from both end it is same i.e mam
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr new string");
		String str=sc.nextLine();
		String newstr="";
		for(int i=str.length()-1;i>=0;i--) {
			newstr=newstr+str.charAt(i);
		}
		if(str.equals(newstr)) {
			System.out.println( str+ "=" +newstr+  "  it is palindromeS");
		  }
		else {
			System.out.println("not palindrome");
		}
	}

}
