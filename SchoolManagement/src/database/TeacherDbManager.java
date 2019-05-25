package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolmanagement.Model.Teacher;

public class TeacherDbManager extends DatabaseManager{
    
    public boolean addToDb(Teacher teacher){
       String query= "insert into teacher values(?,?,?,?,?)";
        try {
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setString(1, teacher.getName());
            ps.setInt(2, teacher.getAge());
            ps.setString(3, teacher.getSubject());
            ps.setInt(4, teacher.getSalary());
            ps.setString(5, teacher.getAddress());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDbManager.class.getName()).log(Level.SEVERE, null, ex);
        }
      return true;
    }

Teacher teacher;

    public ArrayList<Teacher> getRecordFromTeacher() throws SQLException {
        String query="select * from teacher";
Statement statement=connection.createStatement();
ResultSet resultSet=statement.executeQuery(query);
ArrayList<Teacher> arrayList=new ArrayList<>();
while(resultSet.next()){
    String name=resultSet.getString(1);
    int age=resultSet.getInt(2);
    String subject=resultSet.getString(3);
    int salary=resultSet.getInt(4);
    String address=resultSet.getString(5);
   
     teacher=new Teacher(name,address,age,salary,subject);  
    arrayList.add(teacher);
          
}
        return arrayList;
    }

    
}
