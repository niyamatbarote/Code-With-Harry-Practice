
class Employee{                                  // Class Createed
        int id;                                  // Attributes
        String name;                             // Attributes
        public void getDetails(){
            System.out.print("My id is : "+ id);
            System.out.println(" & My name is : "+ name);
        }
    }

public class ClassObject {

    public static void main(String[] args) {
        System.out.println("This is OUr Custom Class");
        Employee Emp1 = new Employee();         // Instantiating of new Employee Object
        Employee Emp2 = new Employee();         // Instantiating of new Employee Object

        // Setting Properties ===============
        Emp1.id = 101;
        Emp1.name = "Niyamat";
        Emp2.id = 102;
        Emp2.name = "Ajay";

        // System.out.println(Emp1.id);                         // No need of this Bcoz of getDetails Method/Function
        // System.out.println(Emp2.id+"\n"+Emp2.name);

        Emp1.getDetails();
        Emp2.getDetails();
    }
}
