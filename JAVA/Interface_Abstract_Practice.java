

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

// ==================================================================================================

interface Timeline{
    public void SaveTime();
    public void Timestamp();
}

interface Record{
    public void RecordVoice();
    public void VoiceTimestamp();
}

abstract class Telephone{
    abstract public void Ring();
    abstract public void Answer();
    abstract public void Decline();
}

class SmartTelephone extends Telephone implements Timeline,Record{

    public void Ring(){
        System.out.println("Ringing...");
    }
    public void Answer(){
        System.out.println("Answering The Call ...");
    }
    public void Decline(){
        System.out.println("Declining the Call...");
    }
    //Methods of Timeline
    public void SaveTime(){
        System.out.println("Saving Timeline");
    }
    public void Timestamp(){
        System.out.println("Saveing TimeStamp");
    }
    // Methods of Record
    public void RecordVoice(){
        System.out.println("Recording Voice");
    }
    public void VoiceTimestamp(){
        System.out.println("Saving Voice TimeStamp");
    }
}



public class Interface_Abstract_Practice {
    public static void main(String[] args) {

        // Q) Create an Abstract Class Pen With Methds Write() and Refill() as Abstract
        // Methods

        // SmartPen sp = new SmartPen();
        // sp.Write();
        // sp.Refill();

    // Q) Use the pen Class to Create a Concrete Class "SmartPen" With Additional Method "ChangeNib()"

        // sp.ChangeNib();

    // Q) Create a Class Monkey With jump() & Bite() Methods. Create a Class Human Which Inherits This Monkey Class
    //  & implements BasicAnimal interface with Eat() & sleep() Method

        // Human hm = new Human();
        // hm.Bite();
        // hm.Eat();
        // hm.Sleep();
        // hm.jump();
        // Monkey mk = new Human();
        // mk.Bite();
        // mk.Sleep();  --> Throws Error


// Q) Create a Class "Telephone" with Ring(),Answer() & Disconnect() Methods as Abstract MEthods .
// Create another class SmartTelephone & Demonstrate Polymorphism.

        SmartTelephone stp = new SmartTelephone();
        stp.Ring();
        Record rd = new SmartTelephone();
        Timeline tml = new SmartTelephone();

        rd.RecordVoice();
        rd.VoiceTimestamp();
        // rd.TimeStamp();   --> Throws Error Bcoz "Not int the Method of (Record)"
        // rd.SaveTime();    --> Throws Error Bcoz "Not int the Method of (Record)"
        tml.Timestamp();
        tml.SaveTime();
        // tml.RecordVoice();      --> Throws Error Bcoz "Not int the Method of (Record)"
        // tml.VoiceTimestamp();   --> Throws Error Bcoz "Not int the Method of (Record)"





    }
}
