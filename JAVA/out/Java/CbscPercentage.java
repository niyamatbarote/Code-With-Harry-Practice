import java.util.Scanner;

public class CbscPercentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your English Marks: ");
        float a = sc.nextFloat();

        System.out.println("Enter Your Maths MArks: ");
        float b = sc.nextFloat();

        System.out.println("Enter Your Physics Marks: ");
        float c = sc.nextFloat();

        System.out.println("Enter YOur Hindi Marks: ");
        float d = sc.nextFloat();

        System.out.println("Enter Your Chemisrty Marks: ");
        float e = sc.nextFloat();

        float sum = (a + b + c + d + e) / 500 * 100;

        System.out.println("Your CBSC Percentage is: " + sum);
    }
}