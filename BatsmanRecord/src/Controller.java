
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

//Owner Yogesh Kumar.
public class Controller {

    private static BatsmanView view;
    private static BatsmanInfo model;
    
    MySqlConnection con;
    Controller(){
    
    con=new MySqlConnection();
    }
    
    public void saveData(BatsmanInfo info){
    
    con.saveData(info);
    }
    
    public ArrayList<BatsmanInfo> getRecord(){
        
        try {
            ArrayList<BatsmanInfo> batsmanList = con.getRecord();
            return batsmanList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    

    public void deleteRecord(String name){
       con.deleteRecord(name);
    }
    
    public void updateData(BatsmanInfo info,String sName){
      con.updateRecord(info,sName);
    
    }
    
    public double calculateStrikeRate(int runs,int balls){
 
        double sr = ((double)runs/(double)balls)*100.0;
        return sr;
    }
    double calculateAverage(int runs, int outs) {
       double avg=(double)runs/(double)outs;
       return avg;
    }
   public static void main(String... abc){
   
       view=new BatsmanView();
       view.setVisible(true);
       model=new BatsmanInfo();
   }

    
    
}
