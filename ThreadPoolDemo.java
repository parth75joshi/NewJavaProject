import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String name;

    Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + " executed by " + Thread.currentThread().getName());
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // Create a pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks
        for (int i = 1; i <= 50; i++) {
            executor.execute(new Task("Task-" + i));
        }

        // Shutdown pool after tasks are completed
        executor.shutdown();
    }
}
