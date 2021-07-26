package exceptionhandling;

public class ExceptionExample1 {
    /**
     * This example is Exception handling of Default throw, our catch type
     * @param args;
     */
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (ArithmeticException exception) {
            // When we don't know the exact exception type that time we can use Exception class only it will detect
            // automatically the type of exception.
            System.out.println("Infinity");
            System.out.println(exception.getMessage());
            // getMessage function is used to get predefined message of exception
        } finally {
            System.out.println("Under the finally block code will definitely execute even if try block is not working");
        }
        System.out.println("After the handling Exception");

    }
}
