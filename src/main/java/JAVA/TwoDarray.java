import java.util.Scanner;

public class TwoDarray {

    public static void main(String[] args) {
        
        //int [] marks = new int [4];        // 1 D Array 

        int [][] array = new int [2][3];     // 2 D Array

        Scanner sc = new Scanner(System.in);
                                                         
        array[0][0] =sc.nextInt();
        array[0][1] =sc.nextInt();
        array[0][2] =sc.nextInt();
        array[1][0] =sc.nextInt();
        array[1][1] =sc.nextInt();
        array[1][2] =sc.nextInt();

        for (int i= 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}