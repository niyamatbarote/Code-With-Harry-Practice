// Made Class Parent as abstract because There is a Abstract method in this Class
// Note:- If We Make a Abstract Method in any class then this class becomes an Abstract Class

abstract class Parentt {
    Parentt() {
        System.out.println("Im Constructor of Class Parentt");
    }

    // Abstract Method
    abstract public void greet();
}

class Child1 extends Parentt {
    Child1() {
        System.out.println("Im Constructor of Class Chhild");
    }

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class Child3 extends Parentt {
   public void NoGreet(){
    System.out.println("Helllo Bhaiiiii BOl ");
   }
}



public class Abstraction {
    public static void main(String[] args) {
        // Note:- We Cannot Make Object of the abstract classes
        // But we can Create Another Class From That Abstract Class

        // Parentt pt = new Parentt(); // -- Error
        Child1 c1 = new Child1();
        // Child3 c2 = new Child3(); // --Error

        c1.greet();
    }
}
