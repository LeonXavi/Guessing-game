
import java.util.Scanner;

public class GuessingGame2 {

	public static void main(String[] args) {
		
		//Defining the variables
		
		
		String nameToGuess = "Jonas" ;
		int numberOfTries = 0;
		Scanner input = new Scanner (System.in);
		String guess;
		boolean win = false;
		boolean stop = false;
		
		while (win == false && stop == false) {
			System.out.println("Guess my name");
			guess = input.nextLine();
			numberOfTries++;
			
			if (guess.equals("Jonas")) {
				win = true;
				System.out.println("You guessed right!");
				System.out.println("It took you " + numberOfTries + " tries");
				
			// Adding the possibility to end without a guess
				
			} else if (guess.equals("end")) {
				stop = true;
				System.out.println("End of game.");
				
			// Print if you guess wrong
				
		    } else if (guess != nameToGuess) {
				System.out.println("Your guess is wrong");	
			} 
			
			 
			
		}
		  	

	}
   
}
