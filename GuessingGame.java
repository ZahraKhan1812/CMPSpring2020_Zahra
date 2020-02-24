import java.swing.JOptionpane;
import java.util.Random;
public class RandomNumberGuessingGame{
  public static void main(String [] args) {
    
    Random random = new Random();
    int randomNumber = random.nextInt( 45 );
    boolean userCorrect = false;
    String userInputString;
    int userGuessedNumber;
    
    while( !userCorrect ) {
      userInputString = JOptionpane.showInputDialog("Guess the number; ");
      userGuessedNumber = Integer.parseInt(userInputString);
      if(userGuessedNumber > randomNumber) {
        JOptionpane.showInputDialog
      }
    }
  }
}
