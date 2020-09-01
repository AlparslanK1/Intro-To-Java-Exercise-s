
public class Exercise05_11 {

	public static void main(String[] args) {
	/*
	 * (Find numbers divisible by 3 or 4, but not both) Write a program that displays all
the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but not both
	 */
		final int NPR = 10;	// Number of numbers in each line displayed
		int count = 0; // Count the number divisible by 3 or 4, but not both

		for (int i = 100; i <= 200; i++) {
			if (i % 3 == 0 ^ i % 4 == 0) {
				count++;
				
				              if (count % NPR == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");			
			}
		}
	
	}
                  }



