package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static Connection connection;
    private static Util newConnection;

    private static String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    public Util() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static Util CreateNewConnection() {
        try {
            if (newConnection == null) {
                newConnection = new Util();
            }
        } catch (SQLException ignored) {}

        return newConnection;
    }

}
