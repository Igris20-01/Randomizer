import java.util.Random;
import java.util.Scanner;

public class GuessedNumberGame {

     Random random = new Random();

     int secretNumber = random.nextInt(100)+1;

     int attempts = 0;

     Scanner scan = new Scanner(System.in);

    public void generateRandomNumber() throws Exception{
        System.out.println("Welcome to our game \" Guessed Number \" ");
        Thread.sleep(1000);
        System.out.println("Try to guess the number from 1 to 100. ");
        Thread.sleep(1000);

        while (true){
            System.out.print("Please enter your number: ");
            int userGuess = scan.nextInt();
            attempts++;

            if (userGuess == secretNumber){
                System.out.println("You find the number my congratulation");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Secret number is greater, please try again");
            } else {
                System.out.println("Secret number is lower, please try again");
            }
        }
    }




}
