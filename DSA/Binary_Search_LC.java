package DSA;

public class Binary_Search_LC {

    // Ceiling Number Problem (Using Binary Search):-   ===========================
    static int findPeakElement(int[] arr, int target) {
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
        return exp;
    }
    //===============================================================================

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 25, 30, 44, 90 };
        // Index----- 0, 1, 2, 3, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13, 14
        System.out.println(findPeakElement(arr, 9));

    }
}
