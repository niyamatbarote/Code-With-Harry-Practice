
class MyThreadRunnabel1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<50) {
        System.out.println("Im Thread 1 not Threat 1");
        i++;
        }
    }
}
class MyThreadRunnabel2 implements Runnable{
    public void run(){
       int i = 0;
        while (i<50) {
        System.out.println("Im Thread 2 not Threat 2");
        i++;
        }
    }
}


public class Threads2 {
    public static void main(String[] args) {
        MyThreadRunnabel1 bullet1 = new MyThreadRunnabel1();
        Thread gun1 = new Thread(bullet1);
        
        MyThreadRunnabel2 bullet2 = new MyThreadRunnabel2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start(); 

      
        
    }
}
