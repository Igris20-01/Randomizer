import java.util.Scanner;

public class ComputerGuessedNumber {

    private int min = 1;

    private int max = 100;

    private int computerGuesses;

    private String userResponse;

    private boolean correct = false;

    public int attempt = 0;


    public void computerGuessedNumber() throws Exception {

        Scanner scan = new Scanner(System.in);
        do {
            computerGuesses = (max + min) / 2;
            Thread.sleep(1000);
            System.out.println("Computer guessed number " + computerGuesses);
            Thread.sleep(1000);
            System.out.println("Is it correct");
            userResponse = scan.nextLine();
            userResponse = userResponse.toLowerCase();


            switch (userResponse) {
                case "correct":
                    correct = true;
                    System.out.println("Omg I find the number");
                    break;
                case "greater":
                    min = computerGuesses + 1;
                    System.out.println("Try to find the number");
                    break;
                case "less":
                    max = computerGuesses - 1;
                    System.out.println("Try to find the number");
                    break;

            }


            attempt++;
        } while (scan.hasNextLine() && !userResponse.equals("correct"));
        System.out.println("I guessed see you soon");
        scan.close();
    }


}
