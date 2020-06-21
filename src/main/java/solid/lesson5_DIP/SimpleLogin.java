package solid.lesson5_DIP;

public class SimpleLogin implements Authentificator {

    //low level class

    public boolean auth(User user) {
        // logic
        return true;
    }
}
