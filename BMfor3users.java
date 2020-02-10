/**
 * 
 * @author Zahra Khan
 *created: 2/10/20
 *
 */
import java.util.Scanner ;
public class BMfor3users {

	public static void main(String [] args) {
	
		Scanner scanner = new Scanner( System.in );
		double userWeight;
		double userHeight;
		double bmi;
		
		
		System.out.println("Please enter  Marias weight" );
		userWeight = scanner.nextDouble();
		
		System.out.println("Please enter Marias height" );
		userHeight = scanner.nextDouble();
		
		bmi = ( userWeight * 703 ) / ( userHeight * userHeight );
		
		
		System.out.println("Please enter  Davids weight" );	
		userWeight = scanner.nextDouble();
		
		System.out.println("Please enter Davids height" );
		userHeight = scanner.nextDouble();
		
        System.out.println("Please enter  Joe weight" );	
        userWeight = scanner.nextDouble();
        
		System.out.println("Please enter Joe height" );
		userHeight = scanner.nextDouble();
		
		System.out.println(" User \t BMI");
		
	}
}
