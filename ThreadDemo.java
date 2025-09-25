class MyThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " - Cointer: " + i);
        }     

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            System.out.println("Thread Interrupted!");        
        }
    }
    
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();

        thread2.start();
    }
}
