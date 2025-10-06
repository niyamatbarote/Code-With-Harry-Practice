
class Gm extends Thread{
    public void run(){

// SOLUTION 2 =================================================================== 

        // try {
        //     Thread.sleep(200);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }

// ==============================================================================

        int i =0;
        while (i<50) {
        System.out.println("Good Morning ");
        i++;



        }
    }
}
class Wc extends Thread{
    public void run(){
        int i = 0;
        while (i<50) {
        System.out.println("Welcome ");
        i++;      
        }
    }
}

public class Threads_Practice {
    public static void main(String[] args) {

// Object Declaration
        Gm gm1 = new Gm();
        Gm gm2 = new Gm();
        Gm gm3 = new Gm();
        Wc wc1 = new Wc();
        Wc wc2 = new Wc();
        Wc wc3 = new Wc();

// Q1) Write a program to print "Good Morning" & "Welcome" continuously.

        // gm.start();
        // wc.start();

// Q2) Add a step method in Welcome Thread of Question 1 to delay its execution for 200ms

// Q3) Demonstrate getPririty & setPriority methods in java Threads

//         gm2.setPriority(10);
//         wc2.setPriority(1);
//         wc1.setPriority(5);

// Also setting Priority
//         gm3.setPriority(Thread.MAX_PRIORITY);

        // gm1.start();
        // gm2.start();
        // gm3.start();
        // wc1.start();
//         wc2.start();
//         wc3.start();
//         System.out.println(wc1.getPriority());

// Q4) How do you get the state of a given thread in java

        gm1.start();
        gm2.start();
        wc1.start();
        System.out.println(gm1.getState());
        System.out.println(gm3.getState());

// Q5) How do you get reference to the current thread in Java

        System.out.println(Thread.currentThread().getState());

    }
}
