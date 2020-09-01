import java.util.Scanner;

public class Exercise05_29 {
        public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
        	///// Get Values
        	System.out.println("Enter The Year :");
        	double Y =s.nextDouble();
        	System.out.println("Enter The First Day of The Year :");
        	double fd=s.nextDouble();
        	///// 
        	
        	
        	String header; 
    		System.out.println();
    		for (int month = 1; month <= 12; month++) {
    			header = "";
    			// add current month string to header
    			switch (month) { 
    		case 1: header += "January "; break;
    		case 2: header += "February "; break;
    		case 3: header += "March "; break;
    			case 4: header += "April "; break;
    				case 5: header += "May "; break;
    		case 6: header += "June "; break;
    		case 7: header += "July "; break;
    				case 8: header += "August "; break;
    			case 9: header += "September "; break;
    		case 10: header += "October "; break;
    			case 11: header += "November "; break;
    			case 12: header += "December "; break;
    			}
    			// add current year to header
    			header += Y + "";

    			// put it in the middle  
    			for (int t = 0; t < 23 - (header.length() / 2); t++) {
    				
    				    System.out.print(" ");
    			}

    			// Display days 
    			System.out.println(
    				header + "\n-----------------------------------------------\n " +
    				"Sun    Mon    Tue    Wed    Thu    Fri    Sat");

  //  day of the week
    			fd %= 7;
    			
    			for (int n= 0; n <= fd * 7; n++) {
    				
    				     System.out.print(" ");
    				
    			}

    			//  
    			//// last day of  month
    			int ld = 0;
    			if ( month == 1 || month == 3  || month == 5 || month == 7 ||
    				  month == 8 || month == 10 ||month == 12)
    				/// dddd
    				ld += 31;
    			else if (month == 4 || month == 6 || month == 9 || month == 11)
    				ld += 30;
    			else { ///// Test for febaurary and the other year stuff
    				if (((Y % 4 == 0) && (Y % 100 != 0)) || (Y % 400 == 0))
    					ld += 29;
    				else
    					ld += 28;
    			}

    			// Display current month
    			for (int day = 1; day <= ld; day++) {
    				// Add a space before numb < 10
    				if (day < 10) 
    					System.out.print(" ");
    				// Start new line after satuarday
    				if (fd % 7 == 6)
    					System.out.print(day + "\n ");
    				else {
    					System.out.print(day + "     ");
    					// After last day of the month even it out 
    					if (day == ld) 
    						System.out.println();
    				}
    				fd++; // increment day

    			}
    			System.out.println();
    		}
        	
        	
        	s.close();
        }
       
}
