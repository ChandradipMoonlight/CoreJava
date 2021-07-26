package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingEx2 {
    // This is example of Our throw, Our catch
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        System.out.print("Enter the Amount to withdraw : ");
        int withdraw = sc.nextInt();
        try
        {
            if (balance<withdraw) {
                throw new ArithmeticException("Insufficient Balance");
            } else {
                balance = balance - withdraw;
                System.out.println("Transaction is successful.");
                System.out.println("Available balance is = "+balance + " Rs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues ....");
    }
}
