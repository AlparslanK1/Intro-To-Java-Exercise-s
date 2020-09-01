import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {
		/*
		 * (Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name of
the student with the highest score. Use the next() method in the Scanner class
to read a name, rather than using the nextLine() method.
		 */
                            Scanner s= new Scanner(System.in);
              double hs=0;
              String hsname="";
              //////// user input
              System.out.print("Enter the number of students: ");
      		double nos = s.nextDouble();
      		/////////// name and scores with for loop
      		for(int w=0; w<nos; w++) {
      			System.out.print(" Student:"+(w+1)+ "\n Name:");
      			String name=s.next();
      			System.out.print("   Score: ");
      				double score = s.nextDouble();
      				/// 
      				if(score>hs) {
      					hs = score;
      					hsname = name;
      				}

      			// Display the name of the student with the highest score
      				System.out.println("Student with the highest score: "+hsname);     				
      				
      			
      		}
      			s.close();
	}

}
