import java.util.Scanner;
public class ArrayPractice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Q) Create an Array of 5 Float & Calcualte the sum ===========

        // float [] array = {4.8f,10.5f,15.5f,20.8f,25.9f};
        
        // float sum = 0;
        // for (float elements: array) {
        //     sum += elements;
        // }

// ================== Another Method Using For ============================

        // for (int i = 0; i<=array.length-1; i++) {
        //     sum += array[i];
        // }
        
        // System.out.println("Sum of The Given Array is : "+ sum);


        // Q) Write a Program to find out whether a given integer is Present in The Array Or Not

        // int [] array = {5,4,7,2,9,7};
        // System.out.println("Enter The Element You Want TO FInd in the Array: ");
        // int num = sc.nextInt();

// ===================Method 1 ==========================

        // boolean isInArray = false;
        // for (int element:array){
        //     if(num == element){
        //         isInArray = true;
        //         break;
        //     }
        //     if (isInArray) {
        //         System.out.println("The Element is Present In THE Array..!!");
        //     }else{
        //         System.out.println("Error 404 Not Found..!!");
        //     }
        // }

// ===========================Method 2 ===================================

        // for (int i = 0; i<=array.length-1; i++) {
        //     if (num == array[i]) {
        //         System.out.println("Integer FOund..!!");
        //     }else{
        //         System.out.println("Error 404 Not Found..!!");
        //     }
        // }


// Q) Calculate The "AVERAGE MARKS" From An Array Using "FOR - EACH LOOP"

        // int [] array = {3,6,8,7,5,1,3};

        // float sum = 0.0f;

        // for (int i = 0; i<array.length; i++) {
        //     sum += array[i];
        // }
        // int a = array.length;
        // float avg = (sum/a);
        // System.out.println("The Average of The Array is: " + avg);

// Q) Create a Java Program to Add Two Matrices of Size 2x3 ========================

// int [][] mat1 = {{1,2,3},
//                  {2,3,1}};

// int [][] mat2 = {{4,3,1},
//                  {2,2,2}};

// int [][] result ={{0,0,0},
//                   {0,0,0}};   
                  
// for (int i = 0; i<mat1.length; i++) {
//     for (int j=0; j<mat1[i].length; j++) {
//         result[i][j] = mat1[i][j] + mat2[i][j];
//         System.out.print(result[i][j] + " ");
//     }
//     System.out.println();
// }     

// ===================================================================================

// Q) REVERSE THE ARRAY ==============================================================

        // int [] array = {1,2,3,4,5};
        // int n= Math.floorDiv(array.length,2); // NOTE :- HERE WE USED "MATH" LIBRARY
        // int l = array.length;
        // int temp;
        // for (int i=0; i<n; i++) {
        // //  Swap a[i] and a[l-1-i] =======NOTE
        // // |array[i]| |array[l-1-i]| |temp| =========Swapping LOGIC
        // // e.g. -> |3||4||x| to Swap we need to move 3 into temp and thne 4 into 0th i and then move 3 to 1st i
        // temp = array[i];
        // array[i] = array[l-1-i];
        // array[l-1-i] = temp;
        // }
        // for (int element: array) {
        //     System.out.print(element+" ");
        // }

// Q) Write a java program to FIND THE MAX ELEMENT IN THE ARRAY ====================================

        // int [] array = {22,33,44,34,43,32};

        // int max=0;

        // for (int e: array) {
        //     if (e>max) {
        //         max = e;
        //     }
        // }
        // System.out.println("The Maximum Number From The Given ARRAY is: "+max);

// Q) Write a java program to FIND THE MINIMUM ELEMENT IN THE ARRAY ===============================

        // int [] arr = {54,32,3,45,4,3};

        // int min =Integer.MAX_VALUE;                     // NOTE:- WE USE "INTEGER" LIBRARY

        // for(int element: arr){
        //         if (element<min) {
        //                 min = element;
        //         }
        // }
        // System.out.println(min);

//Q) Write a Java Program to Find IF THE ARRAY IS SORTED OR NOT ===========================================


        // int [] array = {1,2,3,4,5,10};

        // boolean isSorted = true;

        // for (int i=0; i<array.length-1; i++) {                  // here, i<array.lenght BCOZ array lenght is limited and cannot compare
        //         if ( array[i] > array[i+1] ) {
        //                 isSorted = false;
        //                 break;
        //         }
        // }
        // if(isSorted){
        //         System.out.println("The ARRAY is SORTED..!!");
        // }else{
        //         System.out.println("The ARRAY is NOT Sorted..!!");
        // }


// ==========================================================================================================

        // int [] array= {1,2,3,4};

        // boolean isSorted = true;

        // for (int i=0; i<array.length-1; i++) {
        //     if (array[i] > array[i+1]) {
        //         isSorted = false;
        //     }
        // }
        // if (isSorted) {
        //         System.out.println("SORTED..!!");
        // }
        // else{
        //         System.out.println("NOT SOTRED..!!");
        // }



// Q) Write a Java Program to GUESS TEH MISSING ELEMENT FROM THE ARRAY 1 TO n  
 
        int [] array = {1,2,3,4,5,6,7,9};

        int n = array.length+1;

        int exp_sum = n * (n+1)/2;

        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        int miss = exp_sum-sum;
        System.out.println("The Missing Element is : "+miss);








        }
    }

    
    

