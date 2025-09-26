import java.util.Random;
import java.util.Scanner;

class Game{
    int guess;
    int random;

    Game(){
        Random rd = new Random();
        random= rd.nextInt(101);
    }

    public void Guess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Guess Number : ");
        guess = sc.nextInt();
    }

    boolean isCorrect(){
        if (guess == random) {
            return true;
        }
        return false;
    }
}

public class GuessTheNumberOop {
    
    public static void main(String[] args) {
        
    }
}
