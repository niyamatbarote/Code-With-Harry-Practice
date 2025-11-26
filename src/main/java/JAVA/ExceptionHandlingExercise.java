import java.util.Scanner;

public class ExceptionHandlingExercise {

    // Program to Get 5(any) Number of Input from user until user puts correct input
    // and then print "error" messge if the limit exceeds of input

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 5;
        // int j = 0;
        int c = 0;
        while (true && c < 5) {
            try {
                System.out.println("Enter a Number");
                int j = sc.nextInt();
                System.out.println(i / j);
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

            c++;
        }
        if (c > 5) {
            System.out.println("Error");
        }
    }
}

// Similarly we can do this to access the array integer until we input the
// correct index Number
