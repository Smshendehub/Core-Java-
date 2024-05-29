package demo;
 class Person{
	//private attributes
	 private String name;      //cannot access this attributes to access we have to use get()and set() method.
	 private int age;
	 
	 //we use get method to return value and use public word to access string and string is the data type
	 public String getName() {
		 return name;
	 }
	 
	 //we use set method to set the value of attributes use void as it cannot return any value new keyword use to set values.
	 public void setName(String newName) {
		 name=newName;
	 }
	//we use get method to return value and use public word to access age and int is the data type
	 public int getAge() {
		 return age;
	 }
	 
	 //we use set method to set the value of attributes use void as it cannot return any value new keyword use to set values.
	 public void setAge(int newAge) {
		 if(newAge>0) {
			 age=newAge;
			 }
		 else {
			 System.out.println("invalid input age:");
		 }
	 }
	 
	 
}
public class Encapsulation {

	public static void main(String[] args) {
		//this is the way to create object 
		Person person1=new Person();
		
		//to provide input to our method set method used in following way.
		person1.setName("saurabh");
	    person1.setAge(22);
	    System.out.println("name:"+ person1.getName());   //-----> name:saurabh
	    System.out.println("name:"+ person1.getAge());     //-----> age:22

	}

}
