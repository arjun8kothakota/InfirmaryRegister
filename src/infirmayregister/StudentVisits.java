/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infirmayregister;

import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arjun Kothakota
 */
public class StudentVisits extends javax.swing.JFrame {

    /**
     * Creates new form StudentVisits
     */
    public StudentVisits() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        dateTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dateTable = new javax.swing.JTable();
        backLbl = new javax.swing.JLabel();
        enterLbl = new javax.swing.JLabel();
        studentCountLbl = new javax.swing.JLabel();
        clearLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2560, 1600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateTF.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        dateTF.setBorder(null);
        dateTF.setOpaque(false);
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 680, 90));

        dateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "Date", "Reason", "Prescription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dateTable.setRowHeight(40);
        jScrollPane1.setViewportView(dateTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 2560, 850));

        backLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backLblMouseReleased(evt);
            }
        });
        getContentPane().add(backLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(2360, 100, 160, 80));

        enterLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enterLblMouseReleased(evt);
            }
        });
        enterLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterLblKeyPressed(evt);
            }
        });
        getContentPane().add(enterLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(2120, 1460, 310, 100));

        studentCountLbl.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        studentCountLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        studentCountLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                studentCountLblMouseReleased(evt);
            }
        });
        studentCountLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentCountLblKeyPressed(evt);
            }
        });
        getContentPane().add(studentCountLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 350, 220, 80));

        clearLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearLblMouseReleased(evt);
            }
        });
        getContentPane().add(clearLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1450, 320, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/arjun/images/Student Visits Layout.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2940, 1600));

        setSize(new java.awt.Dimension(2586, 1671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseReleased
       StudentLogin studentLoginFrame= new StudentLogin();
       studentLoginFrame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backLblMouseReleased

    private void enterLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterLblMouseReleased
        String string=null;
        Statement statement=null;
        ResultSet resultSet= null;
        
        try{
            DefaultTableModel tableModel = (DefaultTableModel) dateTable.getModel();
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            Connection connection = (Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
            String sql = "select * from PastVisits where Date = '"+dateTF.getText()+"';";
            
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
            
                String date= resultSet.getString("Date");
                String studentID = resultSet.getString("StudentID");
                String reasonForVisit = resultSet.getString("Reason");
                String prescriptionGiven = resultSet.getString("Prescription");
  
                if (studentCountLbl.getText() == "") {
                    
                    tableModel.addRow(new Object[] {studentID, date, reasonForVisit, prescriptionGiven}); 
                }
            }
        
            resultSet.close();
            statement.close();
            connection.close();
            
            if (dateTF.equals("")) {
                jOptionPane1.showMessageDialog(rootPane, "Please enter a date");
            } 
            
        }
        catch(Exception e){
            System.out.println("Catch is caught");
        }
        
        try{
            DefaultTableModel tableModel = (DefaultTableModel) dateTable.getModel();
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/infirmary";
            Connection connection = (Connection) DriverManager.getConnection(database, "root", "arjun");
            statement = (com.mysql.jdbc.Statement) connection.createStatement();
            String sql = "select count(*) from PastVisits where Date = '"+dateTF.getText()+"';";
            
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                
                String sum = resultSet.getString("count(*)");
                studentCountLbl.setText(sum);
                
            }
        
            resultSet.close();
            statement.close();
            connection.close();
            
            
          
        }
        catch(Exception e){
            System.out.println("Catch is caught");
        }
        
        studentCountLbl.requestFocus();
        
    }//GEN-LAST:event_enterLblMouseReleased
  
    private void studentCountLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentCountLblMouseReleased
     
    }//GEN-LAST:event_studentCountLblMouseReleased

    private void enterLblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterLblKeyPressed
       
    }//GEN-LAST:event_enterLblKeyPressed

    private void clearLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLblMouseReleased
        
        dateTable.setModel(new DefaultTableModel(null, new String[]{"StudentID", "Date", "Reason", "Prescription"}));
        dateTF.setText("");
        studentCountLbl.setText("");
        dateTF.requestFocus();
        
    }//GEN-LAST:event_clearLblMouseReleased

    private void studentCountLblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentCountLblKeyPressed
        
    }//GEN-LAST:event_studentCountLblKeyPressed

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
            java.util.logging.Logger.getLogger(StudentVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentVisits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLbl;
    private javax.swing.JLabel clearLbl;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTable dateTable;
    private javax.swing.JLabel enterLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel studentCountLbl;
    // End of variables declaration//GEN-END:variables
}