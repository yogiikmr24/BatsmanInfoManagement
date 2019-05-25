package schoolmanagement.Gui;
import database.TeacherDbManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import schoolmanagement.Model.Teacher;
public class TeacherFormDemo extends javax.swing.JFrame {

   private final TeacherDbManager teacherDbManager;
    
       public TeacherFormDemo() {
        initComponents();
         teacherDbManager=new TeacherDbManager();
        if(teacherDbManager.connectToMysql()){
           System.out.println("connected");
        }else{
        System.out.println("not connected");
        }
    }
       
       private Teacher fetchData(){
           int age=0;
           int salary=0;
        String name=txtName.getText();
        String strAge=txtAge.getText();
        if(!strAge.isEmpty()){
        age=Integer.parseInt(strAge);
        }else{
         System.out.println("enter your roll no");
        }
        String subject=(String)comboGrade.getSelectedItem();
        String strSalary=txtSalary.getText();
        if(!strSalary.isEmpty()){
        salary=Integer.parseInt(strSalary);
        }else{
        System.out.println("enter your roll no");
        }
        String address=txtAddress.getText();
        if(!name.isEmpty() && age!=0 && !subject.isEmpty() && salary!=0 && !address.isEmpty()){
            Teacher teacher = new Teacher(name, address, age, salary, subject);
            return teacher;
        }else{
           JOptionPane.showMessageDialog(this,"fill all fields");
           return null;
        }
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        comboGrade = new javax.swing.JComboBox<>();
        SubmitDataButton = new javax.swing.JButton();
        GetRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Grade");

        txtAge1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAge1.setText("Age");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Salary");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtSalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        comboGrade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hindi", "English", "Science", "History", "Computer", "Acoountancy", "Business Study" }));

        SubmitDataButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        SubmitDataButton.setText("Submit");
        SubmitDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitDataButtonActionPerformed(evt);
            }
        });

        GetRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetRecord.setText("Get Record ");
        GetRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtAge1)
                            .addGap(143, 143, 143)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(96, 96, 96))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(86, 86, 86)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAge)
                                        .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                            .addGap(37, 37, 37))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(124, 124, 124))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(SubmitDataButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GetRecord)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAge1)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitDataButton)
                    .addComponent(GetRecord))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitDataButtonActionPerformed
       Teacher teacher=fetchData();
          if(teacherDbManager.addToDb(teacher)){
          System.out.println("submitted");
          }else{
          System.out.println("Not Submitted");
          }
    }//GEN-LAST:event_SubmitDataButtonActionPerformed

    private void GetRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetRecordActionPerformed
     try{
        ArrayList<Teacher> teacherList=  teacherDbManager.getRecordFromTeacher();
        for(Teacher teacher:teacherList){
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getSalary());
        System.out.println(teacher.getAddress());
        }
        }catch(Exception e){
        System.out.println(e);
        }
    }//GEN-LAST:event_GetRecordActionPerformed

    
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(() -> {
                    new TeacherFormDemo().setVisible(true);
                });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetRecord;
    private javax.swing.JButton SubmitDataButton;
    private javax.swing.JComboBox<String> comboGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JLabel txtAge1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
