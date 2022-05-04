// Write an application that executes two threads. One thread displays "Good
// Morning"
// every 1000 milliseconds & another thread displays "Good Afternoon" every 3000
// milliseconds. Create the threads by implementing the Runnable interface.

class A implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.currentThread().sleep(1000);
                System.out.println("Good Morning");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

class B implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.currentThread().sleep(3000);
                System.out.println("Good Afternoon");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

/**
 * ThreadDemo1
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}