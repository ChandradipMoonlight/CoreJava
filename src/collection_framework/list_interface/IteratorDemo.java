package collection_framework.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    // this is example of retrieving the element from list by using the Iterator
    // by using iterator we can retrieve and remove the element
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i=1; i<11; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            Integer n = (Integer) itr.next();
            if (n%2==0) {
                System.out.print(n + " "); // 2 4 6 8 10
                itr.remove();
            }
        }
        System.out.println(arrayList); // 1 3 5 7 9
    }
}
