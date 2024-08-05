# Threads in Java

This project demonstrates various approaches to implementing multithreading in Java. It includes examples of using the `Thread` class, `Runnable` interface, anonymous inner classes, and lambda expressions to create and manage threads. Additionally, it illustrates thread synchronization and the use of the `join()` method to ensure proper thread completion.

## Table of Contents
- [ImplementedThread](#implementedthread)
- [InnerRunnable](#innerrunnable)
- [ImplementedRunnable](#implementedrunnable)
- [LambdaThread](#lambdathread)
- [LambdaRunnable](#lambdarunnable)
- [Thread Synchronization](#thread-synchronization)
- [Join Method](#join-method)
- [Final Output](#final-output)

## ImplementedThread

The `ImplementedThread` class extends the `Thread` class and overrides the `run()` method to define the thread's task. The `run()` method includes synchronized blocks to ensure thread safety, making sure that only one thread can execute the critical section at a time.

Example:
```java
Thread implementedThread = new ImplementedThread();
implementedThread.start();
```

## InnerRunnable

An anonymous inner class implementing the `Runnable` interface is used to create a thread. This approach allows for defining the thread's task directly within the `run()` method of the anonymous class.

Example:
```java
Thread innerRunnableThread = new Thread(new Runnable() {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("InnerRunnable Thread: Running...");
            // Additional code
        }
    }
});
innerRunnableThread.start();
```

## ImplementedRunnable

The `ImplementedRunnable` class implements the `Runnable` interface, providing an alternative to extending the `Thread` class. This class defines the `run()` method, which is passed to a `Thread` object and executed when the thread is started.

Example:
```java
Thread implementedRunnableThread = new Thread(new ImplementedRunnable());
implementedRunnableThread.start();
```

## LambdaThread

This example demonstrates creating a thread using a lambda expression. The lambda syntax is a concise way to define the `run()` method of the thread without creating a separate class.

Example:
```java
Thread lambdaThread = new Thread(() -> {
    synchronized (Threads.class) {
        System.out.println("LambdaThread: Running...");
        // Additional code
    }
});
lambdaThread.start();
```

## LambdaRunnable

Similar to `LambdaThread`, this example explicitly implements the `Runnable` interface using a lambda expression. The `run()` method is defined within the lambda, which is then passed to a `Thread` object.

Example:
```java
Runnable lambdaRunnable = () -> {
    synchronized (Threads.class) {
        System.out.println("LambdaRunnable: Running...");
        // Additional code
    }
};
Thread lambdaRunnableThread = new Thread(lambdaRunnable);
lambdaRunnableThread.start();
```

## Thread Synchronization

In all the examples, thread synchronization is demonstrated using the `synchronized` keyword. Synchronization ensures that only one thread can execute the synchronized block at a time, preventing race conditions.

## Join Method

The `join()` method is used to ensure that the main thread waits for all other threads to finish their execution before it continues. This is particularly useful when you want to ensure that all threads have completed their tasks before proceeding with the next part of the program.

Example:
```java
implementedThread.join();
innerRunnableThread.join();
implementedRunnableThread.join();
lambdaThread.join();
lambdaRunnableThread.join();
```

## Final Output

After all threads have completed their execution, a final message is printed to indicate that all threads have finished.

Example Output:
```
ImplementedThread: Running...
InnerRunnable Thread: Running...
...
All threads have finished.
```