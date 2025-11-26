// Finally Block is used to Print the "Code Even if There are Any Exceptions" in Above the code
// Even If the code build fails The FINALLY BLOCK Will be executed

package JAVA;

public class FinallyBlock {

    public static int finallly() {
        try {
            int a = 9;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("im imp");
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(finallly());

        // Here Without the Finally Block The Message will be Printed
        // try{
        // int a = 9;
        // int b = 0;
        // int c = a/b;
        // System.out.println(a/b);
        // }catch (Exception e) {
        // System.out.println(e);
        // }
        // finally{
        // System.out.println("This is Important Message");
        // }

        // here the ultimate finally keyword/block
        int a = 9;
        int b = 0;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }

            finally {
                System.out.println("im imp");
            }
            b--;
        }

        // We can also use FINALLY keyword with TRY Block
        try {
            int c = 9;
            int v = 0;
            System.out.println(c / v);
        } finally {
            System.out.println("thisistheend");
        }
    }
}
