public class Exercise_05_19 {
	public static void main(String[] args) {
 
        ////// rows and collmuns
		int number = 8;
		 
		for(int i=1; i <=number; i++) {
	///////// white space
			for(int z=1; z<=(number-i) ; z++) {
				System.out.print("     ");
			}
			///// multilipve of 3 check both sides 
		/////// first part ++ 
			for(int fp=0; fp<i; fp++) {
				System.out.printf("%5d",(int) Math.pow(3, fp));
			}
			//// second part --
			//// 
			for (int sp=i-2; sp>=0; sp--) {
				System.out.printf("%5d",(int) Math.pow(3, sp));
			}
			///// to even it out 
			System.out.println();
		}
		
	}
}

		
		
	