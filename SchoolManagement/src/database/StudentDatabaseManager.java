
package database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import schoolmanagement.Model.Student;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Dinesh Sheoran
 */
public class StudentDatabaseManager extends DatabaseManager {

    private static final String TABLE_NAME = "studentform";

    public boolean addToDB(Student student) throws Exception {
        String query = "insert into " + TABLE_NAME + " values(?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, student.getName());
        stmt.setInt(2, student.getGrade());
        stmt.setInt(3, student.getRollNo());
        stmt.setInt(4, student.getAge());
        stmt.setString(5, student.getAddress());
        stmt.executeUpdate();

        return true;

    }

    public boolean deleteFromDB(int rollNo) throws Exception {
        String query = "delete from " + TABLE_NAME + " where rollno=" + rollNo;
        PreparedStatement pStatement = connection.prepareStatement(query);
        pStatement.executeUpdate();
        return true;
    }

    public ArrayList<Student> getAllRecords()throws Exception { 
        String query = "select * from " + TABLE_NAME;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<Student> studentList = new ArrayList();
        while (resultSet.next()) {

            String name = resultSet.getString(1);
            int grade = resultSet.getInt(2);
            int rollNo = resultSet.getInt(3);
            int age = resultSet.getInt(4);
            String address = resultSet.getString(5);

            Student student = new Student(name, rollNo, grade, address, age);
            studentList.add(student);

        }
        return studentList;
    }
}
