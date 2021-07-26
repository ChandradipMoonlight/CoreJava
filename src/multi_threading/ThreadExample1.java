package multi_threading;

/**
 * this is example of multithreading by using Runnable Interface.
 * objectives of this example is:-
 * 1. create thread
 * 2. Attach code to the thread
 * 3. Execute the thread
 */
class A implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<11; i++) {
            System.out.println("Thread A" + i);
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Thread B" + i);
        }
    }
}
    public class ThreadExample1 {
        public static void main(String[] args) {
            /*
             Attaching the code to the thread by creating object of thread class
             and passing the object of the class in which run method implementation is given
             new A(); and new B();
            */
            Thread obj1 = new Thread(new A());
            Thread obj2 = new Thread(new B());
            /*
              execution of the threading by calling the start method by using object of thread class
             */
            obj1.start();
            obj2.start();
        }
    }
