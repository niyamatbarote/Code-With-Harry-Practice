import java.util.Scanner;

public class Concatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String FirstName = sc.nextLine();

        System.out.println("Enter Last Name: ");
        String LastName = sc.nextLine();

        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);

        System.out.println("Lenght of Your Name is: " + FullName.length());

        

        sc.close();

    }
}
