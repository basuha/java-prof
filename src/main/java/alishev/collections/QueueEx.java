package alishev.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx {
    public static void main(String[] args) {
        QPerson person1 = new QPerson(1);
        QPerson person2 = new QPerson(2);
        QPerson person3 = new QPerson(3);
        QPerson person4 = new QPerson(4);

        Queue<QPerson> peoples = new ArrayBlockingQueue<>(3);
        System.out.println(peoples.offer(person3));
        System.out.println(peoples.offer(person2));
        System.out.println(peoples.offer(person4));
        System.out.println(peoples.offer(person1));
    }
}

class QPerson {
    private int id;

    public QPerson(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QPerson{" +
                "id=" + id +
                '}';
    }
}
