// Formula :- (0°C × 9/5) + 32 = 32°F

public class RecursionTempCoversn {

    static void Temp(int n){
        float f = (n*9/5.0f)+32;
        System.out.println(f);
    }
    
    public static void main(String[] args) {
        Temp(100);
    }
}
