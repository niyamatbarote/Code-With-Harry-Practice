public class OopsLearn {
    public static void main(String[] args) {

        Student s1 = new Student("Ram", 23);
        System.out.println(s1.age);
        System.out.println(s1.name);

        Student s2 = new Student(s1);
        System.out.println(s2.name);        
    }
}        
        class Student{
            String name;
            int age;
        

        // Default Constructor
        Student(Student s){
            this.name = s.name;
            this.age =s.age;
        }

        // Parameterized Constructor
        Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        Student(String name){
            this.name=name;
        }
    }


