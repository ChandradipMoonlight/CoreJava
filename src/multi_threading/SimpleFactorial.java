package multi_threading;
/**
 * This is example of finding factorial of numbers without creating threads.
 *
 */

import java.math.BigInteger;

public class SimpleFactorial {
    public static void main(String[] args) {
        long  startTime = System.currentTimeMillis();
        int[] arr = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 10000}; // 11.45 sec
        for (int j : arr) {
            System.out.println(j + "! = " + calculateFactorial(j));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken = " + (endTime-startTime)/1000.0 + " seconds");
     }

    /**
     * this function is calculating the factorial of number.
     * BigInteger is taken because numbers are very large.
     * @param num;
     * @return BigInteger;
     */
    private static BigInteger calculateFactorial(int num) {
        BigInteger bigInteger = BigInteger.valueOf(1); // it means bigInteger = 1;
        for (int i =2; i<=num; i++) {
            bigInteger=bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}
