
class Base1 {
    // Constructor
    public Base1() {
        System.out.println("This is Base 1 Constructor");
    }

    public Base1(int x) {
        System.out.println("Im an Overloaded Constructor of Base with value of X as: " + x);
    }
}

class Dervied1 extends Base1 {
    // Constructor
    Dervied1() {
        System.out.println("Im Constructor of Derived Class");
    }

    public Dervied1(int x, int y) {
        // Super Key ============
        super(x);
        System.out.println("Im an Overloaded Constructor of Derived with value of y as: " + y);
    }
}

class GrandChild extends Dervied1 {
    GrandChild() {
        System.out.println("Im a Constructor of Grand Child Class");
    }

    public GrandChild(int x, int y, int z) {
        // Super Key ============
        super(x, y);
        System.out.println("Im an Overloaded Constructor of GrandChild with value of z as: " + z);
    }
}

// class Animal {
// // Constructor
// Animal() {
// System.out.println("Im Animal");
// }
// }

// class Dogesh extends Animal {
// // Constructor
// Dogesh() {
// System.out.println("Im Dog");
// }
// }

public class InheritanceWconstructor {

    public static void main(String[] args) {
        // Base1 bass = new Base1();
        // Dervied1 derv = new Dervied1();
        GrandChild gc = new GrandChild(4, 5,6);

        // Q) Create a Class Animal And Derive A Class Dog From It
        // NOTE :- The Constructor of The Base Class Will Be Executed FIrst & THen The
        // Constructor of The Derived Class Will Be Executed

        /*
         * Constructor 1 -- Parent |
         * Constructor 2 -- Child | Sequence of The Execution of Constructors
         * Constructor 3 -- Grand Child \|/
         * 
         */

        // Dogesh dog = new Dogesh();

        // =================================================================================================================================

        // bass.printMe();
        // derv.printMe();
        // derv.printMeY();
        // derv.setX(69);
        // System.out.println(derv.getX());
    }
}
