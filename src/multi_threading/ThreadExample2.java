package multi_threading;

/**
 * This is example to create Thread in Java by extending the Thread class.
 * objectives to create threading.
 * 1. Create thread.
 * 2. attache code to the thread.
 * 3. execute the thread.
 */

class X extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<11; i++) {
            System.out.println("Thread X" + i);
        }
    }
}

class Y extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<11; i++) {
            System.out.println("Thread Y" + i);
        }
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        X obj1 = new X();
        Y obj2 = new Y();
        obj1.start();
        obj2.start();
    }
}
