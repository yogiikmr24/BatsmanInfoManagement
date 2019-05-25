
package schoolmanagement;

import schoolmanagement.Gui.Login;

public class SchoolManagement {

    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
}
