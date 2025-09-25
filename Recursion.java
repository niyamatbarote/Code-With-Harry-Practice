import java.util.Scanner;

public class Recursion {

    static int factorial(int x){

        if (x==0 || x==1) {
            return 1;
        }
        else
        {
            return x * factorial(x-1);              // Function Call Itself in the Finction
        }
    }


    static int factorial_iterative(int z){          // Iterative Method
        int fact =1;
        if (z==0 || z==1) {
            return 1;
        }else{
            for (int i=1; i<=z; i++) {
                fact *= i;
            }
        }
        return fact;
    }


    public static void main(String[] args) {
        System.out.print("Enter The Number You Want The Factorial of: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("The Factorial of "+a+" is : "+factorial(a));

        System.out.println("The Factorial of "+a+" is : "+factorial_iterative(a));
    }
    
}
