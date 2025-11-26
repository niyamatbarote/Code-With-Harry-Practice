// Polymorphism :-

// 1)Compile Time Polymorphism == it Is Achieved by Method Overloading 
    // IT is decided at compile time
    // Same MEthod Name But Different Parameter List ( Numbers / Types / Orders )
    // Return Type Can be Different But Not enough Alone to Overload
    // 

// 2)Run Time Polymorphism

// Q) Create a method with return type Integer Pass 2 Integer as a Parameter Then return Addition of Both
// create 2nd method with return type integer Pass 3 Integer as a Parameter 
//  cerae 3rd method with return type double pass 2 paramters as a return type double


public class Polymorphism {

    static int Method1(int x, int y){
        int z;
        z=x+y;
        return z;
    }

    static int Method1(int x, int y, int z){
        int sum;
        sum = x+y+z;
        return sum ;
    }

    public static void main(String[] args) {
        

    }
    
}
