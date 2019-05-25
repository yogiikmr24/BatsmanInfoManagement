
import java.sql.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDatabase {
private static final String TABLE_NAME = "employeesDetails";
    Connection connection;
    public boolean connect() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeRecord", "root", "root");
             //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE_NAME, USER_NAME, PASSWORD);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public boolean add(Employee employee) throws Exception {
        String query = "insert into "+TABLE_NAME+" values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, employee.getName());
        ps.setInt(2, employee.getId());
        ps.setString(3, employee.getAddress());
        ps.setInt(4, employee.getSalary());
        ps.executeUpdate();//kr run
        return true;
    }
    
    public boolean Delete(int id)throws Exception{
    String query = "delete from "+TABLE_NAME+" where id="+id;;
    PreparedStatement ps=connection.prepareStatement(query);
    ps.executeUpdate();
    return true;
    
    }
}

