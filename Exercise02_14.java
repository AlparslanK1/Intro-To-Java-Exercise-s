import java.util.Scanner;

public class Exercise02_14 {
  public static void main(String[] args) {
	 
	 System.out.print("Enter weight in pounds: ");
	 Scanner s = new Scanner (System.in);
	 double W = s.nextDouble();
	 ////
	 
	 System.out.print("Enter Height in inches: ");
	 double H = s.nextDouble();
	 ///
	 
	 double BMI = W* (0.45359237)/( H * 0.0254*H*0.0254);
	 
	 System.out.println("BMI is " + BMI);
	 s.close();
 }
}
////// Alparslan Kilinc
