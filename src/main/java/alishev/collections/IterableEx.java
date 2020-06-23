package alishev.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        Iterator<Integer> iterator = list.iterator();

        var idx = 0;

        System.out.println(iterator.next());
        System.out.println(iterator.next());

        for (var x : list)
            System.out.println(x);
    }
}
