import java.util.Scanner;

public class Exercise03_22 {
      public static void main(String[] args) {
    	  
    	  Scanner s = new Scanner (System.in);
    	  ////// with in radius 10 
    	 System.out.println("Enter a point with two coordinates:");
    	 double x = s.nextDouble();
    	 double y = s.nextDouble();
    	 
    	 if (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10)
    	 
    	 System.out.println(" Point ("+x+","+y+") is in the circle");
    	 else {
    	 System.out.println(" Point ("+x+","+y+") is not the circle");
    	 s.close();
    	 }
      }
}
 ///////////// Alparslan Kilinc 