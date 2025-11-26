import java.util.Scanner;

public class DistConvert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO I CONVERT THE DISTANCE FROM KM TO METERS, ENTER YOUR INPUT: ");
        float a = sc.nextFloat();

        float b = a * 1000;

        System.out.println(a + " CONVERTED INTO THE METERS AND IT MEANS:- " + b + " METERS ");
    }
}