package DSA;

import java.util.Scanner;

public class BinarySearch {

    // Binary Search :-
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found :-
                return mid;
            }
        }
        // Target Not Found :-
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sorted Array:-
        int[] arr = { 12, 14, 16, 18, 20, 23, 25, 27, 30, 32, 33, 35 };

        System.out.println(binarySearch(arr, 20));
    }
}
