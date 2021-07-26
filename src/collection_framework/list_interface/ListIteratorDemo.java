package collection_framework.list_interface;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    /**
     * this is example of the ListIterator
     * it add retrieve add remove element from the list
     * @param args;
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dipak");
        list.add("Suresh");
        list.add("Arush Gavte");
        System.out.println(list);

        ListIterator ltr = list.listIterator();
        while (ltr.hasNext()) {
            String str = (String) ltr.next();
            System.out.println(str);
            if (str.equals("isCool"))
                ltr.add("boy");
            if (str.equals("Dipak"))
                ltr.add("Mr. Dipak");
        }
        System.out.println(list);
    }
}
