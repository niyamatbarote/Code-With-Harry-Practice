

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
// ===================================================================================================

interface BasicAnimal{
    void Eat();
    void Sleep();
}

class Monkey {
    public void jump(){
        System.out.println("Im Jumping");
    }
    public void Bite(){
        System.out.println("Im Biting");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void Eat(){
        System.out.println("Eating...");
    }
    public void Sleep(){
        System.out.println("Sleeping...");
    }

}
public class Interface_Abstract_Practice {
    public static void main(String[] args) {

        // Create an Abstract Class Pen With Methds Write() and Refill() as Abstract
        // Methods

        // SmartPen sp = new SmartPen();
        // sp.Write();
        // sp.Refill();

    // Use the pen Class to Create a Concrete Class "SmartPen" With Additional Method "ChangeNib()"

        // sp.ChangeNib();

    // Create a Class Monkey With jump() & Bite() Methods. Create a Class Human Which Inherits This Monkey Class
    //  & implements BasicAnimal interface with Eat() & sleep() Method

        // Human hm = new Human();
        // hm.Bite();
        // hm.Eat();
        // hm.Sleep();
        // hm.jump();
        // Monkey mk = new Human();
        // mk.Bite();
        // mk.Sleep();  --> Throws Error


// 
    }
}
