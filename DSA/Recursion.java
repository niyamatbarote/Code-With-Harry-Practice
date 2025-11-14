package DSA;

public class Recursion {

    static int fibonacci(int n) {

        // Base Case :-
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int factorial(int n) {
        // Base Case :-
        if (n == 1) {
            return 1;
        }

        // Recursive Step :-
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(3));

    }
}
