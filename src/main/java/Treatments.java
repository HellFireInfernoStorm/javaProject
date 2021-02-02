
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hell
 */
public class Treatments extends javax.swing.JFrame {

    /**
     * Creates new form Treatments
     */
    public Treatments() {
        initComponents();
        showTime();
        showDate();
        setTreatmentID();
        changeLang();
        jTextField4.setEditable(false);

    }

    void changeLang() {
        int langIndex = 1;

        try {

            Connection con = new DBConnect().Connect();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM LANGUAGE";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                langIndex = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        switch (langIndex) {
            case 1:
                break;
            case 2:
                jButton1.setText("Fermer");
                jButton2.setText("Ajouter");
                jLabel1.setText("ID du patient");
                jLabel2.setText("Traitement");
                jLabel3.setText("Coût");
                jLabel4.setText("Date");
                jLabel5.setText("Temps");
                jLabel8.setText("ID de traitement");
            default:
                break;
        }
    }

    void showTime() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            jLabel7.setText(s.format(d));
        }).start();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        jLabel6.setText(s.format(d));
    }

    void setTreatmentID() {
        long HighestID = 0;
        long CurrentID = 0;

        try {

            Connection con = new DBConnect().Connect();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM TREATMENTS";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                CurrentID = Long.valueOf(rs.getString(1));

                if (HighestID <= CurrentID) {
                    HighestID = CurrentID + 1;
                }

                jTextField4.setText("00" + String.valueOf(HighestID));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 113, 170, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setText("Treatment");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 151, 85, 30));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setText("Cost");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 200, 85, 30));

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton1.setText("Close");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, -1, 31));

        jTextField1.setFont(new java.awt.Font("MS PGothic", 0, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(600, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 140, 30));

        jTextField2.setFont(new java.awt.Font("MS PGothic", 0, 14)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(600, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 152, -1, -1));

        jTextField3.setFont(new java.awt.Font("MS PGothic", 0, 14)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(600, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 201, -1, -1));

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 294, 100, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 250, -1, 32));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setText("Time");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 249, -1, 34));

        jLabel6.setFont(new java.awt.Font("MS PGothic", 0, 14)); // NOI18N
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 249, 217, 32));

        jLabel7.setFont(new java.awt.Font("MS PGothic", 0, 14)); // NOI18N
        jLabel7.setText("Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 249, 201, 35));

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel8.setText("TreatmentID");
        jLabel8.setPreferredSize(new java.awt.Dimension(68, 20));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 59, 170, 33));

        jTextField4.setFont(new java.awt.Font("MS PGothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 59, 140, 33));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinur\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\main\\java\\Images\\WhiteBack.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String TreatmentID = jTextField4.getText();
        String PatientID = jTextField1.getText();
        String Treatment = jTextField2.getText();
        double Cost = Double.parseDouble(jTextField3.getText());
        String Date = jLabel6.getText();
        String Time = jLabel7.getText();

        try {
            Connection con = new DBConnect().Connect();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO TREATMENTS VALUES ('" + TreatmentID + "', '" + PatientID + "', '" + Treatment + "', " + Cost + ", '" + Date + "', '" + Time + "')";
            stmt.executeUpdate(sql);

            new Treatments().setVisible(true);
            this.setVisible(false);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
