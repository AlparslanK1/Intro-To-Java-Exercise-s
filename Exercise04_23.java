import java.util.Scanner;

public class Exercise04_23 {
         public static void main(String[] args) {
        	 Scanner s = new Scanner (System.in);
        	
        	 System.out.println("Enter employee's name:");
        	 String str = s.nextLine();
        	 System.out.println("Enter number of hours worked in a week:");
        	 double hw = s.nextDouble();
        	 System.out.println("Enter hourly pay rate:");
        	 double pr=s.nextDouble();
        	 
        	 System.out.println("Enter federal tax withholding rate:");
        	 double fr=s.nextDouble();
        	 
        	 System.out.println("Enter state tax withholding rate:");
        	 double sr= s.nextDouble();
        	 /////////////// Formula 
        	 double deduction = (fr*(hw*pr))+(sr*(hw*pr));
        	 double federal = (fr*(hw*pr));
        	 double state = (sr*(hw*pr));
        	 double gp = (hw*pr);
        	 double net = gp-deduction;
        	 
        	 /*Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.5
Deductions:
Federal Withholding (20.0%): $19.5
State Withholding (9.0%): $8.77
Total Deduction: $28.27
Net Pay: $69.22
        	
        	  */
        	 System.out.println("Employee Name:"+str);
        	 System.out.println("Hours Worked:"+hw);
        	 System.out.println("Pay Rate: $"+pr);
        	 System.out.println("Gross Pay: $"+ gp);
        	 System.out.println("Deductions:");
        	 System.out.println("Federal Withholding "+"("+fr*100+")%: $"+federal);
        	 System.out.println(" State Withholding  "+"("+sr*100+")%: $"+state);
        	 System.out.println("Total Deduction: $"+deduction);
        	 System.out.println("Net Pay: $"+net);
        	 
        	         	 
        	 s.close();
        	 
        	 
        	 ///Enter employee’s name:
        	 ///////Enter number of hours worked in a week:
        	 //////Enter hourly pay rate:
        	 /////Enter federal tax withholding rate:
        	 //////// Enter state tax withholding rate:
        	 ///////////////// Alparslan Kilinc
         }
}
