import java.util.Scanner;
public class VarArgs {

    static int sum(int ...arr){                        // Variable Arguments :- Many Integers Are Put in The MEthod Inthe Form of Array using "..."        
    int add =0;             // If we Want Atleat 1 Integer as input then === static int sum(int x, int ...arr){}

    for(int e: arr){
        add += e;
    }
    System.out.print(add);
    return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Addtion of 0 Digits is : "+ sum());
        // System.out.println("Addition of 1 Digit is : "+ sum(1,2));
        // System.out.println("Addtion of 2 Digits is: "+sum(4,3,9));
        // System.out.println("Addition of n Digits is : "+sum(3,5,4,3,2,1,3,3,4,3,2,2,1));

        System.out.println("Enter How Many Numbers You Want to Add : ");
        int n = sc.nextInt();
        int [] marks = new int [n];

        System.out.println("Enter The Numbers: ");

        for (int i = 0; i<marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        sum(marks);
        
    }
}
