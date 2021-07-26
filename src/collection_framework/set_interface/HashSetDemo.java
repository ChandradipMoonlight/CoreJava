package collection_framework.set_interface;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Insertion order is not preserved.
        HashSet h = new HashSet<>();
        h.add("B");
        h.add("c");
        h.add("E");
        h.add("null");
        h.add(10);
        h.add("Z");
        System.out.println(h.add("Z")); // It will not add duplicate element
        System.out.println(h);
    }
}
