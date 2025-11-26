import java.util.Scanner;
public class Fibonacci {

    static int Fiboacci_Series(int n){
        if (n<=1) {
            return n;
        }else{
            return Fiboacci_Series(n-1)+Fiboacci_Series(n-2);       //====RECURSIVE Calling====
        }
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter How Many No. of Fibonacci Series you Want: ");
        int c=sc.nextInt();

            for(int i = 0; i<c; i++){
                System.out.print(Fiboacci_Series(i)+" ");
            }

    }
    
}
