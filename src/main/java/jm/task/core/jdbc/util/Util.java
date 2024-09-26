package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
//    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/users_for_practice";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public Util() throws SQLException {
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.printf("Connected to database\n");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.printf("Failed to connect to database\n");

        }
        return conn;

    }

    // реализуйте настройку соеденения с БД
}
