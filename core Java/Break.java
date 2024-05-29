package demo;

public class Break {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}

	}

}
//output------>0,1,2.