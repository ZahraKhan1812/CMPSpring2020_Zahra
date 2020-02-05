/**
 * 
 * @author Zahra Khan
 * created    : 2.5.20
 * description: This program computes the product of 3 numbers where the numbers are entered by the user
 *   
 *
 */
import java.util.Scanner;
public class Computetheproduct {
   public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	   System.out.println("Input the first number: ");
	   int num1 = in.nextInt();
	   
	   System.out.println("Input the Second number: ");
	   int num2 = in.nextInt();
			 
	   System.out.println("Input the third number: ");
	   int num3 = in.nextInt();
	   
	   System.out.println(num1 + "x" + num2 + "x" +  num3 + "=" + num1 * num2 * num3);
	   
   }
}
