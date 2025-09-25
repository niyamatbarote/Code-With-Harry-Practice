
// 1) IT is the property of
// 2)it helps in reusabillity 
// 3)It reduces the Lines of Code

// * Types of Inheritance:-
// 1) Single level Inheritance
// 2) Multi Level Inheritance
// 3) Hierarchical Inheritance
// 4) Hybrid Inheritance

// Note:- Parent class is known as the "Base Class" 
// Child Class is Known As "Derived Class"

// Q) Dog can copy THe Properties of Animal Class
// Parent class (Base class)
public class Inheritance {

    public static void main(String[] args) {
        // Dog d1= new Dog();
        // d1.eats();

        Triangle tr =new Triangle();
        tr.area();
}
}
class Shapes{
    void area(){
        System.out.println("This is THe Area");
    }
}

class Triangle extends Shapes{

}

class equilateralTriangle extends Triangle{


}


// class Animal {
//     void eats(){
//         System.out.println("Animal Eats");
//     }
// }

// class Dog extends Animal {
 
// }


