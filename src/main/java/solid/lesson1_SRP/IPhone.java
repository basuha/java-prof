package solid.lesson1_SRP;

public interface IPhone {
    void dial(String phoneNumber);
    void disconnect();

    void send(String message);
    int receive();
}
