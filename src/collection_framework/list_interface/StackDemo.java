package collection_framework.list_interface;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("stack element after peek method" + stack);
        System.out.println(stack.pop()); // it will remove the top element and print it
        System.out.println("After pop method" + stack);
        System.out.println(stack.search("A"));
        // this method will give us the position of the
        // the element form top element,
        // if the element is not present in the stack then it will give the position -1.
    }
}
