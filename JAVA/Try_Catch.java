
public class Try_Catch {
    public static void main(String[] args) {
        
        int a= 1000;
        int b= 0;
        // int div = a/b; // Error--> Exception will be thrown and Code Will Stop Here & Not Execute Next Code
        try{
            int div = a/b;
            System.out.println(div);
        }catch(Exception e){
            System.out.println("Exception Occured in Code, Reason: ");
            System.out.println(e);
        }


    }
}
