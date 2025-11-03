package DSA;

import java.util.ArrayList;
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
        // int ans = -1;
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;   // returning Directly and not storing it, bcoz it maybe overwritten
            }
        }
        return arr.length;
    }

    // ===================================================================================================
    // Google Interview Question (LC Q) 448)
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    // Note:- if range --> [0,N] , then --> element will be at  index = element
    // if range --> [1,N], then --> element will be at index = element - 1
    static List<Integer> findAllDuplicates(int[] arr) {
        int i= 0;
        while (i<arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        // check the duplicates:-
        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] arr = { 2, 0, 3, 4, 5, 6, 8, 1 };
        int[] array = {4,5,1,6,9,7,8};
        List<Integer> dup = findAllDuplicates(array);
        System.out.println(findAllDuplicates(array));
        // System.out.println(findMissingNum(arr));
    }
}
