import java.util.Scanner;

public class CalculatorAD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter the Function(-,+,*,/) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '-':
                System.out.println("Result is :" + (a - b));
                break;

            case '+':
                System.out.println("Result is :" + (a + b));
                break;

            case '*':
                System.out.println("Resutl is :" + (a * b));
                break;

            case '/':
                System.out.println("Result is :" + (a / b));
                break;

            case '%':
                System.out.println("Result is :" + (a % b));

            default:
                System.out.println("Invalid Command...!!!");
                break;
        }

    }
}