/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package infirmayregister;

import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Arjun Kothakota
 */
public class StudentInfo extends javax.swing.JFrame {

    /** Creates new form StudentInfo */
    public StudentInfo() {
        initComponents();
       
    }
    public StudentInfo(String message){
        initComponents();
        
        studentIDTF2.setText(message);
        String studentID = studentIDTF2.getText();
        String string = null;       
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {

            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            Connection connection = (Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
            String sql= "select * from students where StudentID= '" + studentID + "'";
            
            resultSet=statement.executeQuery(sql);
            if(resultSet.next()){
                String studentName = resultSet.getString("StudentName");
                String classOrSection = resultSet.getString("Class_Section");
                String board = resultSet.getString("Board");
                String motherMobile = resultSet.getString("motherMobile");
                String medicalInfo = resultSet.getString("MedicalInfo");
                String address = resultSet.getString("Address");
                String age = resultSet.getString("Age");
                String dob = resultSet.getString("DOB");
                //String image= resultSet.getString("image");
                
                studentNameTF.setEnabled(true);
                classTF.setEnabled(true);
                boardTF.setEnabled(true);                
                mMobileTF.setEnabled(true); 
                medicalInfoTA.setEnabled(true);
                addressTA1.setEnabled(true);
                ageTF.setEnabled(true);
                dobTF.setEnabled(true);
                
                //imageLbl.setEnabled(true);
                
                studentNameTF.setText(studentName);
                classTF.setText(classOrSection);
                boardTF.setText(board);
                mMobileTF.setText(motherMobile);
                medicalInfoTA.setText(medicalInfo);
                addressTA1.setText(address);
                ageTF.setText(age);
                dobTF.setText(dob);
                
                                             
            }
            resultSet.close();
            statement.close();
            connection.close();
            
            
        }
        catch(Exception e){
            System.out.println("The catch is activated.");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitLbl = new javax.swing.JLabel();
        updateLbl = new javax.swing.JLabel();
        visitsLbl = new javax.swing.JLabel();
        editLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicalInfoTA = new javax.swing.JTextArea();
        mMobileTF = new javax.swing.JTextField();
        fMobileTF = new javax.swing.JTextField();
        studentNameTF = new javax.swing.JTextField();
        classTF = new javax.swing.JTextField();
        boardTF = new javax.swing.JTextField();
        studentIDTF2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTA1 = new javax.swing.JTextArea();
        dobTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1019, 768));
        setMinimumSize(new java.awt.Dimension(1019, 768));
        setPreferredSize(new java.awt.Dimension(1019, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitLblMouseReleased(evt);
            }
        });
        exitLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitLblKeyPressed(evt);
            }
        });
        getContentPane().add(exitLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 90, 40));

        updateLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateLblMouseReleased(evt);
            }
        });
        getContentPane().add(updateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 240, 50));

        visitsLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                visitsLblMouseReleased(evt);
            }
        });
        getContentPane().add(visitsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 680, 240, 50));

        editLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLblMouseReleased(evt);
            }
        });
        getContentPane().add(editLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 240, 50));

        jScrollPane1.setBackground(new java.awt.Color(225, 225, 225));
        jScrollPane1.setBorder(null);

        medicalInfoTA.setEditable(false);
        medicalInfoTA.setBackground(new java.awt.Color(225, 225, 225));
        medicalInfoTA.setColumns(20);
        medicalInfoTA.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        medicalInfoTA.setRows(5);
        medicalInfoTA.setBorder(null);
        medicalInfoTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicalInfoTAKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(medicalInfoTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 420, 150));

        mMobileTF.setEditable(false);
        mMobileTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mMobileTF.setBorder(null);
        mMobileTF.setOpaque(false);
        mMobileTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMobileTFActionPerformed(evt);
            }
        });
        getContentPane().add(mMobileTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 280, 30));

        fMobileTF.setEditable(false);
        fMobileTF.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        fMobileTF.setBorder(null);
        fMobileTF.setOpaque(false);
        getContentPane().add(fMobileTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 990, 340, 50));

        studentNameTF.setEditable(false);
        studentNameTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        studentNameTF.setBorder(null);
        studentNameTF.setOpaque(false);
        getContentPane().add(studentNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 270, 30));

        classTF.setEditable(false);
        classTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        classTF.setBorder(null);
        classTF.setOpaque(false);
        getContentPane().add(classTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 270, 30));

        boardTF.setEditable(false);
        boardTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boardTF.setBorder(null);
        boardTF.setOpaque(false);
        getContentPane().add(boardTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 270, 30));

        studentIDTF2.setEditable(false);
        studentIDTF2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        studentIDTF2.setBorder(null);
        studentIDTF2.setOpaque(false);
        getContentPane().add(studentIDTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 270, 30));

        jScrollPane2.setBackground(new java.awt.Color(225, 225, 225));
        jScrollPane2.setBorder(null);

        addressTA1.setEditable(false);
        addressTA1.setBackground(new java.awt.Color(225, 225, 225));
        addressTA1.setColumns(20);
        addressTA1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addressTA1.setRows(5);
        addressTA1.setBorder(null);
        addressTA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressTA1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(addressTA1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 420, 150));

        dobTF.setEditable(false);
        dobTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dobTF.setBorder(null);
        dobTF.setOpaque(false);
        getContentPane().add(dobTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 280, 40));

        ageTF.setEditable(false);
        ageTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ageTF.setBorder(null);
        ageTF.setOpaque(false);
        getContentPane().add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 280, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/arjun/images/Student Info page layout.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLblMouseReleased
       medicalInfoTA.setEditable(true);
       medicalInfoTA.requestFocus();
       
    }//GEN-LAST:event_editLblMouseReleased

    private void visitsLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitsLblMouseReleased
                String studentID = studentIDTF2.getText();                              
                new PastVisits(studentID).setVisible(true);
                this.dispose();
    }//GEN-LAST:event_visitsLblMouseReleased

    private void updateLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLblMouseReleased
        Statement statement = null;
       
        try {
            
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            Connection connection = (Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
        
            String sql = "Update students set MedicalInfo = '" + medicalInfoTA.getText() + "' where StudentID = '" + studentIDTF2.getText() + "'";
            statement.executeUpdate(sql);
            
            medicalInfoTA.setEditable(false);
            studentIDTF2.requestFocus();
            
            
            
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_updateLblMouseReleased

    private void exitLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseReleased
        StudentLogin studentLoginForm= new StudentLogin();
        studentLoginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitLblMouseReleased

    private void medicalInfoTAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicalInfoTAKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        
            Statement statement = null;
       
        try {
            
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            Connection connection = (Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
        
            String sql = "Update students set MedicalInfo = '" + medicalInfoTA.getText() + "' where StudentID = '" + studentIDTF2.getText() + "'";
            statement.executeUpdate(sql);
            
            medicalInfoTA.setEditable(false);
            studentIDTF2.requestFocus();
            
            
            
        } catch(Exception e) {
            
            }
        
        }
    }//GEN-LAST:event_medicalInfoTAKeyPressed

    private void exitLblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitLblKeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_CONTROL+KeyEvent.VK_BACK_SPACE){
              StudentLogin studentLoginForm= new StudentLogin();
              studentLoginForm.setVisible(true);
              this.dispose();
          }  
    }//GEN-LAST:event_exitLblKeyPressed

    private void addressTA1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressTA1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTA1KeyPressed

    private void mMobileTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMobileTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mMobileTFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTA1;
    private javax.swing.JTextField ageTF;
    private javax.swing.JTextField boardTF;
    private javax.swing.JTextField classTF;
    private javax.swing.JTextField dobTF;
    private javax.swing.JLabel editLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JTextField fMobileTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mMobileTF;
    private javax.swing.JTextArea medicalInfoTA;
    private javax.swing.JTextField studentIDTF2;
    private javax.swing.JTextField studentNameTF;
    private javax.swing.JLabel updateLbl;
    private javax.swing.JLabel visitsLbl;
    // End of variables declaration//GEN-END:variables

}
