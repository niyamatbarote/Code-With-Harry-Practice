import java.util.Scanner;

public class ForLoop {
    
    public static void main(String[] args) {
        // for (int i=1; i<=10; i++) {
        //     System.out.println(i);
        // }
        
        // for (int i = 4; i<=4; i--) {
        //     for (int a = i; a<=i; a++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Q) Program to print n Even Natural Numbers
        //Note:- 2n = EVEN
        //Note:- 2n+1 = ODD
        Scanner sc = new Scanner(System.in);

        // System.out.println("How Many EVEN NATURAL Numbers You want to Print: ");
        // int i = sc.nextInt();
        // System.out.println("Following are "+i+" Even Numbers for Uhhhhh : ");
        // for (int n=0; n<=i; n++) {
        //     System.out.println(2*n);
        // }

        //Q) Program to Print 5 ODD numbers in REVERSE :
        //DECREMENTING FOR LOOP

        for (int n=5; n>=0; n--){
            System.out.println(2*n+1);
        }
    }
}
