public class Employee {
    // Protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();

        // ❌ This line would give an error:
        // emp.age = 35.5; // Uncommenting this will show: incompatible types

        // ✅ Corrected using casting:
        emp.age = (int) 35.5; // Will store 35, decimal part is truncated

        System.out.println("Successfully started");
    }
}
