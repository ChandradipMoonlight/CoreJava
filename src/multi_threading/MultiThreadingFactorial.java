package multi_threading;

import java.math.BigInteger;

public class MultiThreadingFactorial {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int[] arr = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 10000}; // 11.45 sec
        MyThread[] th = new MyThread[arr.length]; // array of object reference.
        for (int i = 0; i<arr.length; i++) {
            th[i] = new MyThread(arr[i]);
            th[i].start();
        }
        // wait for all the available thread to end calculation and then we print the value
        for (MyThread myThread : th) {
            myThread.join();
//            for (int i = 0; i<th.length; i++) {
//                th[i].join();

                // join function allow to calculate all numbers factorial and then after calculating the
            // factorial of all numbers it will print
        }
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + "! = " + th[i].result);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken = " + (endTime-startTime)/1000.0 + " sec");
    }
}

class MyThread extends Thread {
    private int num;
    public BigInteger result;
    public MyThread (int num) {
        this.num = num;
        this.result = BigInteger.valueOf(1);
    }

    @Override
    public void run() {
        for (int i =2; i<=this.num; i++) {
            this.result = this.result.multiply(BigInteger.valueOf(i));
        }
    }
}