import java.util.Scanner;

public class Exercise02_17 {
         public static void main(String[]args) {
        	 System.out.println("Enter the temperature in Fahrenheit between -58 F and 41 F:");
     		Scanner s=new Scanner(System.in);
     		
     		double ta = s.nextDouble();
     		///
     		System.out.println("Enter the wind speed (>= 2) in miles per hour :");
     		double v= s.nextDouble();
     		
     		double ci=35.74 + 0.6215*ta - 35.75*Math.pow(v,0.16) + 0.4275*ta*Math.pow(v,0.16);
     		System.out.println("The wind chill index is" + ci);
     		s.close();
 
         }
}
///// Alparslan Kilinc a