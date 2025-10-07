import java.util.Scanner;

class TakeInput{
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
    }
}

public class PrimeNum {
    public static void main(String[] args) {
        TakeInput tk = new TakeInput();

        tk.TakeInput1();
        tk.CheckPrime();
    }
}
