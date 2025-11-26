
import java.util.Scanner;


public class ForLoopPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q) Program to Make sum of 1st n even Numbers Using While Loop

        // int n = 4;
        // int sum = 0;
        // for (int i = 0; i<n; i++) {
            
        //     sum = sum + (2*i);
        //     System.out.println(sum);
        // }
        // System.out.println("The sum of First "+n+" Natural Numbers is : ");
        // System.out.println(sum);

        //Q) Write a Program To Print Multiplication Table of Any 'n' Number

        // System.out.println("Enter THe Number of Table You Want : ");
        // int sum =0;
        // int n = sc.nextInt();
        // System.out.println("Following is the table of "+n);
        // for (int i= 1; i<=10; i++) {
        //     System.out.println(n*i);
        //     sum = sum + (n* i);  //to Print Total sum of the Table
        // }
        // System.out.println(sum);

        //Q) Write a program to Print Multiplication of Any Number in "REVERSE" :
        
        // System.out.println("ENter WHich Table YOu Want: ");
        // int n = sc.nextInt();
        // System.out.println("Jaisi Apki Iccha HUZUR ...!");
        // for (int i= 10; i>=1; i--) {
        //     System.out.println(n*i);
        // }

        //Q)Wrtite A Program to Find FACTORIAL Of a Number Using FOr LOOP;

        // System.out.println("Kis Number Ka Factorial Chahiye Bha Bol ");
        // int n = sc.nextInt();
        // int fact = 1;
        // System.out.println("Ye Le Bhai Tere Liye Kuch Bhi : ");
        // for (int i = n; i>0; i--) {

        //     fact = fact * (i);
            
        // }
        // System.out.println("Factorials Are: ");
        // System.out.println(fact);

        //Q)Write a program to Print Multiplication of any Number Using "While Loop"

        System.out.println("Bol Bhai Number Bol");
        int n = sc.nextInt();
        int i = 1;
        while (i<=10) {
            
            System.out.printf("%d X %d = %d \n", n,i,n*i);
            i++;
            
        }
    }
    
}
