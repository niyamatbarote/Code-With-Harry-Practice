package DSA;

import java.util.Arrays;

public class BubbleSort {
    static void swap(int[] arr, int el1, int el2) {
        int temp = arr[el1];
        arr[el1] = arr[el2];
        arr[el2] = temp;
        // System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] array) {
        while (array[0]<array[array.length-1]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-1; j++) {
                if (array[i]>array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 4, 1 };

        bubbleSort(arr);
    }
}
