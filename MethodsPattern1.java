public class MethodsPattern1 {

    static void Pat(int n){

        for (int i=0; i<=n; i++) {
            for (int j = 4; j>i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Pat(4);


    }
}
