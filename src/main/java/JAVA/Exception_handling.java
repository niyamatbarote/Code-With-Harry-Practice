package JAVA;

import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        
        arr[0] = 33;
        arr[1] = 59;
        arr[2] = 71;

        System.out.println("Enter The Index You Want: ");
        int index = sc.nextInt();
        System.out.println("Enter The Number You Want to Divide Index With : ");
        int div = sc.nextInt();

        try {
            System.out.println("The Result of This is:  "+arr[index]/div);
        } 
        // Check if Index Out Of Bound Exception Has Occured
        catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Index Out Of Bound Exception Occured: ");
            System.out.println(e);
        }
        // Check if Arithmetic Exception Has Occured
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured..!! ");
            System.out.println(e);
        }
        // Check if Any Ohter THan Estimated Error Has Occured
        catch(Exception e){
            System.out.println("Some Unkmown Error Has Occured..!!");
            System.out.println(e);
        }



    }
}
