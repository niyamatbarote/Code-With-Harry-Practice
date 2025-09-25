import java.util.Scanner;

public class IncrementDecrement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 23;
        System.out.println(i);
        System.out.println(i++);

        int b = i * 2;
        System.out.println(i + " x 2 = " + b);

        System.out.println(++i);
        System.out.println(i);

        System.out.println(i + " x 2 = " + b);

        char ch = 'a';
        System.out.println(++ch);

        char ab = 'v';
        System.out.println(--ab);

        float k = 7 / 4 * 9 / 2;
        System.out.println(k);

        System.out.println("Enter The Table YOu Want : ");
        int z = sc.nextInt();

        for (int c = 1; c <= 10; c++) {
            System.out.println(z + " x " + c + " = " + z * c);

        }
        sc.close();
    }
}