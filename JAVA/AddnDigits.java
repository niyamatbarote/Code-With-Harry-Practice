import java.util.Scanner;
public class AddnDigits {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter HOw Many Digits u Want to Add: ");
       int n=sc.nextInt();
       int sum = 0;

       for(int i=1; i<=n; i++){
        System.out.print("Enter Your "+i+" Number is: " );
        sum += sc.nextInt();
       }
        System.out.println("The Total is: "+sum);
    }
    
}
