import java.util.Scanner;

public class Exercise05_01 {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner (System.in);
		
		
		int score=0;
		
		  while (score!=-1) {
			
				 System.out.print("Enter Your score:");
				 double set=s.nextDouble();
				
				if (set==-1) {
					break;
				}
				 else if(set>60 || set==60) {
					
					 System.out.println("You pass the exam.");
				 }
				 else if (set<60) {
					 System.out.println("You don't pass the exam.");
				 }
				
				
		  
		  }
		  s.close();
		  System.out.println("No numbers are enterted expect 0");
	}

}
