

public class Main {
    public static void main(String[] args) throws Exception {


        GuessedNumberGame guessedNumberGame = new GuessedNumberGame();
        ComputerGuessedNumber computerGuessedNumber = new ComputerGuessedNumber();



        guessedNumberGame.generateRandomNumber();
        computerGuessedNumber.computerGuessedNumber();




            if(guessedNumberGame.attempts == computerGuessedNumber.attempt){
                System.out.println("Count of attempts same");
            } else if (guessedNumberGame.attempts > computerGuessedNumber.attempt) {
                System.out.println("User attempts greater than Computer");
            }else {
                System.out.println("Computer attempt greater than User");
            }


    }
}