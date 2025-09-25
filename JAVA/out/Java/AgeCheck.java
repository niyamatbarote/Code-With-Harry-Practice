import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age");

        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("your age is " + a ); 
            System.out.println("Allowed in Club");

        } else {
            System.out.println(a + " Not Allowed In Club Becaue Under Age");
        }
        sc.close();
    }
}