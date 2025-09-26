class Parentt {
    public void Method1() {         // Same Method
        System.out.println("Im Method 1 of Class Parent");
    }
}

class Childd extends Parentt {
    // Method Overriding
    @Override
    public void Method1() {
        System.out.println("Im Method 1 of Class Childd");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Childd cd = new Childd();

        // Calling Method
        cd.Method1();
    }
}
