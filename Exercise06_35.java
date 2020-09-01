import java.util.Scanner;

public class Exercise06_35 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter The Side: ");
		//// get the side value 
		double si = s.nextDouble();
		//// print out the area volume for si , 
		//// side becomes si when the method is called
		System.out.println("the area of the pentagon is :"+area(si));
		s.close();
   
	}
	public static double area(double side) {
		//// formula
		double top= 5*Math.pow(side, 2);
		double bottom= 4*Math.tan((Math.PI/5));
		double A = (top/bottom);
		/// return the area
		return A;
	}
}
