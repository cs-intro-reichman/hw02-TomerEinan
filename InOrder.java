/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
import java.util.Random;
public class InOrder {
	public static void main (String[] args) {
		Random random = new Random();
		int randomnumber1 = random.nextInt(10);
		System.out.println(randomnumber1);
		int randomnumber2 = random.nextInt(10);
		while (randomnumber2 >= randomnumber1){
			System.out.println(randomnumber2);
			randomnumber1 = randomnumber2;
			randomnumber2 = random.nextInt(10);
		}
	}
}
