package DSA;

import java.util.Arrays;

public class Array_Swap {

    // Method to Swap the Elements in an Array :-
    static void swap (int[] arr, int IndexA, int IndexB){
        int temp = arr[IndexA];
        arr[IndexA]=arr[IndexB];
        arr[IndexB]=temp;
    }

    // Method to Get MAX FRom An Array:-
    static void getMax(int[] lisy){
        int max= 0;
        for (int i = 0; i < lisy.length; i++) {
            if (max<lisy[i]) {
                max = lisy[i];
            }
        }
        System.out.println("The Max From This Array is:  "+ max);
    }

    public static void main(String[] args) {
        
        int[] arr = {1,9,3,7,5,10,4};
        swap(arr, 0, 4);
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

        getMax(arr);
        
    }
}
