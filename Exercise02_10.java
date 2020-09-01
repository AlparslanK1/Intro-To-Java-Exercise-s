import java.util.Scanner;

public class Exercise02_10 {
	
  public static void main(String[] args) {
	  System.out.print("Enter the amount of water in kilogorams:");
	  Scanner s = new Scanner(System.in);
	   double W = s.nextDouble();
	  ////
	  
	  System.out.print("Enter the initial temperature:");
	  double It = s.nextDouble();
	  ///
	  System.out.print("Enter the final temperature:");
	  double Ft = s.nextDouble();
	////
	  s.close();
	  // Formula
	  double Energy = W*(Ft-It)*4184;
	  System.out.println("The energy nedded is : " + Energy);
}
}
///// Alparslan Kilinc