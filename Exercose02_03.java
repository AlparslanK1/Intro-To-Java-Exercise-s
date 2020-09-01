import java.util.Scanner;

public class Exercose02_03 {

	public static void main(String[] args) {
		/// Enter 
		System.out.print("Enter a value for feet:");
	      Scanner src =new Scanner(System.in);
		 double feet =src.nextDouble();
		
		
		double Meter = feet*(0.305) ;
		/// Out put FAhrenheit
		System.out.println(feet+" feet is "+ Meter +" meters");
		src.close();
		
	}
	
}
///// Alparslan Kilinc
