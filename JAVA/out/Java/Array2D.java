
// 2D Array:
// Synatax:
// int [][] matrix = new int [row][column];
// matrix[1][0]=90;
import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of rows and columns accordingly: ");

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][row] = sc.nextInt();

            }
        }
        System.out.println("Output: ");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}