package test1;

public class PrintShapes {
	
	/**
	 * Prints out a square!
	 * @param side size of square
	 */
	public static void printSquare(int side) {
		for(int i = 0; i < side; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0; i < side - 2; i++) {
			System.out.print("*");
			for(int j = 0; j < side - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i = 0; i < side; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
