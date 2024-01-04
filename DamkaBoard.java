/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int number = Integer.parseInt(args[0]);
		for (int i = 0; i < number; i++){
			System.out.println("");
			if (i % 2 == 1){
				System.out.print(" ");
			}
			for (int k = 0; k < number; k++){
				System.out.print("* ");
			}
		}
		System.out.println("");
	}
}
