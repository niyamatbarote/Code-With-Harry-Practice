

abstract class Pen {

    abstract public void Write();

    abstract void Refill();
}

class SmartPen extends Pen {
    public void ChangeNib(){
        System.out.println("Changing Nib...");
    }
    public void Write() {
        System.out.println("Writing...");
    }

    public void Refill() {
        System.out.println("Refilling...");
    }
}

public class Interface_Abstract_Practice {
    public static void main(String[] args) {

        // Create an Abstract Class Pen With Methds Write() and Refill() as Abstract
        // Methods
        SmartPen sp = new SmartPen();
        sp.Write();
        sp.Refill();

    // Use the pen Class to Create a Concrete Class "SmartPen" With Additional Method "ChangeNib()"
        sp.ChangeNib();

    // Create a Class Monkey With jump() & Bite() Methods. Create a Class Human Which Inherits This Monkey Class & implements BasicAnimal interface with Eat() & sleep() Method
    
    }
}
