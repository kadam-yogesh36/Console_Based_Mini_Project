package Emp.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
	  static Scanner sc=new Scanner(System.in);
    public static int getInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid Number! Please enter digits only.");
                   sc.nextLine();
            }
        }
    }
   
     public static double getDouble(String msg) {
		    while(true) {
		    	try {
		    	   System.out.println(msg);
		    	   return sc.nextDouble();
		    	   
		    	}
		    	catch(InputMismatchException e) {
		    		System.out.println("❌ Invalid Number! Please enter valid numeric value.");
	                sc.nextLine();
		    	}
		    }
    	 
     }
     
    public static String getString(String msg) {
    	sc.nextLine();
    	while(true) {
    		   try {
    			   System.out.println(msg);
    			   return sc.nextLine();
    		   }
    		   catch(InputMismatchException e) {
    			   System.out.println("invalid input! Please Enter Only String...");
    			   sc.nextLine();
    		   }
    	}
    }
    public static String getValidName(String msg) {
    	sc.nextLine();
        while (true) {
            System.out.print(msg);
            String name = sc.nextLine();

            if (name.matches("[A-Za-z ]+")) {
                return name;  // valid name
            } else {
                System.out.println("❌ Invalid Name! Only alphabets and spaces allowed.");
            }
        }
    }
    


}
