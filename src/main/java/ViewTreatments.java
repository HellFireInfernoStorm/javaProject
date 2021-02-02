
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hell
 */
public class ViewTreatments extends javax.swing.JFrame {

    /**
     * Creates new form ViewTreatments
     */
    public ViewTreatments() {
        initComponents();
        changeLang();
        jButton2.doClick();
    }

    int currentLang() {
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

        return langIndex;
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
                jButton1.setText("Sortie");
                jButton2.setText("Mettre à jour");
                jTable1.getColumnModel().getColumn(0).setHeaderValue("ID de traitement");
                jTable1.getColumnModel().getColumn(1).setHeaderValue("ID du patient");
                jTable1.getColumnModel().getColumn(2).setHeaderValue("Traitement");
                jTable1.getColumnModel().getColumn(3).setHeaderValue("Date et l'heure");
                jTable1.getColumnModel().getColumn(4).setHeaderValue("Coût");
                jTable1.getTableHeader().repaint();
                break;
            default:
                break;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Treatment ID", "Patient ID", "Treatment", "Date and Time", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 310));

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 311, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinur\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\main\\java\\Images\\WhiteBack.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String TreatmentID = null;
        String PatientID = null;
        String Treatment = null;
        String DateTime = null;
        Double Cost = null;

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            Connection con = new DBConnect().Connect();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM TREATMENTS";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                TreatmentID = rs.getString(1);
                PatientID = rs.getString(2);
                Treatment = rs.getString(3);
                switch (currentLang()) {
                    case 1:
                        DateTime = rs.getString(5) + " at " + rs.getString(6);
                        break;
                    case 2:
                        DateTime = rs.getString(5) + " à " + rs.getString(6);
                        break;
                    default:
                        DateTime = rs.getString(5) + " at " + rs.getString(6);
                        break;
                }
                Cost = rs.getDouble(4);

                Object[] row = {TreatmentID, PatientID, Treatment, DateTime, Cost};

                model.insertRow(0, row);
            }

        } catch (Exception e) {
            System.out.print(e);
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
            java.util.logging.Logger.getLogger(ViewTreatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTreatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTreatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTreatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTreatments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
