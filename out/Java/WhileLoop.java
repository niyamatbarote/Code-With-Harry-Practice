
//while loop eg
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        while (i <= 100) {
            System.out.println("Number " + i);
            i++;

        }
        sc.close();
    }
}