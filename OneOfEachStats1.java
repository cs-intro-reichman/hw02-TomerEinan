/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
import java.lang.System;
import java.util.Random;
import java.util.ArrayList;
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		int twoc = 0;
		int threec = 0;
		int fourplusc = 0;
		Double average = 0.0;
		int numofc = 0;
		Random random = new Random();
		for (int i = 0; i < number; i++){
			String randomnumber1 = Integer.toString(random.nextInt(2));
			String randomnumber2 = Integer.toString(random.nextInt(2));
			ArrayList <String> kids = new ArrayList<>();
			kids.add(randomnumber1);
			kids.add(randomnumber2);
			while (true)
			{
				if(!randomnumber2.equals(randomnumber1))
				{
					break;
				}
				randomnumber2 = Integer.toString(random.nextInt(2));
				kids.add(randomnumber2);
			}
			numofc = kids.size();
			average = average + numofc;
			if (numofc == 2){
				twoc ++;
			}
			if (numofc == 3){
				threec ++;
			}
			if (numofc > 3){
				fourplusc ++;
			}
		}
		average = average / number;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoc);
		System.out.println("Number of families with 3 children: " + threec);
		System.out.println("Number of families with 4 or more children: " + fourplusc);
		int largest = Math.max(twoc, Math.max(threec, fourplusc));
		if (largest == twoc){
			System.out.println("The most common number of children is 2.");
		}
		if (largest == threec){
			System.out.println("The most common number of children is 3.");
		}
		if (largest == fourplusc){
			System.out.println("The most common number of children is 4 or more.");
		}

	}

}
