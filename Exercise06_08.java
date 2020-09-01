
public class Exercise06_08 {

	public static void main(String[] args) {
		////The formula for the conversion is:
		////1 mile = 1.6 kilometers
		//// Table 
System.out.println("Miles      Kilometer      |     Kilometer        Miles   ");
int j = 20;
 
		for(int i=1 ;i<=10; i++) {
			double k= mileToKilometer(i);
			double f= kilometerToMile(j);
			
			System.out.print(i);
			    System.out.print("          ");
			    System.out.printf("%2.1f", k);
			    System.out.print("                   "+j);
				 j+=5;
				 System.out.print("              "+f);
				 
		
		 System.out.println();
		}
		
		
		
		
		
		
   
	}
	/** Convert from Mile to Kilometer */
	public static double mileToKilometer(double mile) {
		double kilometer = mile*1.6;
		return kilometer;
	}
	/** Convert from Kilometer to Mile */
	public static double kilometerToMile(double kilometer) {
		double mile = kilometer/1.6;
		return mile;
	}
	

}

