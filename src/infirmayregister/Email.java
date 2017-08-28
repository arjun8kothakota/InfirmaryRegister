/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infirmayregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Arjun Kothakota
 */
public class Email extends javax.swing.JFrame {

    
    /**
     * Creates new form Email
     */
    public Email() {
        initComponents();
    }
    
    public Email(String message){
         initComponents();
        
        studentIDTF.setText(message);  
        studentIDTF.setVisible(false);
        
        Statement statement = null;
        ResultSet resultSet = null;
        
         try {

            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            Connection connection = (Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
            String sql= "select * from students where StudentID= '" + studentIDTF.getText() + "'";
            
            resultSet=statement.executeQuery(sql);
            if(resultSet.next()){
                String motherEmail = resultSet.getString("motherEmail");
                toEmailTxt.setEnabled(true);              
                toEmailTxt.setText(motherEmail);
                                                                             
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        sendLbl = new javax.swing.JLabel();
        backLbl = new javax.swing.JLabel();
        subjectEmailTxt = new javax.swing.JTextField();
        toEmailTxt = new javax.swing.JTextField();
        logoutLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageEmailTA = new javax.swing.JTextArea();
        studentIDTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sendLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendLblMouseReleased(evt);
            }
        });
        getContentPane().add(sendLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(2050, 1480, 400, 100));

        backLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backLblMouseReleased(evt);
            }
        });
        getContentPane().add(backLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(2356, 116, 180, 70));

        subjectEmailTxt.setBackground(new java.awt.Color(225, 225, 225));
        subjectEmailTxt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        subjectEmailTxt.setText("Visit to the Infirmary : ");
        subjectEmailTxt.setBorder(null);
        subjectEmailTxt.setOpaque(false);
        subjectEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectEmailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(subjectEmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 690, 2340, 90));

        toEmailTxt.setBackground(new java.awt.Color(225, 225, 225));
        toEmailTxt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        toEmailTxt.setBorder(null);
        toEmailTxt.setOpaque(false);
        getContentPane().add(toEmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 2340, 90));

        logoutLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutLblMouseReleased(evt);
            }
        });
        getContentPane().add(logoutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1476, 400, 100));

        jScrollPane1.setBorder(null);

        messageEmailTA.setBackground(new java.awt.Color(225, 225, 225));
        messageEmailTA.setColumns(20);
        messageEmailTA.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        messageEmailTA.setRows(5);
        messageEmailTA.setBorder(null);
        jScrollPane1.setViewportView(messageEmailTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 900, 2340, 530));

        studentIDTF.setEditable(false);
        studentIDTF.setBackground(new java.awt.Color(255, 255, 255));
        studentIDTF.setBorder(null);
        getContentPane().add(studentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/arjun/images/Email layout.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2560, 1600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseReleased
        new PastVisits(studentIDTF.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backLblMouseReleased

    private void sendLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendLblMouseReleased
        SendEmail sendEmail= new SendEmail(toEmailTxt.getText(), subjectEmailTxt.getText(), messageEmailTA.getText());
        jOptionPane1.showMessageDialog(rootPane, "Your mail has been sent");
    }//GEN-LAST:event_sendLblMouseReleased
    
    private void logoutLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLblMouseReleased
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutLblMouseReleased

    private void subjectEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectEmailTxtActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Email().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLbl;
    private javax.swing.JTextArea messageEmailTA;
    private javax.swing.JLabel sendLbl;
    private javax.swing.JTextField studentIDTF;
    private javax.swing.JTextField subjectEmailTxt;
    private javax.swing.JTextField toEmailTxt;
    // End of variables declaration//GEN-END:variables
}
