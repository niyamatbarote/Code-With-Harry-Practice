import java.util.Scanner;

public class Cgpa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        System.out.println("Enter the Marks of 1st Subject: ");
        float a = sc.nextFloat();

        System.out.println("Enter the Marks of 2nd Subject: ");
        float b = sc.nextFloat();

        System.out.println("Enter the Marks of 3rd Subject: ");
        float c = sc.nextFloat();

        float sum = a + b + c;

        float cgpa = sum / 30;

        System.out.println("Your CGPA is: " + cgpa);
    }
}
