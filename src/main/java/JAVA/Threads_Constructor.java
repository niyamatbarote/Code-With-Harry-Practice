
class MyThreadd extends Thread{
    MyThreadd(String name){
        super(name);
    }
    public void run(){
        System.out.println("Running Thread");
    }
}

public class Threads_Constructor {
    
    public static void main(String[] args) {
        MyThreadd mthrd = new MyThreadd("Aman");
        MyThreadd t1 = new MyThreadd("Pran");

        mthrd.start();
        t1.start();
        
        System.out.println("The id of Thread \"mthrd\" is : "+mthrd.getId());
        System.out.println("The name of Thread \"mthrd\" is : "+mthrd.getName());
        System.out.println("The name of Thread \"t1\" is : "+t1.getName());
        System.out.println("The id of Thread \"t1\" is : "+t1.getId());

    }
}
