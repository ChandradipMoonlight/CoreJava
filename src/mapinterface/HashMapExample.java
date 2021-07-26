package mapinterface;

import collection_framework.set_interface.HashSetDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("Apple", 78);
        h.put("Bread",25);
        h.forEach((k,v)->System.out.println(k + ":"+v)); // this will iterate all key and value of the Hash Map
        for (Map.Entry<String, Integer> entry : h.entrySet()) {
            // this is another way to iterate the key and value pair
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+ "=" + value);
        }
    }
}
