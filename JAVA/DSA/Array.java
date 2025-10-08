package DSA;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("Enter The String Value in Array : ");
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
        System.out.print(Arrays.toString(str));
    }
}
