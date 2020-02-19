/*
 *  @author Zahra Khan
 *  
 */
import java.util.Scanner;
public class WeekFour {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome To Coat Advisor");
		System.out.println("Enter Weather in fareinheight");
		double weather = kb.nextDouble();
		
		if(weather>70)
			System.out.println("It's hot");
		else if(weather>50)
			System.out.println("It's warm");
		else if(weather>30)
			System.out.println("It's cold, wear a jacket");
		else 
			System.out.println("It's too cold, wear a coat");
	}

}
