
public class part3 {
    public static void main(String[] args) {
    	
    			int nol = 6;
    			System.out.println("Pattern C");
    			for (int rows = 1; rows <= nol; rows++) {
    				for (int i = nol - rows; i >= 1; i--) {
    					System.out.print("  ");
    				}
    				for (int col = rows; col >= 1; col--) {
    					System.out.print("*" + " ");
    				}
    				System.out.println();
    			}
    }
}
