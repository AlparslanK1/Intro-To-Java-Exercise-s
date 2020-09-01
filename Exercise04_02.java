import java.util.Scanner;

public class Exercise04_02 {
 public static void main(String[] args) {
	
	 System.out.println("Enter point 1 (latitude and longtitude) in degrees");
	 //////
	 Scanner s = new Scanner(System.in);
	 double lat1=s.nextDouble();
	 double lonng1=s.nextDouble();
	 
	 
	 
	 System.out.println("Enter point 2(latitude and longtitude) in degress");
	 ///
	 double lat2=s.nextDouble();
	 double lonng2=s.nextDouble();
	 /////
	 lat1=Math.toRadians(lat1);
	 lat2=Math.toRadians(lat2);
	 lonng1=Math.toRadians(lonng1);
	 lonng2=Math.toRadians(lonng2);
	 ///
	 final double r = 6371.01;
	
	 
	 double d = r*Math.acos(Math.sin(lat1)* Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lonng1-lonng2));
	 System.out.println("The distance between the two points is "+ d);
	 s.close(); 
 }
}
/////////////Alparslan Kilinc a
