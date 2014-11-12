/*
 * Main.java
 */
package net.ausiasmarch.semaforo.gui;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author  Programador
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();

        setSize(430, 520);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButtonRojo = new javax.swing.JButton();
        jButtonAmbar = new javax.swing.JButton();
        jButtonVerde = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        semaforo1 = new net.ausiasmarch.semaforo.modelo.Semaforo();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Semáforo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRojo.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButtonRojo.setText("Rojo");
        jButtonRojo.setEnabled(false);
        jButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRojoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 60, 210, 50));

        jButtonAmbar.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButtonAmbar.setText("Ambar");
        jButtonAmbar.setEnabled(false);
        jButtonAmbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAmbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 139, 210, 50));

        jButtonVerde.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButtonVerde.setText("Verde");
        jButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerdeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 222, 210, 50));

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 110, 40));
        getContentPane().add(semaforo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRojoActionPerformed
}//GEN-LAST:event_jButtonRojoActionPerformed

private void jButtonAmbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbarActionPerformed
}//GEN-LAST:event_jButtonAmbarActionPerformed

private void jButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerdeActionPerformed
}//GEN-LAST:event_jButtonVerdeActionPerformed

private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
    salir();
}//GEN-LAST:event_jButtonSalirActionPerformed

private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    salir();
}//GEN-LAST:event_formWindowClosed

private void activaDesactivaBotones(boolean sn) {
   
    
}

private void salir() {
   dispose();
   System.exit(0);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            String look = UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(look);

            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (info.getName().equals(("Nimbus"))) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAmbar;
    private javax.swing.JButton jButtonRojo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVerde;
    private net.ausiasmarch.semaforo.modelo.Semaforo semaforo1;
    // End of variables declaration//GEN-END:variables
}
