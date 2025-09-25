import java.util.Scanner;

public class BoolPrime {

    public static boolean isPrime(int sum) {
        return sum % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }

    }
}