public class MrthodsPattern {
    
    static void Pattern(int s){
        
        for(int i = 0 ; i<s; i++){
            for (int j = 0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        
        Pattern(11);
    }
}
