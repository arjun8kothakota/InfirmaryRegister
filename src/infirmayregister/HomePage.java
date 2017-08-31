/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package infirmayregister;

/**
 *
 * @author Arjun Kothakota
 */
public class HomePage extends javax.swing.JFrame {

    /** Creates new form HomePage */
    public HomePage() {
        initComponents();
    }
    
    public HomePage(String message){
        initComponents();
        studentIDTF.setText(message);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentInfoBtn = new javax.swing.JLabel();
        pastiVisitsBtn = new javax.swing.JLabel();
        examinationBtn = new javax.swing.JLabel();
        emailBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        studentIDTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentInfoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentInfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                studentInfoBtnMouseReleased(evt);
            }
        });
        getContentPane().add(studentInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 200, 220));

        pastiVisitsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pastiVisitsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pastiVisitsBtnMouseReleased(evt);
            }
        });
        getContentPane().add(pastiVisitsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 190, 220));

        examinationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        examinationBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                examinationBtnMouseReleased(evt);
            }
        });
        getContentPane().add(examinationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 200, 220));

        emailBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emailBtnMouseReleased(evt);
            }
        });
        getContentPane().add(emailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 190, 220));

        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutBtnMouseReleased(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/arjun/images/Home Page.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        studentIDTF.setEditable(false);
        studentIDTF.setBorder(null);
        studentIDTF.setOpaque(false);
        getContentPane().add(studentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 150, 30));

        setSize(new java.awt.Dimension(1038, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentInfoBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentInfoBtnMouseReleased
                StudentInfo studentInfoPage= new StudentInfo();
                String studentID= studentIDTF.getText();                              
                new StudentInfo(studentID).setVisible(true);
                this.dispose();
    }//GEN-LAST:event_studentInfoBtnMouseReleased

    private void pastiVisitsBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastiVisitsBtnMouseReleased
                String studentID = studentIDTF.getText();                              
                new PastVisits(studentID).setVisible(true);
                this.dispose();
    }//GEN-LAST:event_pastiVisitsBtnMouseReleased

    private void examinationBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examinationBtnMouseReleased
        
    }//GEN-LAST:event_examinationBtnMouseReleased

    private void emailBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailBtnMouseReleased
                new Email(studentIDTF.getText()).setVisible(true);
                this.dispose();
    }//GEN-LAST:event_emailBtnMouseReleased

    private void logoutBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseReleased
                new StudentLogin().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_logoutBtnMouseReleased

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailBtn;
    private javax.swing.JLabel examinationBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JLabel pastiVisitsBtn;
    private javax.swing.JTextField studentIDTF;
    private javax.swing.JLabel studentInfoBtn;
    // End of variables declaration//GEN-END:variables

}
