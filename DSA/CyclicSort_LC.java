package DSA;

import java.util.Arrays;

public class CyclicSort_LC {

    // Amazon Interview Question (Leetcode Q) 258)
    // https://leetcode.com/problems/missing-number/
    static int[] swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    static int findMissingNum(int[] arr) {
        int ans = -1;
        int i = 0;
        while (i < arr.length) {
            int corrct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[corrct]) {
                swap(arr, i, corrct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                ans = j;
            }
        }
        return ans;
    }
    // ===================================================================================================

    //

    public static void main(String[] args) {
        int[] arr = { 2, 0, 3, 4, 5, 6, 8, 1 };
        System.out.println(findMissingNum(arr));
    }
}
