class Parentt12 {
    public void Method1() { // Same Method
        System.out.println("Im Method 1 of Class Parent");
    }
}

class Childd12 extends Parentt12 {
    // Method Overriding
    @Override
    public void Method1() {
        System.out.println("Im Method 1 of Class Childd");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Childd12 cd = new Childd12();
        Parentt12 pttt = new Parentt12();

        // Calling Method
        cd.Method1();
        pttt.Method1();
    }
}
