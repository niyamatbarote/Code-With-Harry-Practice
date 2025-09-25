public class InheritanceHierarchical {

    public static void main(String[] args) {
        
        child1.mind();
        child2.mind();

    }
}

class Parent{
   static  void mind(){                                     // No Need to Call By Creating an Object Using "STATIC"
        System.out.println("This is an Intelligent Mind");
    }
}

class child1 extends Parent{

}

class child2 extends Parent{

}
