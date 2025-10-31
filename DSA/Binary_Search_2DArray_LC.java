package DSA;

import java.util.Arrays;

public class Binary_Search_2DArray_LC {

    // Q) Finding elements in Row Sorted & Column Sorted Arrya:-
    // Solution:-
    static int[] searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            // 3 Cases To check -->
            if (matrix[r][c] == target) { // 1
                return new int[] { r, c };
            }
            if (matrix[r][c] > target) { // 2
                c--;
            } else { // 3
                r++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };

        System.out.println(Arrays.toString(searchMatrix(matrix, 33)));
    }
}
