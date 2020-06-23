package alishev.lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaEx2 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(array1);
        fillList(list1);


        //map method
        array1 = Arrays.stream(array1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());


        array1 = Arrays.stream(array1).map(a -> a > 10 ? 0 : 1).toArray();

        System.out.println(list1);
        System.out.println(Arrays.toString(array1));

        //**************************************

        //filter method
        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillList(list2);
        fillArr(array2);

        array2 = Arrays.stream(array2).filter(a -> a % 2 == 0).map(a -> a + 1).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).map(a -> a + 1).collect(Collectors.toList());

        System.out.println(Arrays.toString(array2));
        System.out.println(list2);

        //***********************************

        //foreach method
        Arrays.stream(array2).forEach(System.out::println);
        list2.forEach(System.out::println);

        //************************************


        //reduce method
        int[] array3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillList(list3);
        fillArr(array3);

        int sum1 = Arrays.stream(array3).reduce((acc,b) -> acc + b).getAsInt();
        int sum2 = list3.stream().reduce((acc,b) -> acc * b).get();

        System.out.println(sum1 + " : " + sum2);

        //************************************


        //filter method
        int[] array4 = new int[10];
        fillArr(array4);

        Arrays.stream(array4).filter(a -> a % 2 != 0).map(a -> a * 2).forEach(System.out::println);

        Set<Integer> set = new HashSet<>();
        set.stream().map(a -> a * 2);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }
}
