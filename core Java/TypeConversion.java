package demo;

public class TypeConversion {

	public static void main(String[] args) {
		// Implicit type conversion
		
		int intValue=20;
		double doubleValue=intValue;
		System.out.println("int value :"+intValue);  //output--->20
		System.out.println("double value :"+doubleValue);   //output---->20.0
		
		//explicit type coversion
		
		double anotherdoubleValue=15.75;
		int anotherintValue =(int)anotherdoubleValue;
	     System.out.println("another double value :"+anotherdoubleValue);  //output----->15.75
		System.out.println("another int value :"+anotherintValue);         //output----->15
			   

	}

}
