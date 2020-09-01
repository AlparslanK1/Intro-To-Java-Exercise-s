import java.util.Scanner;

public class Exercise04_18 {
             public static void main(String[]args) {
            	 /////////I: Information Management
            ////////	 C: Computer Science
            //////////	 A: Accounting
            	 Scanner s= new Scanner (System.in);
            	 System.out.println("Enter two characters:");
            	 String st= s.nextLine();
            	 
            	 //// major and years
            	 //// first enter is the major at  then year next to it at 1 
            	char major = Character.toUpperCase(st.charAt(0));
            	char year = st.charAt(1);
      
            	
            	
            	 /////// major cases
            	///// if letter i c or a is entered the statments next to it will be printed 
            	switch(major) {
            	case('I'): System.out.print(" Information Managment"); break;
            	case('C'): System.out.print(" Computer Science"); break;
            	case('A'): System.out.print(" Accounting"); break;
            	default: System.out.println("Enter Major betwwen  I, C and A");
                        
            	  
            	
            	}
            	////// year cases
            	////  if either number is printed the follwing statment will be printed.
            	switch(year) {
            	case('1'): System.out.print(" Freshamn"); break;
            	case('2'): System.out.print(" Sophmore"); break;
            	case('3'): System.out.print(" Junior"); break;
            	case('4'): System.out.print(" Senior"); break;
            	default: System.out.println("Enter a year between 1 and 4");
          
            	 s.close();
            	 ///////////////////////// Alparslan Kilinc
             }
             }
}
