import java.util.Random;
import java.util.Scanner;

class Game {
    int guess;
    int random;
    int attempt = 0;

    Game() {
        Random rd = new Random();
        random = rd.nextInt(101);
    }

    public void Guess() {
        attempt++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Guess Number : ");
        guess = sc.nextInt();
    }

    boolean isCorrect() {
        if (guess == random) {
            System.out.println("Your Guess is Correct : " + random + " Was The Random Number ");
            System.out.println("You Guess The Number in : " + attempt + " Attempts");
            return true;
        } else if (guess > random) {
            System.out.println("Too High.. Guess SMALLER Number");
        } else if (guess < random) {
            System.out.println("Too Low .. Guess GREATER Number");
        }
        return false;
    }
}

public class GuessTheNumberOop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Object Created :-
        Game game = new Game();

        boolean b = false;
        // Game Initializing :-
        while (!b) {

            game.Guess();
            b = game.isCorrect();
            // game.Repeat();

        }

    }

}
