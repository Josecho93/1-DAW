/*
 * Hipoteca.java
 */
package net.ausiasmarch.hipoteca.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.ausiasmarch.common.Convert;
import net.ausiasmarch.hipoteca.modelo.*;

/**
 *
 * @author Programador
 */
public class Main extends javax.swing.JFrame {

    private Hipoteca hipoteca;

    public Main() {
        initComponents();

        hipoteca = new Hipoteca();

        setSize(610, 480);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldApe1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldEuribor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDiferencial = new javax.swing.JTextField();
        jTextFieldInteresAnual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIngresosMes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldImportePrestamo = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCuotaMensual = new javax.swing.JTextField();
        jCheckBoxFuncionario = new javax.swing.JCheckBox();
        jCheckBoxSeguroVida = new javax.swing.JCheckBox();
        jCheckBoxTarjeta = new javax.swing.JCheckBox();
        jCheckBoxNomina = new javax.swing.JCheckBox();
        jCheckBoxPension = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDiferencialReal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAnyos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNIF = new javax.swing.JTextField();
        jTextFieldCCC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo Hipoteca");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 15, -1, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 13, 170, -1));

        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 15, -1, -1));
        getContentPane().add(jTextFieldApe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 13, 270, -1));

        jLabel4.setText("Euribor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 234, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 580, 13));
        getContentPane().add(jTextFieldEuribor, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 254, 76, -1));

        jLabel6.setText("Diferencial:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 234, -1, -1));
        getContentPane().add(jTextFieldDiferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 254, 54, -1));

        jTextFieldInteresAnual.setEditable(false);
        jTextFieldInteresAnual.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextFieldInteresAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 324, 65, -1));

        jLabel8.setText("Interes Anual");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 304, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, 580, 13));

        jLabel9.setText("Ingresos Mensuales:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 102, -1, -1));
        getContentPane().add(jTextFieldIngresosMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 122, 111, -1));

        jLabel10.setText("Importe Prestamo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 184, -1, -1));
        getContentPane().add(jTextFieldImportePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 181, 120, -1));

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 324, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 580, 9));

        jLabel11.setText("Cuota mensual:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 304, -1, -1));

        jTextFieldCuotaMensual.setEditable(false);
        jTextFieldCuotaMensual.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextFieldCuotaMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 324, 195, -1));

        jCheckBoxFuncionario.setText("Funcionario");
        jCheckBoxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 121, -1, -1));

        jCheckBoxSeguroVida.setText("Seguro Vida");
        getContentPane().add(jCheckBoxSeguroVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jCheckBoxTarjeta.setText("Tarjeta");
        getContentPane().add(jCheckBoxTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 255, -1, -1));

        jCheckBoxNomina.setText("Nómina");
        getContentPane().add(jCheckBoxNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jCheckBoxPension.setText("Plan pensiones");
        getContentPane().add(jCheckBoxPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 255, -1, -1));

        jLabel7.setText("Diferencial Real:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 304, -1, -1));

        jTextFieldDiferencialReal.setEditable(false);
        jTextFieldDiferencialReal.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextFieldDiferencialReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 325, 78, -1));

        jLabel12.setText("Años:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 184, -1, -1));
        getContentPane().add(jTextFieldAnyos, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 180, 70, -1));

        jLabel5.setText("Edad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 102, -1, -1));
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 122, 45, -1));

        jLabelResultado.setBackground(new java.awt.Color(227, 227, 235));
        jLabelResultado.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setOpaque(true);
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 579, 73));

        jLabel13.setText("NIF:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 45, -1, 19));
        getContentPane().add(jTextFieldNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 64, 120, -1));

        jTextFieldCCC.setEnabled(false);
        getContentPane().add(jTextFieldCCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 64, 372, -1));

        jLabel14.setText("Código Cuenta Corriente (CCC)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 45, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

    // Declaramos variables para datos de entrada .............................
    double ingresosMes, importePrestamo, euribor, diferencial;
    int anyos, edad;
    Nif nif;

    StringBuilder sb = new StringBuilder();

    double diferencialReal, cuotaMensual, interesAnual;

    // Limpiamos los datos de salida o resultados
    jTextFieldDiferencialReal.setText("");
    jTextFieldInteresAnual.setText("");
    jTextFieldCuotaMensual.setText("");
    jLabelResultado.setText("");

    // Obtenemos y validamos los datos de entrada.............................
    if (jTextFieldNombre.getText().isEmpty()) {
        //mensaje("El nombre no puede quedar en blanco");
        //return;
        sb.append("El nombre no puede quedar en blanco\n");
    }

    if (jTextFieldApe1.getText().isEmpty()) {
        //mensaje("El apellido no puede quedar en blanco");
        //return;
        sb.append("El apellido no puede quedar en blanco\n");
    }

    nif = new Nif(jTextFieldNIF.getText());
    if (!nif.isNifValid()) {
        //mensaje(nif.getMensaje());
        //return;
        sb.append(nif.getMensaje());
        sb.append("\n");
    }

    if (!Convert.isValidDouble(jTextFieldIngresosMes.getText())) {
        //mensaje("Ingresos no validos");
        //return;
        sb.append("Ingresos no validos\n");
    } else {
        ingresosMes = Convert.parseDouble(jTextFieldIngresosMes.getText());
        hipoteca.setIngresosMensuales(ingresosMes);
    }

    if (!Convert.isValidInt(jTextFieldEdad.getText())) {
        //mensaje("Edad no valida");
        //return;
        sb.append("Edad no valida\n");
    } else {
        edad = Convert.parseInt(jTextFieldEdad.getText());
        hipoteca.setEdad(edad);
    }

    if (!Convert.isValidDouble(jTextFieldImportePrestamo.getText())) {
        //mensaje("Importe del Prestamo no valido");
        //return;
        sb.append("Importe del Prestamo no valido\n");
    } else {
        importePrestamo = Convert.parseDouble(jTextFieldImportePrestamo.getText());
        hipoteca.setImportePrestamo(importePrestamo);
    }

    if (!Convert.isValidInt(jTextFieldAnyos.getText())) {
        //mensaje("Anyos no validos");
        //return;
        sb.append("Anyos no validos\n");
    } else {
        anyos = Convert.parseInt(jTextFieldAnyos.getText());
        hipoteca.setAnyos(anyos);
    }

    if (!Convert.isValidDouble(jTextFieldEuribor.getText())) {
        //mensaje("Euribor no valido");
        //return;
        sb.append("Euribor no valido\n");
    } else {
        euribor = Convert.parseDouble(jTextFieldEuribor.getText());
        hipoteca.setEuribor(euribor);
    }

    if (!Convert.isValidDouble(jTextFieldDiferencial.getText())) {
        //mensaje("Diferencial no valido");
        //return;
        sb.append("Diferencial no valido");
    } else {
        diferencial = Convert.parseDouble(jTextFieldDiferencial.getText());
        hipoteca.setDiferencial(diferencial);
    }

    hipoteca.setFuncionario(jCheckBoxFuncionario.isSelected());
    hipoteca.setContratadoSeguroVida(jCheckBoxSeguroVida.isSelected());
    hipoteca.setContratadoNomina(jCheckBoxNomina.isSelected());
    hipoteca.setContratadoTarjeta(jCheckBoxTarjeta.isSelected());
    hipoteca.setContratadoPension(jCheckBoxPension.isSelected());

    /*
     // Convertimos los datos de entrada......................................
     ingresosMes = Convert.parseDouble(jTextFieldIngresosMes.getText());
     edad = Convert.parseInt(jTextFieldEdad.getText());
     importePrestamo = Convert.parseDouble(jTextFieldImportePrestamo.getText());
     anyos = Convert.parseInt(jTextFieldAnyos.getText());
     euribor = Convert.parseDouble(jTextFieldEuribor.getText());
     diferencial = Convert.parseDouble(jTextFieldDiferencial.getText());
            
     // Asignamos los datos a las propiedades de la hipoteca con los metodos set ....
     hipoteca.setIngresosMensuales(ingresosMes);
     hipoteca.setEdad(edad);
     hipoteca.setImportePrestamo(importePrestamo);
     hipoteca.setAnyos(anyos);
     hipoteca.setEuribor(euribor);
     hipoteca.setDiferencial(diferencial);
    
     hipoteca.setFuncionario(jCheckBoxFuncionario.isSelected());
     hipoteca.setContratadoSeguroVida(jCheckBoxSeguroVida.isSelected());
     hipoteca.setContratadoNomina(jCheckBoxNomina.isSelected());
     hipoteca.setContratadoTarjeta(jCheckBoxTarjeta.isSelected());
     hipoteca.setContratadoPension(jCheckBoxPension.isSelected());
     */
    
    if (sb.length() > 0){
        sb.append("\n\n");
    }
    
    //Validamos datos de la hipoteca usado las reglas de validación ...........
    if (hipoteca.validate() == false) {
        //mensaje(hipoteca.getMensaje());
        //return;
        sb.append(hipoteca.getMensaje());
    }
    
    if (sb.length() > 0){
        mensaje(sb.toString());
        return;
    }

    // Obtenemos cálculos desde el objeto hipoteca .............................
    diferencialReal = hipoteca.getDiferencialReal();
    interesAnual = hipoteca.getInteresAnual();
    cuotaMensual = hipoteca.getCuotaMensual();

    // Mostramos los resultados con el formato adecuado .......................
    jTextFieldDiferencialReal.setText(Convert.format(diferencialReal, 2));
    jTextFieldInteresAnual.setText(Convert.format(interesAnual, 2));
    jTextFieldCuotaMensual.setText(Convert.format(cuotaMensual, 2));

    jLabelResultado.setForeground(Color.BLUE);
    jLabelResultado.setText("CONCEDIDA");
}//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jCheckBoxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxFuncionarioActionPerformed

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * *********************************************************************
     * /** Método principal del JFrame donde se inicia la aplicación
     * /**********************************************************************
     */
    public static void main(String args[]) {
        try {
            String look = UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(look);
            /*
             for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
             if (info.getName().equals(("Nimbus"))) {
             javax.swing.UIManager.setLookAndFeel(info.getClassName());
             break;
             }
             }
             */
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.setVisible(true);
            }
        });
    } // fin de main ................

    /**
     * *********************************************************************
     * /* Componentes visuales (Controles)de JFrame. NO se puede modificar.
     * /*********************************************************************
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JCheckBox jCheckBoxFuncionario;
    private javax.swing.JCheckBox jCheckBoxNomina;
    private javax.swing.JCheckBox jCheckBoxPension;
    private javax.swing.JCheckBox jCheckBoxSeguroVida;
    private javax.swing.JCheckBox jCheckBoxTarjeta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldAnyos;
    private javax.swing.JTextField jTextFieldApe1;
    private javax.swing.JTextField jTextFieldCCC;
    private javax.swing.JTextField jTextFieldCuotaMensual;
    private javax.swing.JTextField jTextFieldDiferencial;
    private javax.swing.JTextField jTextFieldDiferencialReal;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldEuribor;
    private javax.swing.JTextField jTextFieldImportePrestamo;
    private javax.swing.JTextField jTextFieldIngresosMes;
    private javax.swing.JTextField jTextFieldInteresAnual;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
