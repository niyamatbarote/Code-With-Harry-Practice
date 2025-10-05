
class Hellw extends Thread{

    public void run(){

        int i=0;
        while (i<10) {
            
        System.out.println("Thank YOuu..XYZ!!");
            i++;
        }
    }

}

class Hellw1 extends Thread{
    public void run(){
        int i = 0;
        while (i<10) {
            System.out.println("Thank You 123..!!");
            i++;
        }
    }
}

public class Threads_Methods {
    public static void main(String[] args) {
        Hellw h1= new Hellw();
        Hellw1 h2 = new Hellw1();

        h1.start();

        try {
            h1.join();  // THIS METHOD WILL HELP TO CONTINUE PRINTING "h1" TILL ITS COMPLETION
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        h2.start();
    }
}
