
public class Exercise05_06 {

	public static void main(String[] args) {
		/////(note that 1 ping = 3.305 square meters):
		// constant value
		final double smpp=3.305;
		///// Table 
		System.out.println("Ping  Square meters | Square meters  Ping");
		////////// loop the table factors 
		for (int p = 1, sq = 20; p <= 10 && sq <= 65; p++, sq += 5) {
			
			System.out.print(p);
			System.out.print("    ");
			System.out.print(Math.round(p*smpp));
			System.out.print("              | ");
			System.out.print(sq);
			System.out.print("    ");
			System.out.print(Math.round(sq/smpp));
			System.out.println("");
			
	}

}
}
