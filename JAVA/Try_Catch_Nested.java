import java.util.Scanner;

// QUICK QUIZ :- Take Continue Input Until You Enter Correct Input

public class Try_Catch_Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 43;
        arr[1] = 53;
        arr[2] = 48;
        arr[3] = 84;
        arr[4] = 63;

        
        boolean isTrue =true;
        while (isTrue) {
        System.out.println("Enter The Index Number : ");
        int index = sc.nextInt();
        try {
            try {
            System.out.println(arr[index]);
                isTrue = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                // TODO: handle exception
                System.out.println("Index Out Of Bound Error.. Choose Other Index");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
    }
}
