/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
import java.util.ArrayList;
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		int sum = 0;
		ArrayList <Integer> divisors = new ArrayList<>();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
				divisors.add(i);
			}

		}
		if (sum == number){
			System.out.print(number + " is a perfect number since " + number + " = ");
			for (int k = 0; k < divisors.size() - 1; k++)
			{
				System.out.print(divisors.get(k) + " + ");

			}
			System.out.println(divisors.get(divisors.size () - 1));

		}
		else {
			System.out.println(number + " is not a perfect number");
		}
	}
}
