package collection_framework.set_interface;

import java.util.TreeSet;
/*
This is example of the TreeSet, it is class which implement the SortedSet interface.
Data Structure -> Balance Tree.
Insertion Order -> Sorted Order (Ascending Order)
Heterogeneous objects are not allowed.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("a");
        treeSet.add("B");
        treeSet.add("Z");
        treeSet.add("L");
        treeSet.add("Abccc");
        System.out.println(treeSet);
    }
}
