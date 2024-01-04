/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String reverseword = "";
		int number = word.length();
		System.out.println(number);
		for (int i = number - 1; i > -1; i--){
			reverseword = reverseword + word.charAt(i);
		}
		System.out.println(reverseword);
		number = number / 2 + 1 - number % 2;
		System.out.println("The middle character is " + word.charAt(number));
	}
}
