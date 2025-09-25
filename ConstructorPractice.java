class Cylinders {
    private double radius;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getAreass() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public Cylinders(int a, int b) {
        radius = a;
        height = b;
    }
}

public class ConstructorPractice {

    public static void main(String[] args) {
        Cylinders c1 = new Cylinders(5, 20);
        Cylinders c2 = new Cylinders(4, 9);

        // Q) Create a class Cylinder & use Getters & Setters to set its Radius and
        // Height

        // c1.setHeight(20);
        // c1.setRadius(5);
        // System.out.println(c1.getHeight());
        // System.out.println(c1.getRadius());
        // System.out.println(c1.getAreass());
        // System.out.println(c1.getVolume());

        // Q) Do the Above Steps Using the Constructors =====
        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
        System.out.println(c1.getAreass());
        System.out.println(c1.getVolume());
        System.out.println(c2.getRadius());
        System.out.println(c2.getHeight());
        System.out.println(c2.getAreass());
        System.out.println(c2.getVolume());
    }
}
