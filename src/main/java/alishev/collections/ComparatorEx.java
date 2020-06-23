package alishev.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("swallow");
        animals.add("ow");
        animals.add("dog");
        animals.add("d");

        animals.sort(Comparator.comparingInt(String::length));


        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        numbers.sort(Comparator.reverseOrder());


        System.out.println(numbers);


        List<Person2> person2s = new ArrayList<>();
        person2s.add(new Person2(1,"Bob"));
        person2s.add(new Person2(3,"Katy"));
        person2s.add(new Person2(2,"Perry"));
        person2s.add(new Person2(4,"Josh"));

        person2s.sort(Comparator.comparingInt(Person2::getId));

        System.out.println(person2s);
    }
}

class Person2 {
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
