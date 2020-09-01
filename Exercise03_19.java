import java.util.Scanner;

public class Exercise03_19 {
              public static void  main(String[] args) {
            	   Scanner s = new Scanner (System.in);
    
            	   System.out.print("Enter three edges of the triangle:");
            	  double s1 = s.nextDouble();
            	  double s2 = s.nextDouble();
            	  double s3 = s.nextDouble();

            	  if (s1+s2>s3 && s1+s3>s2 && s2+s3>s1) {
            	   System.out.print("The perimeter is " + (s1 + s2 + s3));
            	  }
            	  else 
            	  {
            	    System.out.print("The input is invalid");
            	    System.exit(1);
            	  } 
            	  s.close();
            	 
            	 }
            	 
            	
              } //////////////// Alparslan Kilinc 

