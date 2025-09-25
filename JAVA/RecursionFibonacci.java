// Write a program to print (n)th term in the fibonaccci series Using Recursion

public class RecursionFibonacci {

    static int  Fibonacci(int n){
        if (n==1) {
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}