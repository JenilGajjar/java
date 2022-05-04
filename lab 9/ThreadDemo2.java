// Write a program to create two threads, one thread will print odd numbers and second 
// thread will print even numbers between 1 to 20 numbers.

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

/**
 * ThreadDemo2
 */
public class ThreadDemo2 {

    public static void main(String[] args) throws Exception {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread1.join();
        thread2.start();

    }
}