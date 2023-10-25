/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;


public class Menu extends javax.swing.JFrame {

    public static Bienvenida v1;
    
    public Menu(Bienvenida v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        Titulo_Principal = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        modif_grafo = new javax.swing.JButton();
        actualizar_txt = new javax.swing.JButton();
        mostrar_grafo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo_Principal.setText("MENU");
        jPanel1.add(Titulo_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 50, 40));

        modif_grafo.setText("Modificar Grafo");
        modif_grafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modif_grafoActionPerformed(evt);
            }
        });
        jPanel1.add(modif_grafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        actualizar_txt.setText("Actualizar");
        actualizar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_txtActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 30));

        mostrar_grafo1.setText("Mostrar Grafo");
        jPanel1.add(mostrar_grafo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void modif_grafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modif_grafoActionPerformed
        Modificar_Grafo ventana2 = new Modificar_Grafo(this);
        ventana2.setVisible(true);
    }//GEN-LAST:event_modif_grafoActionPerformed

    private void actualizar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizar_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo_Principal;
    private javax.swing.JButton actualizar_txt;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modif_grafo;
    private javax.swing.JButton mostrar_grafo1;
    // End of variables declaration//GEN-END:variables
}
