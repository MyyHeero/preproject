package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Gavriil", "Gavriilov", (byte) 14);
        userDao.saveUser("Aleksiy", "Gavriilov", (byte) 24);
        userDao.saveUser("YaNe", "Gavriilov", (byte) 34);
        userDao.saveUser("EsheOdin", "Gavriilov", (byte) 44);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();


    }
}
