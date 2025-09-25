
//calculate whether the given no. prime or not
import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a % 2 != 0) {
            System.out.println(a + " This is Prime Number");

        } else {
            System.out.println(a + " Its not an Prime number");
        }
        sc.close();

    }
}