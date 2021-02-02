
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hell
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        changeLang();
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
                jLabel1.setText("Entrez l'ID du patient");
                jLabel2.setText("Nom");
                jLabel3.setText("Le sexe");
                jLabel4.setText("Date de naissance");
                jLabel5.setText("Groupe sanguin");
                jLabel6.setText("Adresse");
                jLabel7.setText("Numéro de contact");
                jLabel8.setText("Email");
                jButton1.setText("Fermer");
                jButton2.setText("Chercher");
                jButton3.setText("Modifier");
                jButton4.setText("Supprimer");
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 515, 100, 38));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel1.setText("Enter Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 51, 177, 36));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 53, 294, 36));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 58, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("Name:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 151, 210, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setText("Gender:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 199, 220, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel4.setText("DOB:");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 247, 240, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel5.setText("Blood Type:");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 295, 230, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel6.setText("Address:");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 343, 240, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel7.setText("Contact No:");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 391, 240, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel8.setText("Email:");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 439, 250, -1));

        jTextField2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 147, 430, -1));

        jTextField3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 195, 430, -1));

        jTextField4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 243, 430, -1));

        jTextField5.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 291, 430, -1));

        jTextField6.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 339, 430, -1));

        jTextField7.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 387, 430, -1));

        jTextField8.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 435, 430, -1));

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton3.setText("Modify");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 515, 100, 38));

        jButton4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 100, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinur\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\main\\java\\Images\\WhiteBack.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:String 
        String PatientID = jTextField1.getText();
        String Name = "";
        String Gender = "";
        String DOB = "";
        String BloodType = "";
        String Address = "";
        String ContactNo = "";
        String Email = "";
        try {
            Connection con = new DBConnect().Connect();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM PATIENTS";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                boolean flag = false;

                if (rs.getString(1).equals(PatientID)) {
                    flag = true;
                    Name = rs.getString(2);
                    Gender = rs.getString(3);
                    DOB = rs.getString(4);
                    BloodType = rs.getString(5);
                    Address = rs.getString(6);
                    ContactNo = rs.getString(7);
                    Email = rs.getString(8);
                }
                if (flag) {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        jTextField2.setText(Name);
        jTextField3.setText(Gender);
        jTextField4.setText(DOB);
        jTextField5.setText(BloodType);
        jTextField6.setText(Address);
        jTextField7.setText(ContactNo);
        jTextField8.setText(Email);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int confirm = 1;
        switch(currentLang()){
            case 1:
                confirm = JOptionPane.showConfirmDialog(null, "Confirm to Change Patient Details", "Change Patient Details", JOptionPane.YES_NO_OPTION);
                break;
            case 2:
                confirm = JOptionPane.showConfirmDialog(null, "Confirmez pour modifier les détails du patient", "Modifier les détails du patient", JOptionPane.YES_NO_OPTION);
                break;
            default:
                confirm = JOptionPane.showConfirmDialog(null, "Confirm to Change Patient Details", "Change Patient Details", JOptionPane.YES_NO_OPTION);
                break;
        }
        
        String PatientID = jTextField1.getText();
        String Name = jTextField2.getText();
        String Gender = jTextField3.getText();
        String DOB = jTextField4.getText();
        String BloodType = jTextField5.getText();
        String Address = jTextField6.getText();
        String ContactNo = jTextField7.getText();
        String Email = jTextField8.getText();

        if (confirm == 0) {
            try {
                Connection con = new DBConnect().Connect();
                Statement stmt = con.createStatement();
                String sql = "UPDATE PATIENTS SET NAME = '" + Name + "', GENDER = '" + Gender + "', DOB = '" + DOB + "', BLOODTYPE = '" + BloodType + "', ADDRESS = '" + Address + "', CONTACTNO = '" + ContactNo + "', EMAIL = '" + Email + "' WHERE ID = '" + PatientID + "'";
                stmt.executeUpdate(sql);
                
                switch(currentLang()){
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "Patient Information Updated");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "Informations patient mises à jour");
                        break;
                    default:
                        JOptionPane.showMessageDialog(rootPane, "Patient Information Updated");
                        break;
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int confirm = 1;
        
        switch(currentLang()){
            case 1:
                confirm = JOptionPane.showConfirmDialog(null, "Confirm to Delete Patient Details", "Delete", JOptionPane.YES_NO_OPTION);
                break;
            case 2:
                confirm = JOptionPane.showConfirmDialog(null, "Confirmer pour supprimer les détails du patient", "Supprimer", JOptionPane.YES_NO_OPTION);
                break;
            default:
                confirm = JOptionPane.showConfirmDialog(null, "Confirm to Delete Patient Details", "Delete", JOptionPane.YES_NO_OPTION);
                break;
        }
        
        String PatientID = jTextField1.getText();

        if (confirm == 0) {
            try {
                Connection con = new DBConnect().Connect();
                Statement stmt = con.createStatement();
                String sql = "DELETE FROM PATIENTS WHERE ID = '" + PatientID + "'";
                stmt.executeUpdate(sql);
                
                switch(currentLang()){
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "Patient information under PatientID : " + PatientID + " has been deleted");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "Les informations patient sous : " + PatientID + " ont été supprimées");
                        break;
                    default:
                        JOptionPane.showMessageDialog(rootPane, "Patient information under PatientID : " + PatientID + " has been deleted");
                        break;
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
