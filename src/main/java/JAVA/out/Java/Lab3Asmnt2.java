import java.util.Scanner;

public class Calculator {

    // First add() - takes two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Second add() - takes three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Third add() - takes two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Call first method: add(int, int)
        System.out.print("Enter two integers to add: ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int sum1 = calc.add(a1, b1);
        System.out.println("Sum of two integers: " + sum1);

        // Call second method: add(int, int, int)
        System.out.print("Enter three integers to add: ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int sum2 = calc.add(a2, b2, c2);
        System.out.println("Sum of three integers: " + sum2);

        // Call third method: add(double, double)
        System.out.print("Enter two decimal numbers to add: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double sum3 = calc.add(d1, d2);
        System.out.println("Sum of two doubles: " + sum3);

        sc.close();
    }
}
