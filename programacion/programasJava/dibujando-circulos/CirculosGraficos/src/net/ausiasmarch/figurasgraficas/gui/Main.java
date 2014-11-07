package net.ausiasmarch.figurasgraficas.gui;

import net.ausiasmarch.figurasgraficas.modelo.*;
import net.ausiasmarch.common.Convert;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * Main.java
 * @author Luis
 */
public class Main extends javax.swing.JFrame {

    private int rojoRelleno = 0, verdeRelleno = 0, azulRelleno = 0;     // color negro por defecto
    private int rojoContorno = 0, verdeContorno = 0, azulContorno = 0;  // color negro por defecto
    private Circulo circulo;
    
    public Main() {
        initComponents();

        jPanelColorRelleno.setBackground(new Color(rojoRelleno, verdeRelleno, azulRelleno));
        jPanelColorContorno.setBackground(new Color(rojoContorno, verdeContorno, azulContorno));
        
        setSize(980, 680);
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

        jPanelCirculo = new javax.swing.JPanel();
        jTextFieldRadio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldArea = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCoordX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCoordY = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCircunferencia = new javax.swing.JTextField();
        jToggleButtonGrid = new javax.swing.JToggleButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanelSelectorColor = new javax.swing.JPanel();
        jSliderRojoRelleno = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSliderVerdeRelleno = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jSliderAzulRelleno = new javax.swing.JSlider();
        jPanelColorRelleno = new javax.swing.JPanel();
        jButtonColorRelleno = new javax.swing.JButton();
        jCheckBoxRelleno = new javax.swing.JCheckBox();
        jPanelSelectorColorContorno = new javax.swing.JPanel();
        jSliderRojoContorno = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSliderVerdeContorno = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        jSliderAzulContorno = new javax.swing.JSlider();
        jPanelColorContorno = new javax.swing.JPanel();
        jButtonColorContorno = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldGrosor = new javax.swing.JTextField();
        panelDibujo = new net.ausiasmarch.figurasgraficas.modelo.PanelDibujo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dibujo de círculos");
        setMinimumSize(new java.awt.Dimension(390, 280));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCirculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Radio:");

        jLabel1.setText("Area:");

        jTextFieldArea.setEditable(false);
        jTextFieldArea.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel7.setText("X:");

        jLabel6.setText("Y:");

        jLabel2.setText("Circunferencia:");

        jTextFieldCircunferencia.setEditable(false);
        jTextFieldCircunferencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jToggleButtonGrid.setText("Mostrar Regilla");
        jToggleButtonGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGridActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar todo");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jPanelSelectorColor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Color  de relleno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanelSelectorColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSliderRojoRelleno.setMajorTickSpacing(255);
        jSliderRojoRelleno.setMaximum(255);
        jSliderRojoRelleno.setValue(0);
        jSliderRojoRelleno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderRojoRellenoStateChanged(evt);
            }
        });
        jPanelSelectorColor.add(jSliderRojoRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, -1));

        jLabel3.setText("Rojo");
        jPanelSelectorColor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, -1));

        jLabel4.setText("Verde");
        jPanelSelectorColor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jSliderVerdeRelleno.setMajorTickSpacing(255);
        jSliderVerdeRelleno.setMaximum(255);
        jSliderVerdeRelleno.setValue(0);
        jSliderVerdeRelleno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderVerdeRellenoStateChanged(evt);
            }
        });
        jPanelSelectorColor.add(jSliderVerdeRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel8.setText("Azul");
        jPanelSelectorColor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jSliderAzulRelleno.setMajorTickSpacing(255);
        jSliderAzulRelleno.setMaximum(255);
        jSliderAzulRelleno.setValue(0);
        jSliderAzulRelleno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAzulRellenoStateChanged(evt);
            }
        });
        jPanelSelectorColor.add(jSliderAzulRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jPanelColorRelleno.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout jPanelColorRellenoLayout = new javax.swing.GroupLayout(jPanelColorRelleno);
        jPanelColorRelleno.setLayout(jPanelColorRellenoLayout);
        jPanelColorRellenoLayout.setHorizontalGroup(
            jPanelColorRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        jPanelColorRellenoLayout.setVerticalGroup(
            jPanelColorRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelSelectorColor.add(jPanelColorRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 70, 70));

        jButtonColorRelleno.setText("Aleatorio");
        jButtonColorRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorRellenoActionPerformed(evt);
            }
        });
        jPanelSelectorColor.add(jButtonColorRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 100, -1));

        jCheckBoxRelleno.setText("Relleno");

        jPanelSelectorColorContorno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Color  del contorno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanelSelectorColorContorno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSliderRojoContorno.setMajorTickSpacing(255);
        jSliderRojoContorno.setMaximum(255);
        jSliderRojoContorno.setValue(0);
        jSliderRojoContorno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderRojoContornoStateChanged(evt);
            }
        });
        jPanelSelectorColorContorno.add(jSliderRojoContorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, -1));

        jLabel9.setText("Rojo");
        jPanelSelectorColorContorno.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, -1));

        jLabel10.setText("Verde");
        jPanelSelectorColorContorno.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jSliderVerdeContorno.setMajorTickSpacing(255);
        jSliderVerdeContorno.setMaximum(255);
        jSliderVerdeContorno.setValue(0);
        jSliderVerdeContorno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderVerdeContornoStateChanged(evt);
            }
        });
        jPanelSelectorColorContorno.add(jSliderVerdeContorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel11.setText("Azul");
        jPanelSelectorColorContorno.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jSliderAzulContorno.setMajorTickSpacing(255);
        jSliderAzulContorno.setMaximum(255);
        jSliderAzulContorno.setValue(0);
        jSliderAzulContorno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAzulContornoStateChanged(evt);
            }
        });
        jPanelSelectorColorContorno.add(jSliderAzulContorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jPanelColorContorno.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout jPanelColorContornoLayout = new javax.swing.GroupLayout(jPanelColorContorno);
        jPanelColorContorno.setLayout(jPanelColorContornoLayout);
        jPanelColorContornoLayout.setHorizontalGroup(
            jPanelColorContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        jPanelColorContornoLayout.setVerticalGroup(
            jPanelColorContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelSelectorColorContorno.add(jPanelColorContorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 70, 70));

        jButtonColorContorno.setText("Aleatorio");
        jButtonColorContorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorContornoActionPerformed(evt);
            }
        });
        jPanelSelectorColorContorno.add(jButtonColorContorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 100, -1));

        jLabel12.setText("Grosor línea contorno");

        javax.swing.GroupLayout jPanelCirculoLayout = new javax.swing.GroupLayout(jPanelCirculo);
        jPanelCirculo.setLayout(jPanelCirculoLayout);
        jPanelCirculoLayout.setHorizontalGroup(
            jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCirculoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxRelleno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCirculoLayout.createSequentialGroup()
                        .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)
                                .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCirculoLayout.createSequentialGroup()
                        .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRadio))
                            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(jTextFieldCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addGap(13, 13, 13)
                                .addComponent(jTextFieldCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCirculoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonGrid))
                    .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelSelectorColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelCirculoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanelSelectorColorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelCirculoLayout.setVerticalGroup(
            jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCirculoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCirculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBoxRelleno)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextFieldGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCirculoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanelSelectorColorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelSelectorColor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jToggleButtonGrid))
                        .addContainerGap())
                    .addGroup(jPanelCirculoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButtonCalcular)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanelCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 400, 621));

        javax.swing.GroupLayout panelDibujoLayout = new javax.swing.GroupLayout(panelDibujo);
        panelDibujo.setLayout(panelDibujoLayout);
        panelDibujoLayout.setHorizontalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        panelDibujoLayout.setVerticalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(panelDibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 540, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        //Declaramos variables
        double radio, area, circunferencia;
        int x, y, grosor;
        
        
        //Limpiamos salida de datos
        jTextFieldCircunferencia.setText("");
        jTextFieldArea.setText("");
        
        //Validamos coordenadas x, y, grosor
        if(!Convert.isValidInt(jTextFieldRadio.getText())){
            mensaje("El radio debe ser un numero entero");
            return;
        }
        if(!Convert.isValidInt(jTextFieldGrosor.getText())){
            mensaje("El grosor debe ser un numero entero");
            return;
        }
        if(!Convert.isValidInt(jTextFieldCoordX.getText())){
            mensaje("La cordenada X debe ser un numero entero");
            return;
        }
        if(!Convert.isValidInt(jTextFieldCoordY.getText())){
            mensaje("La cordenada Y debe ser un numero entero");
            return;
        }
        //Validamos el radio
        if(!Convert.isValidDouble(jTextFieldRadio.getText())){
            mensaje("El radio debe ser un numero");
            return;
        }
        
        //Convertimos las variables anteriores
        x = Convert.parseInt(jTextFieldCoordX.getText());
        y = Convert.parseInt(jTextFieldCoordY.getText());
        grosor = Convert.parseInt(jTextFieldGrosor.getText());
        radio = Convert.parseDouble(jTextFieldRadio.getText());
        
        //Creamos un objeto circulo con el primer constructor
        circulo = new Circulo(radio, x, y);
        
        //Llamamos al metodo setGrosor para indicar el valor
        circulo.setGrosor(grosor);
        
        //Validamos el circulo
        if(circulo.validate() != 0){
            mensaje(circulo.getMensaje());
        }
        
        //Asignamos el valor de las variables area y circunferencia
        area = circulo.area();
        circunferencia = circulo.circunferencia();
        
        //Mostramos el valor de area y circunferencia con el formato adecuado
        jTextFieldArea.setText(Convert.format(area, 2));
        jTextFieldCircunferencia.setText(Convert.format(area, 2));
        
        //Comprobamos que el circulo no se sale del area de dibujo
        if(!panelDibujo.contiene(x, y, radio, radio)){
            mensaje("Círculo fuera del área de dibujo");
            return;
        }
        
        //Poner color de relleno al circulo
        circulo.setColorRelleno(rojoRelleno, verdeRelleno, azulRelleno);
        
        //Poner color al controno del circulo
        circulo.setColorContorno(rojoContorno, verdeContorno, azulContorno);
        
        //Llamar al metodo setRelleno dependiendo del checkbox
        circulo.setRelleno(jCheckBoxRelleno.isSelected());
        
        //Dibujamos el circulo
        panelDibujo.dibuja(circulo);       
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    // Muestra u oculta la rejilla
    private void jToggleButtonGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGridActionPerformed
        boolean pulsado = jToggleButtonGrid.isSelected();
        panelDibujo.setShowGrid(pulsado);

        if (pulsado) {
            jToggleButtonGrid.setText("Oculta rejilla");
        } else {
            jToggleButtonGrid.setText("Muestra rejilla");
        }

    }//GEN-LAST:event_jToggleButtonGridActionPerformed

    // Limpia el panel de dibujo y los campos de entrada y salida
    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextFieldCoordX.setText("");
        jTextFieldCoordY.setText("");
        jTextFieldRadio.setText("");
        jTextFieldArea.setText("");
        jTextFieldCircunferencia.setText("");
        panelDibujo.limpia();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    // Cambia el color rojo
    private void jSliderRojoRellenoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderRojoRellenoStateChanged
        rojoRelleno = jSliderRojoRelleno.getValue();
        jPanelColorRelleno.setBackground(new Color(rojoRelleno, verdeRelleno, azulRelleno));
    }//GEN-LAST:event_jSliderRojoRellenoStateChanged

    // Cambia el color verde
    private void jSliderVerdeRellenoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderVerdeRellenoStateChanged
        verdeRelleno = jSliderVerdeRelleno.getValue();
        jPanelColorRelleno.setBackground(new Color(rojoRelleno, verdeRelleno, azulRelleno));
    }//GEN-LAST:event_jSliderVerdeRellenoStateChanged

    // Cambia el color azul
    private void jSliderAzulRellenoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAzulRellenoStateChanged
        azulRelleno = jSliderAzulRelleno.getValue();
        jPanelColorRelleno.setBackground(new Color(rojoRelleno, verdeRelleno, azulRelleno));
    }//GEN-LAST:event_jSliderAzulRellenoStateChanged

    // Genera un color aleatorio
    private void jButtonColorRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorRellenoActionPerformed
        Color color = Aleatorio.nextColor();
        
        rojoRelleno = color.getRed();
        verdeRelleno = color.getGreen();
        azulRelleno = color.getBlue();
        jSliderRojoRelleno.setValue(rojoRelleno);
        jSliderVerdeRelleno.setValue(verdeRelleno);
        jSliderAzulRelleno.setValue(azulRelleno);
        
    }//GEN-LAST:event_jButtonColorRellenoActionPerformed

    private void jSliderRojoContornoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderRojoContornoStateChanged
        rojoContorno = jSliderRojoContorno.getValue();
        jPanelColorContorno.setBackground(new Color(rojoContorno, verdeContorno, azulContorno));
    }//GEN-LAST:event_jSliderRojoContornoStateChanged

    private void jSliderVerdeContornoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderVerdeContornoStateChanged
        verdeContorno = jSliderVerdeContorno.getValue();
        jPanelColorContorno.setBackground(new Color(rojoContorno, verdeContorno, azulContorno));
    }//GEN-LAST:event_jSliderVerdeContornoStateChanged

    private void jSliderAzulContornoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAzulContornoStateChanged
        azulContorno = jSliderAzulContorno.getValue();
        jPanelColorContorno.setBackground(new Color(rojoContorno, verdeContorno, azulContorno));
    }//GEN-LAST:event_jSliderAzulContornoStateChanged

    private void jButtonColorContornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorContornoActionPerformed
        Color color = Aleatorio.nextColor();
        
        rojoContorno = color.getRed();
        verdeContorno = color.getGreen();
        azulContorno = color.getBlue();
        jSliderRojoContorno.setValue(rojoContorno);
        jSliderVerdeContorno.setValue(verdeContorno);
        jSliderAzulContorno.setValue(azulContorno);
   
    }//GEN-LAST:event_jButtonColorContornoActionPerformed

    private void mensaje(String mensaje){
       JOptionPane.showMessageDialog(this,mensaje); 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            String look = UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(look);

        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonColorContorno;
    private javax.swing.JButton jButtonColorRelleno;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JCheckBox jCheckBoxRelleno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCirculo;
    private javax.swing.JPanel jPanelColorContorno;
    private javax.swing.JPanel jPanelColorRelleno;
    private javax.swing.JPanel jPanelSelectorColor;
    private javax.swing.JPanel jPanelSelectorColorContorno;
    private javax.swing.JSlider jSliderAzulContorno;
    private javax.swing.JSlider jSliderAzulRelleno;
    private javax.swing.JSlider jSliderRojoContorno;
    private javax.swing.JSlider jSliderRojoRelleno;
    private javax.swing.JSlider jSliderVerdeContorno;
    private javax.swing.JSlider jSliderVerdeRelleno;
    private javax.swing.JTextField jTextFieldArea;
    private javax.swing.JTextField jTextFieldCircunferencia;
    private javax.swing.JTextField jTextFieldCoordX;
    private javax.swing.JTextField jTextFieldCoordY;
    private javax.swing.JTextField jTextFieldGrosor;
    private javax.swing.JTextField jTextFieldRadio;
    private javax.swing.JToggleButton jToggleButtonGrid;
    private net.ausiasmarch.figurasgraficas.modelo.PanelDibujo panelDibujo;
    // End of variables declaration//GEN-END:variables
}
