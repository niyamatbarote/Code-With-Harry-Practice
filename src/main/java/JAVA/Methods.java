public class Methods {

    static int logic(int x, int y) {            // METHOD // Because of "static int" We Need a "RETURN" Type
        int z;
        if (x>y) {
            z= x+y;   
        }
        else{
            z= (x+y)*5;
             
        }
        return z;
    }

    public static void main(String[] args) {

        int a=2;
        int b=3;
        int c;
        c= logic(a,b);
        System.out.println(c);
        int i=3;
        int j=2;
        int k;
        k= logic (i,j);
        System.out.println(k);
        
    }
}
