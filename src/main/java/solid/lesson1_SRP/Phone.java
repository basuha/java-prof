package solid.lesson1_SRP;

public class Phone implements IPhone {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connection " + phoneNumber + "established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }

    @Override
    public void send(String message) {
        System.out.println("data " + message + " sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("data receive successfully");
        return 0;
    }
}
