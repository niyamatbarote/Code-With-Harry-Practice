import java.util.Scanner;

class Employeee{
    int salary ;
    String name;

    public void getSalary(){
        System.out.println("My Salary is :"+ salary);
    }
    public void getName(){
        System.out.println(" My Name is: "+name);
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(int n){
        salary = n;
    }
}


class CellPhone{
    public void dialing(){
        System.out.println("Dialing...");
    }
    public void Ringing(){
        System.out.println("Ringing...");
    }
    public void calling(){
        System.out.println("Calling...");
    }
    
}

class Square{
    float side;
    public void getSide(float n){
        side = n;
    }
    public float getPerimeter(){
        return 4*side;
    }
    public float getArea(){
        return side*side;
    }
}

class Rectangle{
    float height;
    float width;

    public void setDetails(float n,float m){
        height = n;
        width = m;
    }
    public float getPerimeterRec(){
        return (2 * height) + (2* width);
    }
    public float getAreaRec(){
        return height*width;
    }
}

class Circle{
    double radii;
    
    public void getRadii(double n){
        radii = n;
    }
    public double getPerimeterCircle(){
        return 2 * Math.PI * radii;
    }
    public double getAreaCircle(){
        return Math.PI*radii*radii;
    }
}

class TommyVecetti{
    public void Sprint(){
        System.out.println("Player is Sprinting...");
    }
    public void Aim(){
        System.out.println("Player is Aiming....");
    }
    public void Fire(){
        System.out.println("Player is Firing...");
    }
}


public class OopPractice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employeee emp1 = new Employeee();
        Employeee emp2 = new Employeee();

        emp1.name = "Niyamat";
        emp1.salary = 500000;

// Q)Create a Class with Following Properties & Methods = Salary(Property), getSalary(Methdod)
// getName(Mrhohod) , setSalary(), setName().========================= 
        // emp1.getName();
        // emp1.getSalary();
        // emp2.setSalary(300000);
        // emp2.setName("Ajay");
        // emp2.getName();
        // emp2.getSalary();

//Q) Create a Class CellPhone with Methods to Print "Ringing", " Dialing ", etc.
        // CellPhone vivo = new CellPhone();

        // vivo.dialing();
        // vivo.Ringing();
        // vivo.calling();

//Q) Create a class Square with a method to initialize its side calculating perimeter, area , etc
        // Square sq1 = new Square();
        
        // sq1.getSide(5);
        // System.out.println("The Perimeter of Square is : "+sq1.getPerimeter());
        // System.out.println("The Area of Square is : "+sq1.getArea());

//Q) Repeat Above Question Using Class Rectangle ==================================================
        // Rectangle rec = new Rectangle();

        // rec.setDetails(5, 9);
        // System.out.println("Perimeter of the Rectangle is : "+ rec.getPerimeterRec());
        // System.out.println("Area of the Rectangle is : "+ rec.getAreaRec() );

//Q) Repeat Above Question Using Class Circle =============================================
        // Circle cir = new Circle();

        // cir.getRadii(5);
        // System.out.println("Perimeter of Circle is: "+cir.getPerimeterCircle());
        // System.out.println("Area of Circle is : "+cir.getAreaCircle());


//Q) Create a Class TommyVecetti for ROckstar Games and Capable of
//  Hitting(Print Hitting), Running , Firing, etc.
        TommyVecetti Rockstar = new TommyVecetti();

        Rockstar.Sprint();
        Rockstar.Aim();
        Rockstar.Fire();



    }
}
