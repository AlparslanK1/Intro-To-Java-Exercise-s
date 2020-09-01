import java.util.Scanner;

public class Exercise05_49 {
  public static void main(String []args) {
	  Scanner s = new Scanner (System.in);
	  System.out.println(" Enter a String");
	  String str = s.nextLine();
	  int voewls=0; int consant=0;
	  
	  for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				
				if (Character.toUpperCase(str.charAt(i)) == 'A' ||
					 Character.toUpperCase(str.charAt(i)) == 'E' ||
					 Character.toUpperCase(str.charAt(i)) == 'I' ||
					 Character.toUpperCase(str.charAt(i)) == 'O' ||
					 Character.toUpperCase(str.charAt(i)) == 'U') {
					voewls++;
				}
					else
						consant++;
	  
			}
	  }
	   System.out.println(" Number of vowels are :"+voewls);
	   System.out.println(" Number of consonant are :"+consant);
	   s.close();
  
}
	  }

