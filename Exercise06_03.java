import java.util.Scanner;

public class Exercise06_03 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
   System.out.println(" Enter A Integer :");
    int  number =s.nextInt();
    boolean isPalindrome;
    /// call in palindrome method
    isPalindrome=isPalindrome(number);
    if(isPalindrome)
     System.out.println(number+" is Palindrome ");
    else 
    	System.out.println(number+"is not Palindrome ");
    s.close();
	}
		public static int reverse(int number) {
		int backwards=0;
		int p;
		do {
			
			p= number%10;
			number=number/10;
			backwards = backwards*10+p;
		}
			while(number>0);
		return backwards;
		}
		public static boolean isPalindrome(int number) 
		{
			int backwards = reverse(number);
			if ( backwards == number)
			return true;
			else 
				return false;
			
		}
		
		
		
		
		
		
		
		
		
	}
	


