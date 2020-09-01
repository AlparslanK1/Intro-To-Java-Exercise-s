import java.util.Scanner;

public class Exercise04_21 {
           public static void main(String[] args) {
        	   ///////Write a program that prompts the user to enter a Social Security
        	/////   number in the format DDD-DD-DDDD, where D is a digit. Your program should
        	//////   check whether the input is valid.
        	   Scanner s = new Scanner(System.in);
        	   System.out.println("Enter a SNN:");
        	   String st=  s.nextLine();
        	   
        	   ////////// do it 
        	   if (st.length() == 11 && Character.isDigit(st.charAt(0)) 
        			   && Character.isDigit(st.charAt(1))
        			   && Character.isDigit(st.charAt(2)) 
        			   &&st.charAt(3) == '-'
        			   &&Character.isDigit(st.charAt(4))
        			   &&Character.isDigit(st.charAt(5))
        			   &&st.charAt(6) == '-'
        			   &&Character.isDigit(st.charAt(8))
        			   &&Character.isDigit(st.charAt(9))
        			   &&Character.isDigit(st.charAt(9))
        			   &&Character.isDigit(st.charAt(10))) 
        	  
        	   System.out.println(st+"    is a valid social securit number");
        	   else 
        		   System.out.println(" input is invalid");
        	   
        	   
        	   
        	   s.close();
        	   
        	  /////////////////// Alparslan Kilinc
           }
}
