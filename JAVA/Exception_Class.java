import java.util.Scanner;

class MyExceptionss extends Exception{

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ "Im toString";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage()+"Im getMessage";
    }

}

public class Exception_Class {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Greater Than 5");
        int a=sc.nextInt();
        if(a<9){
        try {
            throw new MyExceptionss();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());       //  o/p--> to string
            System.out.println(e.getMessage());     // 
            System.out.println(e);                  //  o/p--> to string 
        }
        }
    }
}
