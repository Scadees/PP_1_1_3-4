package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserService newTable = new UserServiceImpl();

        newTable.createUsersTable();

        newTable.saveUser("Name1", "LastName1", (byte) 20);
        newTable.saveUser("Name2", "LastName2", (byte) 25);
        newTable.saveUser("Name3", "LastName3", (byte) 31);
        newTable.saveUser("Name4", "LastName4", (byte) 38);

        newTable.removeUserById(1);
        newTable.getAllUsers();
        newTable.cleanUsersTable();
        newTable.dropUsersTable();

    }
}
