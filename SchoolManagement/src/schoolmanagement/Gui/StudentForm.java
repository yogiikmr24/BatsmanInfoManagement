/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement.Gui;

import database.StudentDatabaseManager;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import schoolmanagement.Model.Student;

/**
 *
 * @author Dinesh Sheoran
 */
public class StudentForm extends javax.swing.JFrame {

    private StudentDatabaseManager studentDatabaseManager;

    /** Creates new form StudentForm */
    public StudentForm() {
        initComponents();
        studentDatabaseManager = new StudentDatabaseManager();
        if(studentDatabaseManager.connectToMysql()){
           JOptionPane.showMessageDialog(this,"Connected to Database");
        }else{
            JOptionPane.showMessageDialog(this,"Unable to connect to Database");
        }
    }

   

    private Student fetchDataFromFields() {
        int age = 0;
        int rollNo = 0;
        String name = txtName.getText();
        if (!txtAge.getText().isEmpty()) {
            age = Integer.parseInt(txtAge.getText());
        }
        if (!txtRoll.getText().isEmpty()) {
            rollNo = Integer.parseInt(txtRoll.getText());
        }
        String gradeStr = (String) comboGrade.getSelectedItem();
        int grade = Integer.parseInt(gradeStr);
        String address = areaAddress.getText();
        if (!name.isEmpty() && age != 0 && rollNo != 0 && grade != 0 && !address.isEmpty()) {
            Student student = new Student(name, rollNo, grade, address, age);
            return student;
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all information");
            return null;
        }
    }

    private void saveDataToFiles(Student student) {
        try {
            FileWriter write = new FileWriter("Student.txt");
            write.write(student.getName());
            write.write(student.getAge());
            write.write(student.getRollNo());
            write.write(student.getGrade());
            write.write(student.getAddress());
            write.flush();
            write.close();
            System.out.println("successful");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void clearRecord() {
        txtName.setText("");
        txtAge.setText("");
        txtRoll.setText("");
        comboGrade.setSelectedIndex(0);
        areaAddress.setText("");
    }
    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        comboGrade = new javax.swing.JComboBox<>();
        txtRoll = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaAddress = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnShowDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Grade");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("RollNo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");

        txtName.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        comboGrade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        comboGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGradeActionPerformed(evt);
            }
        });

        txtRoll.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        txtAge.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        areaAddress.setColumns(20);
        areaAddress.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        areaAddress.setRows(5);
        jScrollPane1.setViewportView(areaAddress);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnShowDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowDetails.setText("Show Details");
        btnShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDetailsActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(88, 88, 88)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(125, 125, 125)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(100, 100, 100)
                                        .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnShowDetails)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnShowDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGradeActionPerformed


    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Student student = fetchDataFromFields();
        saveDataToFiles(student);
        try {
            studentDatabaseManager.addToDB(student);
        } catch (Exception ex) {
            Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    private void btnShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDetailsActionPerformed
        try {
          ArrayList<Student> studentList = studentDatabaseManager.getAllRecords();
           for(Student student : studentList){
               System.out.println(student.getName());
                System.out.println(student.getRollNo());
           }
        } catch (Exception ex) {
            Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         String strRollNo = txtRoll.getText();
         if(!strRollNo.isEmpty()){
             int rollNo = Integer.parseInt(strRollNo);
             try {   
                 studentDatabaseManager.deleteFromDB(rollNo) ;
             } catch (Exception ex) {
                 Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
             }
                }else{
                JOptionPane.showMessageDialog(this, "Enter roll number");
         }// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String... abc){
        new StudentForm().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaAddress;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnShowDetails;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables
}
