import java.util.Scanner;

public class Exercise03_01 {
              public static void main(String[]args) {
            	  
            	  Scanner s= new Scanner(System.in);
            	  
            	  System.out.println("Enter a,b,c :");
            	  
            	 double a = s.nextDouble();
            	 double b = s.nextDouble();
            	 double c = s.nextDouble();
            	 ////// Formulas
            	double d = Math.pow(b, 2)-4*a*c;
            	 double r1= (-b+Math.pow(d,0.5))/(2*a);
            	 double r2 = (-b-Math.pow(d,0.5))/(2*a);
            	 ///////// Display
            	
            	  if(d>0) 
            		 
            		   System.out.println("The equation has two roots"+r1 +"and"+r2);
            	  
            	  else if(d==0) 
            	  System.out.println("The equation has one root"+r1 );
            	  
            	  else 
            		  System.out.println("The equation has no real roots");
            	
            	  s.close();
   
            		   
            	  ///////////////// Alparslan Kilinc
            	 
            	  }
            	 
    	  
            	  
              }
	
	
	
	
	
	
	
	
	
	
	
	

