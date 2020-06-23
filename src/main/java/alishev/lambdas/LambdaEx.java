package alishev.lambdas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        System.out.println(e.execute(10,1));
        System.out.println(e.execute(10,2));
    }
}

public class LambdaEx {
    public static void main(String[] args) {
        Runner runner = new Runner();

        int a = 1;
        runner.run((x,y) -> a + y - x);


        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hllo");
        list.add("llo");
        list.add("Hello");
        list.add("He0000l-lo");
        list.add("H09-00lo");

        list.sort((o1, o2) -> Integer.compare(o1.length(),o2.length()));

        System.out.println(list);

        List<String> list2 = Arrays.asList("str1", "str2", "str3");
        list2.forEach(System.out::println);

        LambdaEx lambdaEx = new LambdaEx();
    }

    public void testMethod(IMy iMy) {
        iMy.doSomething("lol");
    }
}

@FunctionalInterface
interface IMy {
     void doSomething(String s);
}
