interface ParentInterface{
    void Meth1();
    void Meth2();
}
// Here, Meth1, Meth2 is Inherited in This ChildInterface
interface ChildInterface extends ParentInterface{
    void Meth3();
    void Meth4();
}
class BolBhai implements ChildInterface{

// We Must Use Meth1,2,3,4 is this BolBhai Class
    public void Meth1(){
        System.out.println("This is Method 1");
    }
    public void Meth2(){
        System.out.println("This is Method 2");
    }
    public void Meth3(){
        System.out.println("This is Method 3");
    }
    public void Meth4(){
        System.out.println("This is Method 4");
    }    
}

public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
        BolBhai bb = new BolBhai();

        bb.Meth1();
        bb.Meth2();
        bb.Meth3();
        bb.Meth4();
    }
}
