package demo;
abstract class Car1{
	public abstract void Drive();
	
	void playMusic() {
		System.out.println("playing yoyo track");
	}
}
 class BMW extends Car1{
	 public void Drive() {
		 System.out.println("Drive BMW");
	 }
	
}

public class Abstraction {

	public static void main(String[] args) {
		// we cannot create object of abstract class i.e Car1 c1=new Car();
         
		Car1 c1=new BMW();  //----->so that we create a object of child class
		c1.Drive();
		c1.playMusic();
	}

}
