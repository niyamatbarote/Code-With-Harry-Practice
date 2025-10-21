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

    static boolean searchStr(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true ;
            }
        }

        return false;

    }

    // Using For Each Loop:-
    static boolean searchStr2(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (char element : str.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
         return false;
    }

    public static void main(String[] args) {
        
        int[] arr = {4,2,32,54,56,23,67,86,45,43,23,12};
        String str = "Niyamat";

        System.out.println("The Target is at Index: "+linearSearch(arr, 86));
        System.out.println(searchStr(str, 'y'));
        System.out.println(searchStr2(str, 'a'));

    }
}
