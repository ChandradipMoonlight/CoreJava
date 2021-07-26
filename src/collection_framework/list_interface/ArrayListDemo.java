package collection_framework.list_interface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList arr = new ArrayList();
//        // This ArrayList will store heterogeneous data
//        arr.add("Hello");
//        arr.add(123);
//        arr.add('A');
//        arr.add(-1.22);
//        arr.add(null);
//        System.out.println(arr);
        ArrayList<Integer> arrayList = new ArrayList<>();
        // This ArrayList will store only integer type data only t.e. Homogeneous data type
        arrayList.add(123);
        arrayList.add(-12);
        int size = arrayList.size();
        System.out.println(size);
    }
}
