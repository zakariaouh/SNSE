package snse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Event.java
 *F
 * Created on Jun 1, 2012, 4:16:10 PM
 */
/**
 *
 * @author user
 */
public class Event extends javax.swing.JFrame {

    /** Creates new form Event */
    public Event() {
        initComponents();
        this.setLocation(265, 51);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        create = new javax.swing.JRadioButton();
        consult = new javax.swing.JRadioButton();
        modify = new javax.swing.JRadioButton();
        supp = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jRadioButton2.setText("jRadioButton2");

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 480));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Que voulez vous faire :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 60, 320, 28);

        buttonGroup1.add(create);
        create.setFont(new java.awt.Font("Times New Roman", 3, 24));
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("Creer un evenement");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        getContentPane().add(create);
        create.setBounds(10, 160, 340, 37);

        buttonGroup1.add(consult);
        consult.setFont(new java.awt.Font("Times New Roman", 3, 24));
        consult.setForeground(new java.awt.Color(255, 255, 255));
        consult.setText("Consulter un evenement");
        getContentPane().add(consult);
        consult.setBounds(370, 160, 330, 37);

        buttonGroup1.add(modify);
        modify.setFont(new java.awt.Font("Times New Roman", 3, 24));
        modify.setForeground(new java.awt.Color(255, 255, 255));
        modify.setText("Modifier un evenement");
        getContentPane().add(modify);
        modify.setBounds(10, 260, 340, 37);

        buttonGroup1.add(supp);
        supp.setFont(new java.awt.Font("Times New Roman", 3, 24));
        supp.setForeground(new java.awt.Color(255, 255, 255));
        supp.setText("Supprimer un evenement");
        getContentPane().add(supp);
        supp.setBounds(370, 260, 330, 37);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(177, 370, 120, 31);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(470, 370, 130, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/new_message.jpg"))); // NOI18N
        jLabel2.setText("Annuler");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_createActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    if (create.isSelected()) {
        Creat_Event cv = new Creat_Event();
        cv.setVisible(true);
    } else if (consult.isSelected()) {
        Consulter cn = new Consulter();
        cn.setVisible(true);
    } else if (modify.isSelected()) {
        Consulter cn = new Consulter();
        cn.operation = 1;
        cn.setVisible(true);
    } else if (supp.isSelected()) {
        Consulter cn = new Consulter();
        cn.operation = 2;
        cn.setVisible(true);
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    int image_index = 0;
    image_index = Enregitrer.Dser_background_image();
    String background_Image = "new_message";
    switch (image_index) {
        case 1:
            background_Image = "new_message.jpg";
            break;
        case 2:
            background_Image = "new_message2.jpg";
            break;
        case 3:
            background_Image = "new_message3.jpg";
            break;
        case 4:
            background_Image = "new_message4.jpg";
            break;
        case 5:
            background_Image = "new_message5.jpg";
            break;
        case 6:
            background_Image = "new_message6.jpg";
            break;
        case 7:
            background_Image = "new_message7.jpg";
            break;

        default:
            background_Image = "new_message.jpg";
    }
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/" + background_Image)));
}//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Event().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton consult;
    private javax.swing.JRadioButton create;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton modify;
    private javax.swing.JRadioButton supp;
    // End of variables declaration//GEN-END:variables
}