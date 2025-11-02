package DSA;

import java.util.Arrays;

public class BubbleSort {
    static int[] swap(int[] arr, int el1, int el2) {
        int temp = arr[el1];
        arr[el1] = arr[el2];
        arr[el2] = temp;
        // System.out.println(Arrays.toString(arr));
        return arr;
    }

    static int[] bubbleSort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    if (array[j-1] > array[j]) {
                        swap(array, j-1, j);
                    }
                }
            }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = { 15, 5, 3, 9, 12, 20, 1, 2 };

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
