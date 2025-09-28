
interface Camera {
    void takeSnap();

    void recordVideos();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4kVid() {
        greet();// Greet can be run through default method(?)...
        System.out.println("Recording in 4k...");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectNetworks(String network);
}

class Cellphone {
    void Cellphone() {
        System.out.println("Im a Cellphone");
    }

    public void CallNum(int phoneNumber) {
        System.out.println("Calling... " + phoneNumber);
    }

    public void PickCall(int phoneNumber) {
        System.out.println("Answering..." + phoneNumber);
    }
}

class Smartphone1 extends Cellphone implements Wifi, Camera {

    // #========= Even if not in main classs. interfernce class and greet is
    // implemented =====#
    // public void record4kVid(){       // This will override the method
    // System.out.println("Record in 4k");
    // }
    public void takeSnap() {
        System.out.println("Take a Picture");
    }

    public void recordVideos() {
        System.out.println("Record the Video");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of Elements in an Array : ");
        String[] networksList = { "Aman", "Chaman", "Ki Dil", "Khushi" };
        return networksList;
    }

    public void connectNetworks(String networks) {
        System.out.println("Connected to Networks");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();
        Smartphone1 sp = new Smartphone1();

        // sp.recordVideos();
        String[] ar = sp.getNetworks();
        for (String elements : ar) {
            System.out.println(elements);
        }
        // sp.greet(); --> Throws error!
        sp.record4kVid();

    }
}
