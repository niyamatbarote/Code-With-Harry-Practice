// Write a program to Calculate the sum of n natural Numbers Uisng Recursive Finction

public class RecursionAddnNatNum {
    
    static int  Sumn(int n){

        if (n==1) {
            return 1;
        }
        return n + Sumn(n-1);

    }


    public static void main(String[] args) {
        System.out.println(Sumn(4));

    }
}
