package DSA;

public class Linearsearch {

    static int linearSearch(int[] arr, int target){
        
        if (arr==null) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target) {
                return index;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
        int[] arr = {4,2,32,54,56,23,67,86,45,43,23,12};

        System.out.println("The Target is at Index: "+linearSearch(arr, 7));
    }
}
