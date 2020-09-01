
public class Exercise04_06 {
   public static void main(String[] args) {
	   /// random angles
	   
	   double a1 = (Math.random() * ( 2 *Math.PI));
	   double a2 = (Math.random() * ( 2 *Math.PI));
	   double a3 = (Math.random() * ( 2 *Math.PI));
	   //// since (x,y)= (sin,cosine)
	   double r = 40;
	   
	   double x1 = r * Math.sin(a1);
	   double x2 = r* Math.sin(a2);
	   double x3 = r * Math.sin(a3);
	   /////
	   double y1 = r* Math.cos(a1);
	   double y2 = r* Math.cos(a2);
	   double y3 = r* Math.cos(a3);
	   
	  
    ///// result 
    System.out.println("Three random points are ");
    System.out.println("("+x1+","+y1+")");
    System.out.println("("+x2+","+y2+")");
    System.out.println("("+x3+","+y3+")");
    
   }
}
  ///////////Alparslan Kilinc a
