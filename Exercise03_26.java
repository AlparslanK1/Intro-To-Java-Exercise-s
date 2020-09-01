import java.util.Scanner;

     /////     Use  && ||  ^  

public class Exercise03_26 {
    public static void main(String[]args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter an integer:");
    	double integer = s.nextDouble();
    	//// and
    	System.out.println("Is  "+integer+" divisible by 4 and 5?  " +
    			((integer % 4 == 0) && (integer % 5 == 0)));
    	///// or 
    		System.out.println("Is  "+integer+" divisible by 4 or 5?  " +
    			((integer % 4 == 0) || (integer % 5 == 0)));
    		/////  not both
    		System.out.println("Is  "+integer+" divisible by 4 or 5, but not both?  " +
    			((integer % 4 == 0) ^ (integer % 5 == 0)));
    	
   
    	
    	
    	s.close();
    	/////////////////////// Alparslan Kilinc
    }
}
