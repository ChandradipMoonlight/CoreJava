package exceptionhandling;

import java.io.IOException;

public class CompileTypeExceptionHandling {
    public static void main(String[] args) {
        // Use of "throws" keyword to handle exception.
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Exception message = " + e.getMessage());
        }
        System.out.println("After Exception");
    }
}
