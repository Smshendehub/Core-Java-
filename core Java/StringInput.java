package demo;
import java.util.*;

public class StringInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr string name: ");
		String s1=sc.nextLine();
		int count=0;
		String news1=" ";// to reverse string
		/*for(int i=0;i<s1.length();i++) {
			//count++;
			//System.out.println(s1.charAt(i));
			// to count gap in string
			if(s1.charAt(i)==' ') {
				count++;
			}
		}*/				
		//System.out.println(count); 
		for(int i=s1.length()-1;i>=0;i--) {
			news1=news1+s1.charAt(i);
		}
		System.out.println(news1);

	}

}
