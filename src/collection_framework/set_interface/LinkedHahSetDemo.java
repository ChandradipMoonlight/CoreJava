package collection_framework.set_interface;

import java.util.LinkedHashSet;

public class LinkedHahSetDemo {
    public static void main(String[] args) {
        // Insertion order is preserved
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("c");
        h.add("E");
        h.add("null");
        h.add("Z");
        System.out.println(h.add(10));
        System.out.println(h.add("Z")); // It will not add duplicate element
        System.out.println(h);
    }
}
