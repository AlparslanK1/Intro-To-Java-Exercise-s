import java.util.Scanner;

public class Exercise06_21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	 System.out.println("Enter a string :");
	  String str = s.nextLine();
	   
	   for(int i=0; i<str.length();i++) {
		//// if it is a letter 
		   int k = getNumber(Character.toUpperCase(str.charAt(i)));
		   if (Character.isLetter(str.charAt(i))) {
			
			   System.out.print(k);
		   }
		  
		   else
			   System.out.println(str.charAt(i));
			 
			
			   
	}
	   System.out.println();
	   s.close();
	}
	public static int getNumber(char uppercaseLetter) {
	//// return the characters corresponding  uppercase letter
		
			if (uppercaseLetter >= 'W')
				return  9;
			else if (uppercaseLetter >= 'T')
				return  8;
			else if (uppercaseLetter >= 'P')
				return  7;
			else if (uppercaseLetter >= 'M')
				return  6;
			else if (uppercaseLetter >= 'J')
				return  5;
			else if (uppercaseLetter >= 'G')
				return  4;
			else if (uppercaseLetter >= 'D')
				return  3;
			else  
				return  2;
			
		}
			
		
	}


