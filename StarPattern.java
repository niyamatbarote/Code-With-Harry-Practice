public class StarPattern {
    public static void main(String[] args) {
        
        /*        To Print:-    *
         *                      * *
         *                      * * *
         *                      * * * *                                                     
         *                      * * * 
         *                      * *
         *                      *
         */                     
//SoLUTION ========================================================

        // for(int i = 0; i<5; i++){
        //     for(int j=0; j<i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 5; i>0; i--) {
        //     for(int j=0; j<i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
// =========================================================================

//  TO PRINT :- 
//                     *
//                   * *       
//                 * * *
//               * * * *

// SOLUTION :- ===============================================

// for(int i=1; i<=4; i++){
//     for (int j=3; j>=i; j--) {
//         System.out.print(" ");
//     }
//     for (int k =1; k<=i; k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// =============================================================

// TO PRINT :-
//             *
//            ** 
//           ***    
//          ****


// SOLUTION :- ==================================================

// for (int i=1; i<=4; i++) {
//     for (int j = 4; j>=i; j--) {
//         System.out.print(" ");
//     }
//     for(int k = 1; k<=i; k++){
//     System.out.print("*");
//         }
//     System.out.println();
// }

// ===============================================================
// TO PRINT :- 
//      ****
//       ***
//        **
//         *

// SOLUTION :- ============================================================== 0*8

// for (int i=1; i<=4; i++) {
    
//     for (int j = 1; j<=i; j++) {
//         System.out.print(" ");
//     }

//     for(int k=4; k>=i ; k--){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// ==============================================================================

// TO PRINT :-
//                   *
//                  **
//                 *** 
//                **** 
//                 *** 
//                  **
//                   *    

// ==============================================================================

for (int i = 1; i<=4; i++) {

    for (int j = 4; j>=i; j--) {
        System.out.print(" ");
    }

    for (int k=1; k<=i; k++) {
        System.out.print("*");
    }
    System.out.println();
}
for(int i =1; i<=3; i++){

    for (int j=0; j<=i; j++) {
        System.out.print(" ");
    }

    for (int k = 3; k>=i; k--) {
        System.out.print("*");
    }
    System.out.println();
}




    }
    
}
