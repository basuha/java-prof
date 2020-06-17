package solid.lesson1;

public interface IPhone {
    void dial(String phoneNumber);
    void disconnect();

    void send(String message);
    int receive();
}
