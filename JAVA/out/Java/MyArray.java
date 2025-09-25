// Arrays:
// once size of array is declared it cant be changed.
// It follows Zethoth Base Indexing

// Syntax:
// Data_Type[] ArrName = new Data_Type[Size];
// marks[1] = 98;
// sout(marks[1]);
// o/p= 98
import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[sc.nextInt()];
        System.out.println("Enter First Array Number ");
        marks[0] = sc.nextInt();
        System.out.println("Enter 2nd Array Number ");

        marks[1] = sc.nextInt();
        System.out.println("Enter 3rd Array Number ");

        marks[2] = sc.nextInt();
        System.out.println("Enter 4th Array Number ");

        marks[3] = sc.nextInt();
        System.out.println("Enter 5th Array Number ");

        marks[4] = sc.nextInt();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Output: " + marks[i]);

        }

    }
}
// take an array as i/p from the user then search for 'x' element and print
// their imdex.