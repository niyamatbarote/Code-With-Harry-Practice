import java.util.Scanner;

public class Myclass {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Number");
      int a = sc.nextInt();

      System.out.println("Enter Number");
      int b = sc.nextInt();

      int sum = a * b;

      System.out.println(sum);

      sc.close();

   }
}
