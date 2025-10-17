package DSA;

import java.util.Arrays;

public class Array_Swap {

    // Method to Swap the Elements in an Array :-
    static void swap (int[] arr, int IndexA, int IndexB){
        int temp = arr[IndexA];
        arr[IndexA]=arr[IndexB];
        arr[IndexB]=temp;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        swap(arr, 0, 4);
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        
    }
}
