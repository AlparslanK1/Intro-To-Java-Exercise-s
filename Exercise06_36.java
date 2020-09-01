import java.util.Scanner;

public class Exercise06_36 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 System.out.println(" Enter The Number Of  Sides :");
		  int na = s.nextInt();
		 System.out.println(" Enter The Side :");
               double sides = s.nextDouble();
               System.out.println("The Area of The polygan is:"+area(na,sides));
               s.close();
	}
	public static double area(int n, double side) {
		
		double top = n*Math.pow(side, 2);
		double bottom = 4*Math.tan(Math.PI/n);
		
		 double A=(top/bottom);
		
		return A;
		
		
	}
	

}
