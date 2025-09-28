// Note:- Objects of the interfaces Cannot be Created 
// Note:- References of the interfaces Can be Created 
// Note:- Using Multiple Interfaces We can Crate a Single Class but 
// Using Multiple Abstract class we cannot create Single Class 

// Note :- Abstract MEthod donot Specify ====

interface Bicycle {
    // Integer "a" is Final And Cannot Be Reassigned again
    int a = 20; 

    void applyBrakes(int Decrement);

    void speedUp(int Increment);
}

interface CycleHorn {
    void BlowHorn();
}

class MyCycle implements Bicycle, CycleHorn {
    int Speed;

    MyCycle() {
        System.out.println("Cycle Strated");
        Speed = 30;
        System.out.println("Current Speed is : " + Speed);
    }

    public void applyBrakes(int Decrement) {
        System.out.println("Speed Decremented By : " + Decrement);
        Speed = Speed - Decrement;
        System.out.println("Current Speed is : " + Speed);
    }

    public void speedUp(int Increment) {
        System.out.println("Speed is Incremented By : " + Increment);
        Speed = Speed + Increment;
        System.out.println("Current Speed is : " + Speed);
    }

    public void BlowHorn() {
        System.out.println("Horn is Blowned");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        MyCycle mc = new MyCycle();

        mc.applyBrakes(5);
        mc.speedUp(10);
        mc.BlowHorn();

    }
}
