package collection_framework.list_interface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
//        LinkedList <Integer> linkedList = new LinkedList<>(); // this is for only for storing homogeneous data
        LinkedList linkedList = new LinkedList(); // this will store heterogeneous data
        linkedList.add("Chandradip");
        linkedList.add(123);
        linkedList.add('A');
        linkedList.add(null);
        linkedList.add("Chandradip");
        System.out.println(linkedList);
        linkedList.set(0, "Dipak");
        System.out.println(linkedList);
        linkedList.add(0, "prakash");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
    }
}
