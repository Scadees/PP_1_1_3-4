package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static String USERNAME = "Scades";
    private static String PASSWORD = "s151803059698nF";

    public static Connection getConnection() throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }

}
