package demo;
import java.util.*;
import java.io.IOException;

public class ExcetionHandling {


	 //throws block useage.
	void m() throws IOException{
		throw new IOException("device error");
		
	}
	void n()throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("exception is handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int data=50/0;   // shows arithmetic excetion
      }catch(Exception e) {
    	  System.out.println(e);       // Exception was removed and rest of code exccecuted.
    	  
      }
      finally {
		System.out.println("rest of code");     // Exception present or not it will always excecute finally block.
      }
      ExcetionHandling obj=new ExcetionHandling();
      obj.p();
      System.out.println("rest of code");
	}
	

}
