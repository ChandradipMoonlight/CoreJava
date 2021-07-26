package oppsfeatures;

/**
 * this is example of compile time polymorphism it is achieved by using method overloading.
 */
class MultiplyNum {
    static int multiply(int a, int b) {
        return a*b;
    }
    static double multiply(double a, double b) {
        return a*b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        // static method is called in different class by using only the class name in which the
        // method is present not by creating object of that class.
        System.out.println(MultiplyNum.multiply(5,25));
        System.out.println(MultiplyNum.multiply(2.5, 3.0));
    }
}
