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
                String fatherMobile = resultSet.getString("fatherMobile");
                String motherMobile = resultSet.getString("motherMobile");
                String medicalInfo = resultSet.getString("MedicalInfo");
                //String image= resultSet.getString("image");
                
                studentNameTF.setEnabled(true);
                classTF.setEnabled(true);
                boardTF.setEnabled(true);
                fMobileTF.setEnabled(true);
                mMobileTF.setEnabled(true); 
                medicalInfoTA.setEnabled(true);
                //imageLbl.setEnabled(true);
                
                studentNameTF.setText(studentName);
                classTF.setText(classOrSection);
                boardTF.setText(board);
                fMobileTF.setText(fatherMobile);
                mMobileTF.setText(motherMobile);
                medicalInfoTA.setText(medicalInfo);
                
                                             
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
        imageLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(exitLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(2390, 90, 140, 70));

        updateLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateLblMouseReleased(evt);
            }
        });
        getContentPane().add(updateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1460, 360, 90));

        visitsLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                visitsLblMouseReleased(evt);
            }
        });
        getContentPane().add(visitsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(2110, 1460, 360, 90));

        editLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLblMouseReleased(evt);
            }
        });
        getContentPane().add(editLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1460, 360, 90));

        jScrollPane1.setBackground(new java.awt.Color(225, 225, 225));
        jScrollPane1.setBorder(null);

        medicalInfoTA.setEditable(false);
        medicalInfoTA.setBackground(new java.awt.Color(225, 225, 225));
        medicalInfoTA.setColumns(20);
        medicalInfoTA.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        medicalInfoTA.setRows(5);
        medicalInfoTA.setBorder(null);
        medicalInfoTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicalInfoTAKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(medicalInfoTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1406, 966, 830, 400));

        mMobileTF.setEditable(false);
        mMobileTF.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        mMobileTF.setBorder(null);
        mMobileTF.setOpaque(false);
        getContentPane().add(mMobileTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1080, 340, 50));

        fMobileTF.setEditable(false);
        fMobileTF.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        fMobileTF.setBorder(null);
        fMobileTF.setOpaque(false);
        getContentPane().add(fMobileTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 990, 340, 50));

        studentNameTF.setEditable(false);
        studentNameTF.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        studentNameTF.setBorder(null);
        studentNameTF.setOpaque(false);
        getContentPane().add(studentNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 510, 640, 80));

        classTF.setEditable(false);
        classTF.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        classTF.setBorder(null);
        classTF.setOpaque(false);
        getContentPane().add(classTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 630, 640, 80));

        boardTF.setEditable(false);
        boardTF.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boardTF.setBorder(null);
        boardTF.setOpaque(false);
        getContentPane().add(boardTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 750, 640, 80));

        studentIDTF2.setEditable(false);
        studentIDTF2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        studentIDTF2.setBorder(null);
        studentIDTF2.setOpaque(false);
        getContentPane().add(studentIDTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 380, 640, 80));
        getContentPane().add(imageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 320, 460));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/arjun/images/Student Info page layout.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2560, -1));

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
    private javax.swing.JTextField boardTF;
    private javax.swing.JTextField classTF;
    private javax.swing.JLabel editLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JTextField fMobileTF;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mMobileTF;
    private javax.swing.JTextArea medicalInfoTA;
    private javax.swing.JTextField studentIDTF2;
    private javax.swing.JTextField studentNameTF;
    private javax.swing.JLabel updateLbl;
    private javax.swing.JLabel visitsLbl;
    // End of variables declaration//GEN-END:variables

}
