package alishev;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>(); // order of objects not guarantied

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(); // order guarantied

        Map<Integer,String> treeMap = new TreeMap<>(); // sorting by key (natural ordering)

        testMap(linkedHashMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob2");

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
