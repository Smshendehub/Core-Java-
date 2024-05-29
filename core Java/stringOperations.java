package demo;


public class stringOperations {

	public static void main(String[] args) {
		
		// implicit creation of string or using String literals  
		
           String name;
           name="saurabh";
           String str1="hello";
           
           // string using char Array
           
           char [] charArray= {'s','a','u','r','a','b','h'};
           String str3= new String(charArray);
           
           // using class contructor we use new to create object
           
            String str2=new String("saurabh");
            System.out.println(name);   // --->saurabh
            System.out.println(str1);   //---> hello
            System.out.println(str3);   //--->saurabh
            System.out.println(str2);   //----> saurabh
            
            // concatenation of string using "+"
            
            String str4 =str1+" "+ str3;
            
            // concatenation  using concat();
          //  String str5=str1.concat(str4);  //------> not that much in use.
            System.out.println( str4);   //----> hello saurabh
           // System.out.println( str5); 
            
            // print length of the string
            System.out.println(str1.length());  // -----> 5
            // Accessing individual charecter using charAt();
            //char Fistchar=str1.charAt(0);
            System.out.println(str1.charAt(0));     //---->h
            // substring method
            String s=str2.substring(2,4);
            System.out.println(s);        //------>ur
            // String Comparison use boolean data type
   
            if(str2.equals(str3)) {
            	System.out.println("equal");    //--->equal
            }
            else {
            	System.out.println("not equal");
            }
 
       }

}