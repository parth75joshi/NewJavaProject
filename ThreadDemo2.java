class RunnableClass implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<4;i++)       
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);  
    }
    
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println("Main Thread!");

        Thread thread = new Thread(new RunnableClass());
        thread.start();
    }
}
