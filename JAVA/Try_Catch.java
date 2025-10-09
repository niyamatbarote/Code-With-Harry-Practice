
public class Try_Catch {
    public static void main(String[] args) {
        
        int[] arr = new int[3];
        arr[0]=54;
        arr[1]=99;
        arr[2]=8;
        int ind = 5;
        int a= 1000;
        int b= 0;
        // int div = a/b; // Error--> Exception will be thrown and Code Will Stop Here & Not Execute Next Code
        try{
            int div = a/b;                  // Error Cathed Here & No Ahead 
            System.out.println(div);        // Code Executes to This
            System.out.println(arr[ind]);   // This Error Cannot Be Detected
        }catch(Exception e){
            System.out.println("Exception Occured in Code, Reason: ");
            System.out.println(e);
        }


    }
}
