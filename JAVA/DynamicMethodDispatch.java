class Phone{
    public void Time(){
        System.out.println("I will Show You Time");
    }
    public void on(){
        System.out.println("Phone is Turning On");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("I can play Music");
    }
    @Override
    public void on(){
        System.out.println("SmartPhone is Turning On");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // SmartPhone smphone = new SmartPhone(); // Allowed
        // Phone phone = new Phone();  // Allowed
        // SmartPhone obj1 = new Phone();  // Not Allowed

        Phone obj = new SmartPhone(); // Allowed

        // Calling Objects=========
        obj.on();       // Allowed But Note..........
        obj.Time();         // Allowed
        // obj.music();    // Not Allowed 
    }
}
