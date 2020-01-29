import java.util.Scanner;

/**
 * 
 * @author Zahra
 * created    : 1.29.20
 * description: This program calculates the Birth Year
 * 
 **/

public class FirstProgram {
     //This is the first method the JVMM looks for, to run
     public static void main(String[] args) {
    	 Scanner keyboard = new Scanner (System.in);
    	    System.out.println("Welcome to My First "
    	    		+"Program /nThis program calculates" + " the Birth Year");
    	  System.out.print("Enter your age: ");
    	  int age= keyboard.nextInt();
    	  
    	  int birthYear= 2020-age;
    	  System.out.println(" You are most likely to be born in " + birthYear);
     }
}
