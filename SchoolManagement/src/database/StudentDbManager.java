package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolmanagement.Model.Student;


public class StudentDbManager extends DatabaseManager {
    StudentDbManager studentDbManager;
    
    public boolean addToDbStudent(Student student){
     String query="insert into studentform values(?,?,?,?,?)";
        try {
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getGrade());
            ps.setInt(3, student.getRollNo());
            ps.setInt(4, student.getAge());
            ps.setString(5, student.getAddress());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDbManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }  
   public ArrayList<Student> getRecordFromDb() throws SQLException{
       String query="select * from studentform";
       Statement statement=connection.createStatement();
       ResultSet rs=  statement.executeQuery(query);
       ArrayList<Student> arrayList=new ArrayList<>();
       while(rs.next()){
       String name=rs.getString(1);
       int roll=rs.getInt(2);
       int grade=rs.getInt(3);
       int age=rs.getInt(4);
       String address=rs.getString(5);
       
       Student student=new Student(name,roll,grade ,address,age);
       arrayList.add(student);
       
       }
        return arrayList;
    }
}
