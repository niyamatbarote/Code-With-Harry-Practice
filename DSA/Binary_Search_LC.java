package DSA;

import java.util.Arrays;

public class Binary_Search_LC {

    // Ceiling of a Number Problem (Using Binary Search)(Sorted Array):-

    static int ceilingNumber(int[] arr, int target) {

        // What if There is No Ceiling of a Number:-
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int exp = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
                // exp = mid; // Wrong..!!
            } else { // (target<arr[mid])
                end = mid - 1;
                exp = mid;
            }
        }
        return start;
    }

    // =============================================================================================

    // Floor of a Number (Sorted Array)(Binary Search):-

    static int floorNumber(int[] arr, int target) {

        // what if there is no floor Numbber (Optional)
        // if (target < arr[0]) {
        // return -1;
        // }

        int start = 0;
        int end = arr.length - 1;
        int exp = 0; // No need as we Are returning End
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
                // exp = mid; // Wrong..!!
            } else { // (target<arr[mid])
                end = mid - 1;
                exp = mid;
            }
        }
        return end;
    }

    // ===============================================================================

    // ================================================================================
    // Ceiling of a Number (Unsorted Array):-
    // static int ceilingNumber(int[] arr, int target) {
    // int ceiling = 0;

    // for (int i = 0; i < arr.length; i++) {
    // int sum = 0;
    // if (arr[i] == target) {
    // return i;
    // } else if (arr[i] > target) {
    // sum = i;
    // }

    // if (sum < arr[i]) {
    // ceiling = sum;
    // }
    // }
    // return ceiling;
    // }

    // 744. Find Smallest Letter Greater Than Target
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=vrww4tkr
    static char nextGreatChar(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

    // =====================================================================================================================

    // Q)34 First and Last Position of an Element in Sorted Array :-
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=problem-list-v2&envId=vrww4tkr
    static int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = leftMost(arr, target);
        ans[1] = rightMost(arr, target);
        return ans;
    }

    static int leftMost(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                ans = mid;
                end = mid - 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int rightMost(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                ans = mid;
                start = mid + 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // ==========================================================================================================================

    // Q) Amazon Interview Question :-
    // Find the element from an INFINITE SORTED ARRAY :-

    static int myAns(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // Double the box value
            // Formula :- end = end + ArraySize*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, start, end, target);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // =====================================================================================================

    // Q)162 PEAK INDEX
    // https://leetcode.com/problems/find-peak-element/?envType=problem-list-v2&envId=vrww4tkr

    static int findPeakElement(int[] arr) {
        // int peak = 0; no needed
        // int max = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start +(end-start)/2;

            if (arr[mid]>arr[mid+1]) {
                // This is the Desc part of the array
                end = mid;
            }else{      // (arr[mid]<arr[mid+1])
                // This is the Asc part of the array
                start = mid + 1;
            }
        }
        return start; // or return end;
    }

    // ===================================================================================================

    public static void main(String[] args) {
        // char[] arr1 = { 'c', 'f', 'j' };
        // int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 25, 30, 44, 90 };
        // Index----> 0, 1, 2, 3, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13, 14
        // int[] arr2 = { 2, 4, 7, 7, 7, 7, 8, 8, 9 };
        int[] mountain = { 10, 12, 20, 22, 30, 19, 15, 9 };

        // System.out.println(ceilingNumber(arr, 19));
        // System.out.println(findPeakElement(arr, 91));
        // System.out.println(floorNumber(arr, 1));
        // System.out.println(nextGreatChar(arr1, 'f'));
        // System.out.println(Arrays.toString(searchRange(arr2, 7)));
        // System.out.println(leftMost(arr2, 7));
        // System.out.println(rightMost(arr2, 7));
        // System.out.println(myAns(arr, 44));
        System.out.println(findPeakElement(mountain));
    }
}
