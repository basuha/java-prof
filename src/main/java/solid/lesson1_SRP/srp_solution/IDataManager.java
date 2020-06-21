package solid.lesson1_SRP.srp_solution;

public interface IDataManager {
    void send(String message);
    int receive();
}
