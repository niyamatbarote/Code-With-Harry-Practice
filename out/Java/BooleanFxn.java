import java.util.Scanner;

public class BooleanFxn {
    
    public static boolean checkEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        boolean b = checkEven(1);
        System.out.println(b);

    }
}