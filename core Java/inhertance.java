package demo;
class Animal{       // parent class animal
	void sound() {
		System.out.println("generic Animal sound");
		
	}
}

class Animals{
	int x=40;
	void Colour(){
		System.out.println("black ");
		
	}
}
class Cat extends Animals{
	int x=5;
	void speeds() {
	System.out.println(this.x); // refers same class.
	System.out.println(super.x); //to refer imediate parent class
	}
}
class Dog extends Animal{      //child class dog to inherite we use extends keyword.
	void bark() {
		System.out.println("woof!");
	}
}
public class inhertance {

	public static void main(String[] args) {
	Dog myDog=new Dog();
	myDog.sound();      // inherited sound from animal class and use in dog class
	myDog.bark();          // specific to dog
	Cat myCat=new Cat();
	myCat.speeds(); 

	}

}
