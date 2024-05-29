package demo;
class Animal1{
	void sound(){
		System.out.println("generic sound");
		}
	}
class Dog1 extends Animal1{
	@Override             // ------> use to @Override the method we want use in inherited child  class
	void sound() {
		System.out.println("bark");
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// object creation
		Animal1 myAnimal1=new Animal1();
		Dog1 myDog1=new Dog1();
	    myAnimal1.sound();
        myDog1.sound();                 //--------> overriding 
	}

}
