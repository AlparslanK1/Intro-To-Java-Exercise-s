import java.util.Scanner;

public class Exercise02_01 {
	
  public static void main(String[] args){
	/// Enter 
	System.out.print("Enter a degree in Celsius:");
      Scanner src =new Scanner(System.in);
	 double Celsius=src.nextDouble();
	
	
	
	double Fahrenit = (9.0/5)*Celsius+32;
	/// Out put FAhrenheit
	System.out.println(Celsius+" Celsius is "+ Fahrenit +" Fahrenheit");
	src.close();
	
}

}
///// Alparslan Kilinc