package functionIntro;

import java.util.Scanner;

public class FindFactorial {
    public static int factorial(int num) {
        int result = 1;
        for (int i = num; i>=1; i--) {
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number to be find the factorial: ");
        int a = input.nextInt();
        System.out.println("factorial of the number " + a + ": " + factorial(a));
    }
}
