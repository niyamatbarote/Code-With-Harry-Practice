
//write a fxn to calculate whether the no. is even or odd
import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " Is an Even Number");
        } else {
            System.out.println(a + " Is an Odd Number");

        }
        sc.close();
    }
}
