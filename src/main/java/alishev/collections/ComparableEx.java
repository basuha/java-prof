package alishev.collections;

import java.util.*;

public class ComparableEx {
    public static void main(String[] args) {
        List<NewPerson> peoples = new ArrayList<>();
        Set<NewPerson> peopleSet = new TreeSet<>();

        addElements(peoples);
        addElements(peopleSet);

        System.out.println(peoples);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new NewPerson(4,"george"));
        collection.add(new NewPerson(1,"bob"));
        collection.add(new NewPerson(3,"katy"));
        collection.add(new NewPerson(2,"tom"));


    }
}

class NewPerson implements Comparable<NewPerson>{
    private int id;
    private String name;

    public NewPerson(int id, String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewPerson newPerson = (NewPerson) o;

        if (id != newPerson.id) return false;
        return name != null ? name.equals(newPerson.name) : newPerson.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(NewPerson o) {
        return Integer.compare(name.length(), o.name.length());
    }
}
