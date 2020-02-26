/**
 * 
 * @author Zahra
 *
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to the number guesser");
		
		int randPick = rand.nextInt(3);
		System.out.println("Enter a number from 0 to 5: ");
		int userPick = kb.nextInt();
		
		if(userPick==randPick)
			for(int i=0;i<3;i++)
				System.out.println("vicotry");
		else
			for(int i=0;i<3;i++)
				System.out.println("Game over");
				
	}
}
