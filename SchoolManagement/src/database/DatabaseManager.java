package database;

import java.sql.*;

/**
 *
 * @author Dinesh Sheoran
 */
public class DatabaseManager {

    private static final String DATABASE_NAME = "schoolmanagement";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    protected Connection connection;

    public boolean connectToMysql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE_NAME, USER_NAME, PASSWORD);
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
}
