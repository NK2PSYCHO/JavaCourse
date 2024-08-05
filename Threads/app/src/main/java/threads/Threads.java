package threads;

public class Threads {
    public static void main(String[] args) {
        // 1. ImplementedThread
        // Creating an instance of a custom thread class that extends the Thread class.
        // This thread starts its execution by calling the start() method, which
        // internally
        // calls the run() method of the ImplementedThread class.
        Thread implementedThread = new ImplementedThread();
        implementedThread.start();

        // 2. InnerRunnable
        // Creating an instance of an anonymous inner class implementing Runnable.
        // The Runnable interface's run() method is defined within the anonymous class.
        // This is then passed to the Thread constructor, and the thread starts
        // executing.
        Thread innerRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Synchronizing the block to ensure only one thread can execute this part at a
                // time.
                synchronized (this) {
                    System.out.println("InnerRunnable Thread: Running...");
                    try {
                        System.out.println("InnerRunnable Thread: Sleeping...");
                        // Making the thread sleep for 1 second.
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // Handling the scenario where the thread is interrupted during sleep.
                        System.out.println("InnerRunnable Thread: Interrupted!");
                    }
                    // Indicating that the thread has finished its execution.
                    System.out.println("InnerRunnable Thread: Finished!");
                }
            }
        });
        innerRunnableThread.start();

        // 3. ImplementedRunnable
        // Creating an instance of a thread by passing a class that implements Runnable.
        // The run() method in ImplementedRunnable will be executed when the thread
        // starts.
        Thread implementedRunnableThread = new Thread(new ImplementedRunnable());
        implementedRunnableThread.start();

        // 4. LambdaThread
        // Creating a thread using a lambda expression. The lambda represents the run()
        // method.
        // The lambda syntax is a concise way to create a thread without defining a
        // separate class.
        Thread lambdaThread = new Thread(() -> {
            // Synchronizing on the Threads class object to ensure thread safety.
            synchronized (Threads.class) {
                System.out.println("LambdaThread: Running...");
                try {
                    System.out.println("LambdaThread: Sleeping...");
                    // The thread sleeps for 1 second.
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handling interruption during sleep.
                    System.out.println("LambdaThread: Interrupted!");
                }
                // Printing a message when the thread finishes its task.
                System.out.println("LambdaThread: Finished!");
            }
        });
        lambdaThread.start();

        // 5. LambdaRunnable (explicitly implementing Runnable)
        // Creating a Runnable instance using a lambda expression.
        // The lambda expression implements the run() method of the Runnable interface.
        // Inside the run() method, a synchronized block is used to ensure thread
        // safety.
        // The Thread constructor is then used to create a thread with this Runnable
        // instance.
        // The start() method is called on the Thread object to begin execution.
        // The thread prints messages indicating it is running, sleeps for 1 second,
        // and then prints a message indicating it has finished.
        Runnable lambdaRunnable = () -> {
            synchronized (Threads.class) {
                System.out.println("LambdaRunnable: Running...");
                try {
                    System.out.println("LambdaRunnable: Sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("LambdaRunnable: Interrupted!");
                }
                System.out.println("LambdaRunnable: Finished!");
            }
        };
        Thread lambdaRunnableThread = new Thread(lambdaRunnable);
        lambdaRunnableThread.start();

        // Demonstrate join() method
        try {
            // The join() method ensures that the main thread waits for the other threads to
            // finish.
            // This ensures that "All threads have finished." is only printed after all
            // threads complete.
            implementedThread.join();
            innerRunnableThread.join();
            implementedRunnableThread.join();
            lambdaThread.join();
            lambdaRunnableThread.join();
        } catch (InterruptedException e) {
            // Handling the case where the main thread is interrupted while waiting.
            System.out.println("Main thread interrupted.");
        }

        // Final message indicating that all threads have completed their execution.
        System.out.println("All threads have finished.");
    }
}

// 1. ImplementedThread class
// This class extends Thread and overrides the run() method to define the
// thread's task.
class ImplementedThread extends Thread {
    @Override
    public void run() {
        // Synchronizing on the current thread instance to ensure thread safety.
        synchronized (this) {
            System.out.println("ImplementedThread: Running...");
            try {
                System.out.println("ImplementedThread: Sleeping...");
                // Putting the thread to sleep for 1 second.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handling interruption during sleep.
                System.out.println("ImplementedThread: Interrupted!");
            }
            // Indicating the thread has finished its task.
            System.out.println("ImplementedThread: Finished!");
        }
    }
}

// 2. ImplementedRunnable class
// This class implements the Runnable interface and provides the run() method.
class ImplementedRunnable implements Runnable {
    @Override
    public void run() {
        // Synchronizing on the current Runnable instance to ensure only one thread can
        // execute it at a time.
        synchronized (this) {
            System.out.println("ImplementedRunnable: Running...");
            try {
                System.out.println("ImplementedRunnable: Sleeping...");
                // The thread sleeps for 1 second.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handling interruption during sleep.
                System.out.println("ImplementedRunnable: Interrupted!");
            }
            // Indicating that the thread has finished its task.
            System.out.println("ImplementedRunnable: Finished!");
        }
    }
}