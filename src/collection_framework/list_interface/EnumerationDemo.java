package collection_framework.list_interface;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i<11; i++) {
            vector.add(i);
        }
        System.out.println(vector);
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            int element = enumeration.nextElement();
            if (element%2==0)
                System.out.print(element+" ");
        }
        System.out.println("\n" + vector);
    }
}
