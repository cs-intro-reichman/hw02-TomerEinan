
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
import java.util.Random;
import java.util.ArrayList;
public class OneOfEach {
	public static void main (String[] args) {
		Random random = new Random();
		String randomnumber1 = Integer.toString(random.nextInt(2));
		String randomnumber2 = Integer.toString(random.nextInt(2));
		ArrayList <String> kids = new ArrayList<>();
		kids.add(randomnumber1);
		kids.add(randomnumber2);
		while (true){
			if(!randomnumber2.equals(randomnumber1)){
				break;
			}
			randomnumber2 = Integer.toString(random.nextInt(2));
			kids.add(randomnumber2);
		}
		for (int i = 0; i < kids.size(); i++){
			if (kids.get(i).equals("1")){
				kids.set(i, "b");
			}
			else{
				kids.set(i, "g");
			}
			System.out.print(kids.get(i) + " ");
			}
		System.out.println(" ");
		System.out.println("You made it... and you now have " + kids.size() + " children.");
		}
	}
