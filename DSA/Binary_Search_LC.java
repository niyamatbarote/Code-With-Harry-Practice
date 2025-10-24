package DSA;

public class Binary_Search_LC {

    // Ceiling of a Number Problem (Using Binary Search)(Sorted Array):-

    static int findPeakElement(int[] arr, int target) {

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

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 25, 30, 44, 90 };
        // Index----> 0, 1, 2, 3, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13, 14

        // System.out.println(ceilingNumber(arr, 19));
        System.out.println(findPeakElement(arr, 91));
        System.out.println(floorNumber(arr, 1));

    }
}
