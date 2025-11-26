
// Create 3 Classes Calclulator , ScCalculator, HybridCalculator & Group them into a Package

package calc.calc1.calc2.calc3;

class Calclulator{
    public void calclulate(int a, int b){
        System.out.println("Addition : "+ a+b);
    }
}
class ScCalculator{
    public void calclulate(int a, int b,int c){
        System.out.println("Addition: "+ a+b+c);
    }
}

class HybCalulator{
    public void hybCalculate(int a , int b){
        System.out.println("Multiplication: "+ a*b);
    }
}

public class Package_Practice {
    public static void main(String[] args) {
        Calclulator simpcal = new Calclulator();
        ScCalculator sccal = new ScCalculator();
        HybCalulator hybcal = new HybCalulator();

        simpcal.calclulate(4,6);

  }
}
