import java.util.Scanner;

public class Exercise05_22 {
	public static void main(String[] args) {
		// Create Scanner
		Scanner s = new Scanner(System.in);
		//// Input Stuff
		System.out.println(" Enter The Loan Amount :");
	   double LoanAmount=s.nextDouble();
	   System.out.println(" Enter The Number Of Years :");
	   double NumberOfYears=s.nextDouble();
	   System.out.println(" Enter The Annual Interest Rate :");
		double AnnualinterestRate=s.nextDouble();
		 ///// Calculations 
		double MR= AnnualinterestRate/1200;
		
		double MP=LoanAmount * MR / (1 - 1 / 
				Math.pow(1 + MR, NumberOfYears * 12));
		double balance=LoanAmount;
		///// Display payments
		System.out.println("Monthly Payment :"+MP);
		System.out.println("Total Payment :"+(MP * 12) * NumberOfYears);
		//////// Table 
		
				                            
		System.out.println("Payment#        Interest               Principal                  Balance");
	 int i;
		for(i=1; i<=NumberOfYears*12;i++) {
			double interest = ((MR*balance));
			double principal =((MP-interest));
			balance=  ((balance - principal));
 System.out.println(i+ "         " + interest +"        "+ principal+"        "+balance);
			
		}
		
		
		
		
		
		
		
		
		s.close();
	}
}
		
		