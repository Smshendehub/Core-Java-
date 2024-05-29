package demo;
class Car{
	int year;
	int speed;
	String model;
	boolean engineRunning;
	
	
	void startEngine() {
		engineRunning=true;
		System.out.println("engine is running ");
	}
	void displayInfo() {
		System.out.println("year: " +year   +  "  speed: " +speed + " model:"+ model);
	}
    
}

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car myCar=new Car();
 myCar.year=2022;
 myCar.speed=30;
 myCar.model="Tata";
 //myCar.model="tata";
 myCar.startEngine();
 myCar.displayInfo();
 
	}

}
