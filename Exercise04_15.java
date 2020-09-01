import java.util.Scanner;

public class Exercise04_15 {
         public static void main(String[]args) {
        	 
        	 Scanner s = new Scanner  (System.in);
        	 ////// input 
        	 System.out.println("Enter a letter :");
        	 
        	 String st = s.nextLine();
        	 ////// first letter entered becomes ch
        	 char ch =st.charAt(0);
        	 ///// if upper or lower case. input equals lower case values 
        	 ch=Character.toLowerCase(ch);
        	  ///// starts from 0 then values then assigned to  corresponding number
        	 int n=0;
        	 
        	 //// if input  is a letter then it does 
        	 if (Character.isLetter(ch)){
        		 ///// 
        		 /// abc
        		if(ch >='a')
        			n=2;
        		///def
        		else if  (ch>='d')
        		n=3;
        		///ghi
        		else if  (ch>='g')
            		n=4;
        		///jkl
        		else if  (ch>='j')
            		n=5;
        		///mno
        		else if  (ch>='m')
            		n=6;
        		////pqrs
        		else if  (ch>='p')
            		n=7;
        		////tuv
        		else if  (ch>='t')
            		n=8;
        		/////wxyz///
        		else if  (ch>='w')
            		n=9;
        		 
        		 System.out.println("The corresponding number is :"+ n);
        		 
        	 }
        	 //// if input is not a character then we say no 
        	 else 
        		 
        		 System.out.println( ch +"  is an invalid input");
        	  s.close();
        		 
        	 }
        	 
        	  /////////////////////// Alparslan Kilinc
        	 
        	 
        	 
        	 
        	 
        	 
        	 
         }

