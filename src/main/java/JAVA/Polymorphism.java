// 
interface cameraa {
    void takeSnap();

    void Record();
}

interface Gps {
    void track();

    void findWay();
}

interface Messanger {
    void ReadMsg();

    void WriteMsg();
}

class Cellphone212 {
    Cellphone212() {
        System.out.println("Im Constructor of CellPhone");
    }

    public void Call() {
        System.out.println("Calling...");
    }

    public void Receive() {
        System.out.println("Receiving Call...");
    }
}

class MyNewSmartPhone extends Cellphone212 implements Messanger, Gps, cameraa {
    MyNewSmartPhone() {
        System.out.println("Im COnstructor of MyNewSmartPHone");
    }

    public void takeSnap() {
        System.out.println("Took a Snap");
    }

    public void Record() {
        System.out.println("Recorded..");
    }

    public void track() {
        System.out.println("Tracking..");
    }

    public void findWay() {
        System.out.println("Finding Optimal way for You ");
    }

    public void ReadMsg() {
        System.out.println("Reading Msg");
    }

    public void WriteMsg() {
        System.out.println("Writing A Message ");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        cameraa cmr = new MyNewSmartPhone();

        cmr.Record();   // --> Only Methods of Camera Will be Used And Functional Here
        cmr.takeSnap();
        // cmr.WriteMsg();  --> Throws Error Bcoz Camera Methods is Used
        // cmr.findWay();   --> Same here
    }
}
