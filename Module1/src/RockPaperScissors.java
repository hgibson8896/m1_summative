import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        int rounds = 0;
        String stringRounds;

        int userChoice;
        String stringUserChoice;

        int computerChoice;


        int userTotalScore = 0;
        int computerTotalScore = 0;

        int tie = 0;

        boolean playAgain = true;
        String letsPlay = "y";

     do {
         Scanner userInput = new Scanner(System.in);
         System.out.println("How many rounds would you like to play?");

         boolean isValid = false;

         do {

             try {

                 stringRounds = userInput.nextLine();
                 rounds = Integer.parseInt(stringRounds);

                 if (rounds >= 1 && rounds <= 10) {
                     isValid = true;

                 } else {
                     System.out.println("Must be betwen 1 and 10!");
                 }

             } catch (NumberFormatException ex) {
                 System.out.println("Please enter a whole number between 1 and 10!");

             }

         } while (isValid == false);

         while (rounds > 0) {
             rounds--;

             Scanner userInputChoice = new Scanner(System.in);
             System.out.println("Rock = 1, Paper = 2, Scissors = 3, GO!!!");
             stringUserChoice = userInputChoice.nextLine();
             userChoice = Integer.parseInt(stringUserChoice);

             Random randomizer = new Random();
             computerChoice = randomizer.nextInt((3 - 1) + 1) + 1;// ((max- min)+1) + min

             if (userChoice == computerChoice) {
                 tie++;

             } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
                 userTotalScore++;

             } else {
                 computerTotalScore++;
             }


         }

         if (userTotalScore == computerTotalScore) {
             System.out.println("It's tie!  Your Score: " + userTotalScore + " Computer Score: " + computerTotalScore + " # of ties: " + tie);
         } else if (userTotalScore > computerTotalScore) {
             System.out.println("YOU WIN!  Your Score: " + userTotalScore + " Computer Score: " + computerTotalScore + " # of ties: " + tie);

         } else {
             System.out.println("Better luck next time  Your Score: " + userTotalScore + " Computer Score: " + computerTotalScore + " # of ties: " + tie);

         }
         System.out.println();

         Scanner userPlay = new Scanner(System.in);
         System.out.println("Would you like to play again? (y/n)");
         letsPlay = userPlay.nextLine();

         if("y".equals(letsPlay)){
             playAgain = true;
         }else{
             System.out.println("Thanks for playing, bye...");
             playAgain = false;
         }


     }while(playAgain == true);
    }
}
