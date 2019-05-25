package database;
import java.sql.*;
import schoolmanagement.Model.Teacher;

public class TeacherDatabaseManager extends DatabaseManager{
 private static final String TABLE_NAME= "teacher";
    
 
public boolean AddDB(Teacher teacher)throws Exception{
    String query="insert into " + TABLE_NAME + " values(?,?,?,?,?)";
  PreparedStatement ps=connection.prepareStatement(query);
ps.setString(1, teacher.getName());
ps.setInt(2,teacher.getAge());
ps.setString(3,teacher.getSubject());
ps.setInt(4,teacher.getSalary());
ps.setString(5,teacher.getAddress());
ps.executeUpdate();
    return true;

}

public boolean deleteRecord(int age)throws Exception{
  String query="delete from " + TABLE_NAME + " where age="+ age;
  PreparedStatement ps=connection.prepareStatement(query);
 ps.executeUpdate();
return true;
}
}