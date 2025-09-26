class Circle11 {
    int radius;

    Circle11() {
        System.out.println("Im Non Parameterized Constructor of Circle ");
    }

    Circle11(int r) {
        this.radius = r;
        System.out.println("Circle Constructor With Parameters");
    }

    public double Area() {
        return Math.PI * this.radius * this.radius;
    }

}

class Cylinder11 extends Circle11 {
    int height;

    public double Height() {
        return Math.PI * this.radius * this.radius * height;
    }

    Cylinder11(int r, int h) {
        super(r);
        this.height = h;
        System.out.println("Cylinder Constructor With Parameters");
    }

}

public class InheritancePractice {

    public static void main(String[] args) {

        // Q) Create a class Circle and use inheritance to create another class cylinder
        // from it
        // Circle11 c1 = new Circle11(5);
        Cylinder11 cyl = new Cylinder11(5, 5);

    }
}
