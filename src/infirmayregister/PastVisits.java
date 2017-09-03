/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infirmayregister;

import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;


/**
 *
 * @author Arjun Kothakota
 */
public class PastVisits extends javax.swing.JFrame {

    /**
     * Creates new form PastVisits
     */
    public PastVisits() {
        initComponents();
    }

    public PastVisits(String message){
        initComponents();
        
        studentIDTF.setText(message);
        
        
         try {
            DefaultTableModel model = (DefaultTableModel) pastVisitsTable.getModel();
            Class.forName("java.sql.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/infirmary","root","arjun");
            Statement statement=connection.createStatement();
            String query="Select * from pastvisits where StudentID = '" + studentIDTF.getText() + "';";
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()){
 
                String date=resultSet.getString("Date");
                String reasonForVisit=resultSet.getString("Reason");
                String prescriptionGiven=resultSet.getString("Prescription");
                String time = resultSet.getString("time");
               

                model.addRow(new Object[] {date, reasonForVisit, prescriptionGiven, time});
                
 }
            resultSet.close();
            statement.close();
            connection.close();
         } 
         catch (Exception ex) {
            jOptionPane1.showMessageDialog(rootPane, "Error in connectivity");
        }
         
         currentDateAndTime();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        studentIDTF = new javax.swing.JTextField();
        reasonTF = new javax.swing.JTextField();
        prescriptionTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        addLbl = new javax.swing.JLabel();
        deleteLbl = new javax.swing.JLabel();
        updateLbl = new javax.swing.JLabel();
        draftMailLbl = new javax.swing.JLabel();
        backLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pastVisitsTable = new javax.swing.JTable();
        timeTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1385, 830));
        setMinimumSize(new java.awt.Dimension(1385, 830));
        setPreferredSize(new java.awt.Dimension(1385, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentIDTF.setEditable(false);
        studentIDTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        studentIDTF.setBorder(null);
        studentIDTF.setOpaque(false);
        studentIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDTFActionPerformed(evt);
            }
        });
        getContentPane().add(studentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 310, 40));

        reasonTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reasonTF.setBorder(null);
        reasonTF.setOpaque(false);
        getContentPane().add(reasonTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 680, 310, 40));

        prescriptionTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        prescriptionTF.setBorder(null);
        prescriptionTF.setOpaque(false);
        getContentPane().add(prescriptionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 680, 310, 40));

        dateTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dateTF.setBorder(null);
        dateTF.setOpaque(false);
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 310, 40));

        addLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addLblMouseReleased(evt);
            }
        });
        getContentPane().add(addLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 60));

        deleteLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteLblMouseReleased(evt);
            }
        });
        getContentPane().add(deleteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 230, 60));

        updateLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateLblMouseReleased(evt);
            }
        });
        getContentPane().add(updateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 220, 60));

        draftMailLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        draftMailLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                draftMailLblMouseReleased(evt);
            }
        });
        getContentPane().add(draftMailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(2230, 290, 310, 90));

        backLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backLblMouseReleased(evt);
            }
        });
        getContentPane().add(backLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 80, 90, 40));

        pastVisitsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 133, 244), 3, true));
        pastVisitsTable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pastVisitsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date (YYYY/MM/DD)", "Reason for Visit", "Prescription Given", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pastVisitsTable.setRowHeight(50);
        pastVisitsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastVisitsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pastVisitsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1360, 340));

        timeTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeTF.setBorder(null);
        timeTF.setCaretColor(new java.awt.Color(237, 230, 230));
        timeTF.setOpaque(false);
        getContentPane().add(timeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/arjun/images/Past Visits Layout.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDTFActionPerformed

    private void addLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLblMouseReleased
        
        DefaultTableModel tableModel = (DefaultTableModel) pastVisitsTable.getModel();
        
            if((dateTF.getText().trim().equals("")||reasonTF.getText().trim().equals("")||prescriptionTF.getText().trim().equals("")) 
                || (dateTF.getText().trim().equals("") || reasonTF.getText().trim().equals(""))
                || (reasonTF.getText().trim().equals("") || prescriptionTF.getText().trim().equals(""))
                || (dateTF.getText().trim().equals("") || prescriptionTF.getText().trim().equals(""))){
            
            jOptionPane1.showMessageDialog(rootPane, "Please enter the missing fields");

            }else{
            
            tableModel.addRow(new Object[] {dateTF.getText(), reasonTF.getText(), prescriptionTF.getText(), timeTF.getText()});
            
            try {
            Statement statement = null;
            
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();        
        
            String sql = "insert into pastvisits values('"+studentIDTF.getText()+"', '"+dateTF.getText()+"', '"+reasonTF.getText()+"', '"+prescriptionTF.getText()+"', time(sysdate())) ;";
            statement.executeUpdate(sql);
            
            Calendar calendar = new GregorianCalendar();
        
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
            
            dateTF.setText(year + "-" + month + "-" + day);
            reasonTF.setText("");
            prescriptionTF.setText("");
            
            int second = calendar.get(Calendar.SECOND);
        int minute = calendar.get(Calendar.MINUTE);
        int hour = calendar.get(Calendar.HOUR);
        
        timeTF.setText(hour + ":"+ minute + ":" + second);
              
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

            }      
            
             
       
        
        
        
    }//GEN-LAST:event_addLblMouseReleased
    
    public void currentDateAndTime(){
    
        Calendar calendar = new GregorianCalendar();
        
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        
        dateTF.setText(year + "-" + month + "-" + day);
        
        int second = calendar.get(Calendar.SECOND);
        int minute = calendar.get(Calendar.MINUTE);
        int hour = calendar.get(Calendar.HOUR);
        
        timeTF.setText(hour + ":"+ minute + ":" + second);
        
        Thread clock = new Thread(){
        
        public void run(){
            for (;;){
                
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException();
                }
            }
                
           }
        };
        
        clock.start();
    
    }
    
    
    private void deleteLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLblMouseReleased
        DefaultTableModel tableModel = (DefaultTableModel) pastVisitsTable.getModel();
        
        
        if(pastVisitsTable.getSelectedRow()==-1){
            if(pastVisitsTable.getRowCount()==0){
                jOptionPane1.showMessageDialog(rootPane, "Table is empty");
            }else{
                jOptionPane1.showMessageDialog(rootPane, "You must select a row");
            }
            
        }else{
            
            if((dateTF.getText().trim().equals("")||reasonTF.getText().trim().equals("")||prescriptionTF.getText().trim().equals("")) 
                || (dateTF.getText().trim().equals("") || reasonTF.getText().trim().equals(""))
                || (reasonTF.getText().trim().equals("") || prescriptionTF.getText().trim().equals(""))
                || (dateTF.getText().trim().equals("") || prescriptionTF.getText().trim().equals(""))){
            
            jOptionPane1.showMessageDialog(rootPane, "Please enter the missing fields");

            }else{
            
            int reply = JOptionPane.showConfirmDialog(rootPane, "Confirm Delete?", null, JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION){
            tableModel.removeRow(pastVisitsTable.getSelectedRow());
            }else if(reply == JOptionPane.NO_OPTION){
             
                }
            Statement statement=null;
        
         try {
            
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
        
            String sql = "delete from pastvisits where StudentID = '"+ studentIDTF.getText() +"' and time = '"+ timeTF.getText() +"';";
            statement.executeUpdate(sql);
            
            Calendar calendar = new GregorianCalendar();
        
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
            
            dateTF.setText(year + "-" + month + "-" + day);
            reasonTF.setText("");
            prescriptionTF.setText("");
            
            int second = calendar.get(Calendar.SECOND);
        int minute = calendar.get(Calendar.MINUTE);
        int hour = calendar.get(Calendar.HOUR);
        
        timeTF.setText(hour + ":"+ minute + ":" + second);
            
            pastVisitsTable.changeSelection(pastVisitsTable.getSelectedRow(), pastVisitsTable.getSelectedColumn(), false, false);
            
            
              
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
            }
        }
        
        
    }//GEN-LAST:event_deleteLblMouseReleased

    private void updateLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLblMouseReleased
        
        DefaultTableModel tableModel = (DefaultTableModel) pastVisitsTable.getModel();
        if(pastVisitsTable.getSelectedRow()== -1){
            if(pastVisitsTable.getRowCount()== 0){
                jOptionPane1.showMessageDialog(rootPane, "Table is empty");
            }else{
                jOptionPane1.showMessageDialog(rootPane, "You must select a row");
            }
            
        }else{
            
            if((dateTF.getText().trim().equals("")||reasonTF.getText().trim().equals("")||prescriptionTF.getText().trim().equals("")) 
                || (dateTF.getText().trim().equals("") || reasonTF.getText().trim().equals(""))
                || (reasonTF.getText().trim().equals("") || prescriptionTF.getText().trim().equals(""))
                || (dateTF.getText().trim().equals("") || prescriptionTF.getText().trim().equals(""))){
            
            jOptionPane1.showMessageDialog(rootPane, "Please enter the missing fields");

            }else{
         
            tableModel.setValueAt(dateTF.getText(), pastVisitsTable.getSelectedRow(), 0);
            tableModel.setValueAt(reasonTF.getText(), pastVisitsTable.getSelectedRow(), 1);
            tableModel.setValueAt(prescriptionTF.getText(), pastVisitsTable.getSelectedRow(), 2);
            
            Statement statement = null;
        
        try {
            
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
        
            String sql = "update pastvisits set date = '"+dateTF.getText()+"', reason = '"+reasonTF.getText()+"', prescription = '"+prescriptionTF.getText()+"' where time = '"+timeTF.getText()+"' and StudentID = '"+studentIDTF.getText()+"';";
            statement.executeUpdate(sql);
            
            Calendar calendar = new GregorianCalendar();
        
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
            
            dateTF.setText(year + "-" + month + "-" + day);
            reasonTF.setText("");
            prescriptionTF.setText("");
            
            int second = calendar.get(Calendar.SECOND);
        int minute = calendar.get(Calendar.MINUTE);
        int hour = calendar.get(Calendar.HOUR);
        
        timeTF.setText(hour + ":"+ minute + ":" + second);
            
            
          
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
            
            }
        }            
    
        
        
    }//GEN-LAST:event_updateLblMouseReleased
  
    private void draftMailLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draftMailLblMouseReleased
    
    }//GEN-LAST:event_draftMailLblMouseReleased

    private void backLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseReleased
            String studentID = studentIDTF.getText();                              
            new HomePage(studentID).setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backLblMouseReleased

    private void pastVisitsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastVisitsTableMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) pastVisitsTable.getModel();
        
        dateTF.setText(tableModel.getValueAt(pastVisitsTable.getSelectedRow(), 0).toString());
        
        reasonTF.setText(tableModel.getValueAt(pastVisitsTable.getSelectedRow(), 1).toString());
        
        prescriptionTF.setText(tableModel.getValueAt(pastVisitsTable.getSelectedRow(), 2).toString());
        
        timeTF.setText(tableModel.getValueAt(pastVisitsTable.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_pastVisitsTableMouseClicked

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
            java.util.logging.Logger.getLogger(PastVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PastVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PastVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PastVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PastVisits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLbl;
    private javax.swing.JLabel backLbl;
    private javax.swing.JTextField dateTF;
    private javax.swing.JLabel deleteLbl;
    private javax.swing.JLabel draftMailLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pastVisitsTable;
    private javax.swing.JTextField prescriptionTF;
    private javax.swing.JTextField reasonTF;
    private javax.swing.JTextField studentIDTF;
    private javax.swing.JTextField timeTF;
    private javax.swing.JLabel updateLbl;
    // End of variables declaration//GEN-END:variables
}
