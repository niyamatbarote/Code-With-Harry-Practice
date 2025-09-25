public class LogicalOperators {
    
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;
        boolean c= true;

        if(a && b && c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if(a || b || c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("Not(A) is: " + !a);
        System.out.println("Not(B) is: "+ !b);
        System.out.println("Not(C) is: "+ !c);
    }
}
