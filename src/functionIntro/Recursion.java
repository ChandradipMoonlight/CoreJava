package functionIntro;

import java.util.Scanner;

public class Recursion {
    /**
     * This is recursive function
     * recursive function means function calling itself.
     * @param a;
     * @return factorial of the number;
     */
    public static int rec(int a) {
        if (a>=1)
            return (a*rec(a-1)); // function calling itself
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to find the factorial: ");
        int num = sc.nextInt();
        int result = rec(num);
        System.out.println("factorial of "+num+" = " + result);
    }
}
