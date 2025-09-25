import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
         System.out.println("Enter Yuour Age: ");
         int a = sc.nextInt();
        
         switch (a) {
                case 19:
                System.out.println("This is the Last Year of Your Teenage");
                break;

                case 20:
                System.out.println("This is the Entrance in your adulthood");
                break;

                case 25:
                System.out.println("You Need to Get Married");
                break;
         
            default:
            System.out.println("Why is There is problem in My VScode...??");
                break;
         }
        }
}