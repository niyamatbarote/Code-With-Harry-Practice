class Base {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe() {
        System.out.println("Hello Olivia im in Base class");
    }
}

class Dervied extends Base {
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void printMeY() {
        System.out.println("Hello Im in Derived Class");
    }

}

public class Inheritance {

    public static void main(String[] args) {
        Base bass = new Base();
        Dervied derv = new Dervied();
        bass.printMe();
        derv.printMe();
        derv.printMeY();
        derv.setX(69);
        System.out.println(derv.getX());
    }
}
