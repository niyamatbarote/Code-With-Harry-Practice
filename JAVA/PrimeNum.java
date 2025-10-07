import java.util.Scanner;

class TakeInput{
<<<<<<< HEAD
    int i;
    Scanner sc = new Scanner(System.in);
    public void TakeInput1(){
        System.out.println("Enter The Number: ");
        
        i = sc.nextInt();
    }
    public void CheckPrime(){
        if (this.i==2 || this.i==3) {
            System.out.println("Its Not PRIME NUMBER ");
        }
        else if( this.i%2==0  || this.i%3==0){
            System.out.println("Its Not Prime Number");
        }else{
            System.out.println("It is PRIME NUMBER");
        }
=======
    
    
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
>>>>>>> ce4c3c5 (1 Commit)
    }
}

public class PrimeNum {
<<<<<<< HEAD
    public static void main(String[] args) {
        TakeInput tk = new TakeInput();

        tk.TakeInput1();
        tk.CheckPrime();
=======
    
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

>>>>>>> ce4c3c5 (1 Commit)
    }
}
