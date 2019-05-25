
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

//Yogesh Kumar
public class MySqlConnection {

    private String DATABASE_NAME = "BatsmanInfo";
    private String USER_NAME = "root";
    private String PASSWORD = "root";
    private String TABLE_NAME="batsmanInfoRecords";
    
    Connection connection;
  MySqlConnection(){
  
      try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE_NAME, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            System.out.println(ex);
        }
  }
  public boolean saveData(BatsmanInfo batsman){
        try {
            String query="insert into "+TABLE_NAME+" values(?,?,?,?,?)";
            PreparedStatement stmt=connection.prepareStatement(query);
            stmt.setString(1,batsman.getName());
            stmt.setInt(2,batsman.getMatch());
            stmt.setInt(3,batsman.getRuns());
            stmt.setDouble(4,batsman.getStrikeRate());
            stmt.setDouble(5,batsman.getAverage());
            stmt.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
  }
  
  public void deleteRecord(String name){
        try {
            String query="delete from "+TABLE_NAME+" where name=?";
            PreparedStatement stmt=connection.prepareStatement(query);
            stmt.setString(1,name);
            stmt.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  public ArrayList<BatsmanInfo> getRecord() throws SQLException {
        
            String query="select * from " +TABLE_NAME;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<BatsmanInfo> batsmanList=new ArrayList();
            while(resultSet.next()){
                String name=resultSet.getString(1);
                int match=resultSet.getInt(2);
                int runs=resultSet.getInt(3);
                double strikeRate=resultSet.getDouble(4);
                double average=resultSet.getDouble(5);
              BatsmanInfo info=new BatsmanInfo(name,match,runs,strikeRate,average);
              batsmanList.add(info);
            }
         return batsmanList;
                
  }

  
    void updateRecord(BatsmanInfo info, String sName) {
        try {
            
            String query="update "+TABLE_NAME+" set matches=?, runs=?,strikeRate=?, average=? where name='" + sName+"'";
            PreparedStatement stmt=connection.prepareStatement(query);
            stmt.setInt(1, info.getMatch());
            stmt.setInt(2, info.getRuns());
            stmt.setDouble(3, info.getStrikeRate());
            stmt.setDouble(4, info.getAverage());
            stmt.executeUpdate();
                    } catch (SQLException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
