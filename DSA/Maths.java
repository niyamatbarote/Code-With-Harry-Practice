package DSA;

public class Maths {

    // This condition checks the last digit in the binary number and hence it
    // decides if it is odd or not
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {

        System.out.println(isOdd(55));
        System.out.println(isOdd(20));
    }
}
