package solid.lesson1_SRP.srp_solution;

public class Phone implements IDataManager,IConnectionManager{
    private IConnectionManager connection;
    private IDataManager dataManager;

    public Phone(IConnectionManager connection, IDataManager dataManager) {
        this.connection = connection;
        this.dataManager = dataManager;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String message) {
        dataManager.send(message);
    }

    @Override
    public int receive() {
        return dataManager.receive();
    }
}
