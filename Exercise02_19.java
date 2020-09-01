import java.util.Scanner;

public class Exercise02_19 {
          public static void main(String[] args) {
        	  System.out.println("Enter the coordinates of three points separated by space like x1 y1 x2 y2 x3 y3:");
        	  Scanner s= new Scanner(System.in);
        	  double x1=s.nextDouble();
        	  double y1 =s.nextDouble();
        	  double x2=s.nextDouble();
        	  double y2=s.nextDouble();
        	  double x3=s.nextDouble();
        	  double y3=s.nextDouble();
        	  
        	  
        	   double side1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        	   double side2 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        	   double side3 = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        	   double ss = (side1 +side2 +side3)/2;
        	   
        	   
        	  double area = Math.sqrt((ss*(ss-side1))*(ss-side2)*(ss-side3));
        	  
        	  System.out.println("The area of the triangle is :"+area);
        	s.close();
        	  
        	  
        	  
          }
}///////// Alparslan Kilinc a
