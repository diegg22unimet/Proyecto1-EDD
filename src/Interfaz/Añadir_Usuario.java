/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import EDD.Grafo;
import static Interfaz.Cargar_Datos.v1;

public class Añadir_Usuario extends javax.swing.JFrame {

    public static Modificar_Grafo v3;
    
    public Añadir_Usuario(Modificar_Grafo v3) {
        initComponents();
        this.v3 = v3;
        v3.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        TITULO_Principal = new javax.swing.JLabel();
        nombre_usuarip = new javax.swing.JLabel();
        newUsername_field = new javax.swing.JTextField();
        user_relations = new javax.swing.JLabel();
        select_relation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        agregar_user = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        newRelation_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setText("Añadir Usuario");
        jPanel1.add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        nombre_usuarip.setText("Nombre Usuario");
        jPanel1.add(nombre_usuarip, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        newUsername_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUsername_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(newUsername_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 180, -1));

        user_relations.setText("Usuario para Relacionar");
        jPanel1.add(user_relations, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        select_relation.setText("Seleccionar relacion");
        jPanel1.add(select_relation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 250, 200));

        agregar_user.setText("Agregar Usuario");
        agregar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_userActionPerformed(evt);
            }
        });
        jPanel1.add(agregar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 240, 40));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 503, 80, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 200));

        newRelation_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRelation_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(newRelation_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUsername_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUsername_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUsername_fieldActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        Menu ventana1 = new Menu(v1);
        ventana1.setVisible(true); 
    }//GEN-LAST:event_volverActionPerformed

    private void newRelation_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRelation_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newRelation_fieldActionPerformed

    private void agregar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_userActionPerformed
        
    }//GEN-LAST:event_agregar_userActionPerformed

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
            java.util.logging.Logger.getLogger(Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Añadir_Usuario(v3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JButton agregar_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField newRelation_field;
    private javax.swing.JTextField newUsername_field;
    private javax.swing.JLabel nombre_usuarip;
    private javax.swing.JButton select_relation;
    private javax.swing.JLabel user_relations;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
