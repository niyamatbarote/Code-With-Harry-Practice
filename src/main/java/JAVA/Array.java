
public class Array {

    public static void main(String[] args) {
        //NOTES ==============================================================================
        
        // int [] marks;   // Declaration
        // marks = new int[5];     // Memory Allocation


        // int [] marks = new int[5];      //Declararin ANd Memory Allocation


        // int [] marks = {10,5,3,5,5};        //Declaration And Initialization

        //========================================================================================


        // Printing the Array ===
        
        int [] array = {23 ,32,12,4,5,32};
        System.out.println("The length of the array is: " +array.length);
        System.out.println("The last index of the Array is : "+ (array.length-1));
        System.out.println("Following are the elements of the Array: ");
        for(int i = 0; i<array.length; i++ ){
        System.out.println(array[i]);      
        }

        // "FOR - EACH" MEthod to Print the array Elements ============================

        // int [] array = {2,5,43,3,23,7,98,65,35,24};

        // for (int elements: array) {
        //     System.out.println(elements);    
        // }

        // Write a program to Print The Elements of the Array in REVERSE Order ===========

        // int [] marks = {45,65,99,39};

        // for (int i = marks.length-1; i>=0; i--) {
        //     System.out.println(marks[i]);
        // }
    }
    
}
