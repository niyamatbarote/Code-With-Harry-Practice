import java.util.Scanner;

public class CwhEqn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float v;
        float u;
        float a;
        float s;

        System.out.println(" Enter Value of v :");
        v = sc.nextFloat();

        System.out.println(" Enter Value of u :");
        u = sc.nextFloat();

        System.out.println(" Enter Value of a :");
        a = sc.nextFloat();

        System.out.println("Enter value of s :");
        s = sc.nextFloat();

        float sum = ((v * v) - (u * u)) / (2 * a * s);
        System.out.println(sum);
    }
}
