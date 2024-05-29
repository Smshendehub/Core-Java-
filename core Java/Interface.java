package demo;
interface vehicle{
	void run();
}
class Bike implements vehicle{
	public void run() {
		System.out.println(" i can drive the bike");
	}
}
class Duke implements vehicle{
	public void run() {
		System.out.println(" i can drive the Duke");
	}
}

public class Interface {

	public static void main(String[] args) {
		// we cannot create object of interface
          vehicle b1=new Bike();
          vehicle d1=new Duke();
          b1.run();
          d1.run();
	}

}
