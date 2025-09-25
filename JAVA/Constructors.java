class Mystudent12 {

    private String name;
    private int age;

    // public void setName(String str) { // Not Necessary --> (OPTIONAL)
    // name = str;
    // }

    // public void setAge(int i) {
    // age = i;
    // }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Default Constructor
    public Mystudent12() {
        name = "Akbar";
        age = 18;
    }

    // Parameterized Constructors
    public Mystudent12(String str, int z) {
        name = str;
        age = z;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Mystudent12 s1 = new Mystudent12();
        Mystudent12 s2 = new Mystudent12("Niyamat", 20);
        Mystudent12 s3 = new Mystudent12();

        // s1.age = 29;
        // s1.name = "Abhi";

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s3.getName());
        System.out.println(s3.getAge());
    }
}
