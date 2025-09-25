import java.util.Scanner;

public class AddDigit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits: ");
        int a = sc.nextInt();

        int sum = 0;

        while (a != 0) {
            int digit = a % 10;
            sum += digit;
            a = a / 10;
        }
        System.out.println("The sum of the digits is : " + sum);
    }
}