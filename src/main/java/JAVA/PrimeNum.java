import java.util.Scanner;

class TakeInput{
    
    
    public static boolean isPrime(int n){
        // Condition 1
        if (n<=1) {
            return false;
        }
        // Condition 2
        if (n==2 || n==3) {
            return true;
        }
        // Condition 3
        if (n%2==0 || n%3==0) {
            return false;
        }
        // Condition 4
        // Check divisibility for numbers of the form 6k ± 1 up to √n 
        for (int i=5; i*i<=n; i+=6) {
            if (n%i==0 || n%(i+2)==0) {
                return false;
                
            }
        }
        return true;
    }
}

public class PrimeNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TakeInput tk = new TakeInput();
        System.out.println("Enter Your Input: ");
        int k = sc.nextInt();
        if (tk.isPrime(k)) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }

    }
}