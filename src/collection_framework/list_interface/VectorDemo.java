package collection_framework.list_interface;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println("size = " + vector.size());
        System.out.println("capacity = " + vector.capacity()); //10
        for (int i = 0; i<11; i++){
            vector.add(i);
        }
        System.out.println(vector);
        vector.add(11);
        System.out.println(vector.capacity()); //20
        System.out.println(vector.contains(11));
    }
}
