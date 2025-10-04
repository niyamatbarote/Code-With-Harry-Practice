
class Thread1 extends Thread{
    public void run(){
        int i = 0;
        while (i<10) {
            System.out.println("Im Cooking");
            System.out.println("Im Sad");    
            i++;   
        }
    }
}

class Thread2 extends Thread{
    public void run(){
    int i= 0;
    while(i<10){
        System.out.println("Im Chatting");
        System.out.println("Im Happy ");
        i++;
    }
    }
}
public class Threads1 {
    
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        th1.start();
        th2.start();

    }
}
