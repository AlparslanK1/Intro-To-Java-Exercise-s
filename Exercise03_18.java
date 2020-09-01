import java.util.Scanner;

public class Exercise03_18 {
          public static void main(String[] args) {
        	  Scanner s = new Scanner(System.in);
        	  System.out.println(" Enter Package Weight in pounds :");
        	   double W = s.nextDouble();
        	   
        	   
        	   if (0<W  && W <=2) 
        		  System.out.println("Cost of Shipping is 2.5$");
        	   else  if (2<W  && W <=4) 
        		   System.out.println("Cost of Shipping is 4.5$");
        	   
        	   else  if (4<W  && W <=10) 
        		   System.out.println("Cost of Shipping is 7.5$");
        	   
        	   else  if (10<W  && W <=20) 
        		   System.out.println("Cost of Shipping is 10.5$");
        	   else 
        		   System.out.println("the package cannot be shipped.");
        	///  2.5 if 0< w < =2
        	   
        	////		  4.5 if 2< w <=4
        	////		  7.5 if 4<w<=10
        	////		  10.5 if 10 <w <=20
        	   s.close();
        	  ////////// Alparslan Kilinc
          }
}
