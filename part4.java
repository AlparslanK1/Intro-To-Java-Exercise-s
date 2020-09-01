
public class part4 {
  public static void main(String[]args) {
	
		System.out.println("Pattern D");
		for (int rows = 0; rows < 6; rows++) {	
			
			
			for (int i= 0; i < rows; i++) {				
				System.out.print("  ");
			}
			for ( int v = 0 ; v < 6 - rows; v++) {	
				System.out.print(( "*") + " ");
			}
			System.out.println();							
		}
  }
}
