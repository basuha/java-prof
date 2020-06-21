package solid.lesson1_SRP.emplyee_arch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection connection;
    private static DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection("database urls");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("connected to db");
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("disconnected");
    }
}
