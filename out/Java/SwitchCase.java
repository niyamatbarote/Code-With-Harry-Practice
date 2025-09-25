import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Command: ");

        int num = sc.nextInt();

        switch (num) {

            case 1:
                System.out.println("Hello Guys");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("wassup Bro");
                break;

            default:
                System.out.println("No Valid Command");
                break;
        }
        sc.close();
    }
}