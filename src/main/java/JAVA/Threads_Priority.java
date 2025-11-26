class Hello extends Thread{

    Hello(String name){
        super(name);
    }

    public void run(){
        int i =0;
        while (i<50) {
            System.out.println("Thank you "+ getName());
            i++;
        }
    }
}

public class Threads_Priority {
    
    public static void main(String[] args) {
        Hello h1 = new Hello("Bolo");
        Hello h2 = new Hello("Qwerty Minimum Priority");
        Hello h3 = new Hello("Naman");
        Hello h4 = new Hello("Chaman (Maximun Priority)");
        Hello h5 = new Hello("Kitee");
        Hello h6 = new Hello("polooo Normal Prioruty");

        h2.setPriority(Thread.MIN_PRIORITY);
        h4.setPriority(Thread.MAX_PRIORITY);
        h6.setPriority(Thread.NORM_PRIORITY);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();

    }
}
