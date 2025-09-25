public class MethodOverloading {

// Method Overloading == Many Methods But Different Parameters ==

    static void prompt(){
        System.out.println("Hello Bhai Kya Haal Chaal");
    }

    static void prompt(int x){                                  // Here, (int x) is the PARAMETER ==
        System.out.println("Hello Bhai "+x+" Kya Haal Chaal");
    }

    static void prompt(int x, int y){                           
        System.out.println("Hello Bhai "+x+" Kya Haal Chaal");
        System.out.println("Hello Bhai "+y+" Kya Haal Chaal");
    }



    // static void tellJoke(){
    //     System.out.println("DO you know, ok");          // void doesnt need the return value ==
    // }

    // static void change1(int a){
    //     a=69;
    // }

    // static void change2(int [] arr){
    //     arr[0]=69;
    // }

    public static void main(String[] args) {                // Main Method Starts Here ==
        // tellJoke();

    // CASE 1 :- Integer Value Doesnt Change When it Goes int the mehod
    // BUT The "COPY" of that INTEGER is Sent in The MEthod
    // Hence there is no Change in The INTEGER Values ====

        // int num = 96;
        // change1(num);
        // System.out.println(num);

    // CASE 2:- Array Name is The Reference of THe Place / Location of the Elements in the array
    // Hence The Element of the Array is "CHANGED" When It Goes in the METHOD ======

        // int [] marks = {1,2,3,4,5};
        // change2(marks);
        // System.out.println(marks[0]);



// METHOD OVERLOADING ============================================================  


        int a = 100;
        int b = 200;
        prompt();
        prompt(a);
        prompt(a,b);




    }
    
}
