package demo;
class Add{
	public int sum(int x, int y) {
		return(x+y);
	}
	public int sum(int x, int y, int z) {   //--->method name is same but parameters are diffrent called overloading.
		return(x+y+z);
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
     Add s=new Add();         //------> object creation
     int sum=s.sum(20, 10); 
     int add =s.sum(20,30,50);
     System.out.println("the sum is:"+ sum);
     System.out.println("the sum is:"+ add);
	}

}
