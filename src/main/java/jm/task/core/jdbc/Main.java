package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();
//UserDao userDao = new UserDaoHibernateImpl();
//userDao.cleanUsersTable();
        userService.createUsersTable();
//        userService.dropUsersTable();
        userService.saveUser("bla", "karambaram", (byte)44);
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("testName", "testLastName", (byte)49);

//        User user = userService.getAllUsers().get(0);
//        System.out.println(user);



    }
}
