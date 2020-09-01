import java.util.Scanner;

public class Exercise02_15 {
 public static void main(String[] args) {
	 
	 System.out.println(" Enter x1 and y1");
	 /////
	 Scanner s= new Scanner(System.in);
	 double x1=s.nextDouble();
	 double y1=s.nextDouble();
	 System.out.println(" Enter x2 and y2");
	 double x2=s.nextDouble();
	 double y2=s.nextDouble();
	 
	 ////
	 double D= Math.pow( Math.pow((x2-x1),2)+Math.pow((y2-y1),2),0.5);
	 System.out.println(" The distance between the two points is  "+ D);
	 
	 s.close();
 }
 
}
/////// Alparslan Kilinc a