/*
 * VentanaPrincipal.java
 */
package net.ausiasmarch.habitacion.gui;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.ausiasmarch.habitacion.modelo.*;

/**
 *
 * @author Luis
 */
public class VentanaPrincipal extends javax.swing.JFrame implements Runnable {

    private Thread hiloPrueba = null;
    private boolean probar = false;
    private Lampara lampara;
    private final Lampara lamparaMesa;
    private final Lampara lamparaComedor1;
    private final Lampara lamparaComedor2;
    private final Lampara lamparaSofa;
    private final Lampara lamparaMueble;
    private final Lampara lamparaEntrada;
    private final AireAcondicionado aireAcondicionado;
    private final BluRay bluray;
    private final CadenaMusica cadenaMusica;
    private final Persiana persiana;
    private final Radiador radiador;
    private final Televisor televisor;
    

    // Declaramos las variables para los aparatos
    public VentanaPrincipal() {
        initComponents();

        // Creamos los aparatos
        lamparaEntrada = new Lampara(0);
        lamparaMesa = new Lampara(1);
        lamparaMueble = new Lampara(2);
        lamparaComedor1 = new Lampara(5);
        lamparaComedor2 = new Lampara(6);
        lamparaSofa = new Lampara(7);
        persiana = new Persiana(8);
        aireAcondicionado = new AireAcondicionado(12);
        bluray = new BluRay(19);
        cadenaMusica = new CadenaMusica(17);
        radiador = new Radiador(13);
        televisor = new Televisor(15);
    
        // Asignamos la habitocion a cada aparato
        
        lamparaEntrada.setHabitacion(habitacion);
        lamparaMesa.setHabitacion(habitacion);
        lamparaMueble.setHabitacion(habitacion);
        lamparaComedor1.setHabitacion(habitacion);
        lamparaComedor2.setHabitacion(habitacion);
        lamparaSofa.setHabitacion(habitacion);
        persiana.setHabitacion(habitacion);
        aireAcondicionado.setHabitacion(habitacion);
        bluray.setHabitacion(habitacion);
        cadenaMusica.setHabitacion(habitacion);
        radiador.setHabitacion(habitacion);
        televisor.setHabitacion(habitacion);
        
        persiana.bajar();
        
        jButtonParar.setEnabled(false); // Desactiva boton apagar   

        setSize(1025, 758);             // Tama�o de la ventana
        setVisible(true);               // Ventana visible
        setLocationRelativeTo(null);    // Ventana centrada en pantalla
        }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneHabitacion = new javax.swing.JTabbedPane();
        jPanelVistaGeneral = new javax.swing.JPanel();
        jButtonProbarAparatos = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonParar = new javax.swing.JButton();
        habitacion = new net.ausiasmarch.habitacion.modelo.Habitacion();
        jPanelControl = new javax.swing.JPanel();
        jToggelLucesMesa = new javax.swing.JToggleButton();
        jToggelLucesMueble = new javax.swing.JToggleButton();
        jToggelLucesComedor1 = new javax.swing.JToggleButton();
        jToggelLucesComedor2 = new javax.swing.JToggleButton();
        jToggelLucesSofa = new javax.swing.JToggleButton();
        jToggelLucesEntrada = new javax.swing.JToggleButton();
        jToggelRadiador = new javax.swing.JToggleButton();
        jToggelAireAcondicionado = new javax.swing.JToggleButton();
        jToggelMiniCadena = new javax.swing.JToggleButton();
        jToggelBluRay = new javax.swing.JToggleButton();
        jToggelTelevisor = new javax.swing.JToggleButton();
        jToggelPersianaSubir = new javax.swing.JToggleButton();
        jToggelPersianaBajar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Habitaci�n Inteligente");
        setMinimumSize(new java.awt.Dimension(1020, 668));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelVistaGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonProbarAparatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonProbarAparatos.setText("Probar Aparatos");
        jButtonProbarAparatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProbarAparatosActionPerformed(evt);
            }
        });
        jPanelVistaGeneral.add(jButtonProbarAparatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 150, 30));

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelVistaGeneral.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 100, -1));

        jButtonParar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonParar.setText("Parar prueba");
        jButtonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPararActionPerformed(evt);
            }
        });
        jPanelVistaGeneral.add(jButtonParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 150, 30));
        jPanelVistaGeneral.add(habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 640));

        jTabbedPaneHabitacion.addTab("Vista general Sal�n Comedor", jPanelVistaGeneral);

        getContentPane().add(jTabbedPaneHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 670));

        jPanelControl.setBackground(new java.awt.Color(51, 51, 51));
        jPanelControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggelLucesMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaMesaOFF.png"))); // NOI18N
        jToggelLucesMesa.setToolTipText("Luces de la Mesa");
        jToggelLucesMesa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelLucesMesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelLucesMesa.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelLucesMesa.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelLucesMesa.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelLucesMesa.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaMesaON.png"))); // NOI18N
        jToggelLucesMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelLucesMesaActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelLucesMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jToggelLucesMueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaMuebleOFF.png"))); // NOI18N
        jToggelLucesMueble.setToolTipText("Luces del Mueble");
        jToggelLucesMueble.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelLucesMueble.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelLucesMueble.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelLucesMueble.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelLucesMueble.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelLucesMueble.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaMuebleON.png"))); // NOI18N
        jToggelLucesMueble.setVerifyInputWhenFocusTarget(false);
        jToggelLucesMueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelLucesMuebleActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelLucesMueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 5, -1, 50));

        jToggelLucesComedor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelLucesComedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaAVOFF.png"))); // NOI18N
        jToggelLucesComedor1.setText("1");
        jToggelLucesComedor1.setToolTipText("Luces Comedor 1");
        jToggelLucesComedor1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelLucesComedor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelLucesComedor1.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelLucesComedor1.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelLucesComedor1.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelLucesComedor1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaAVON.png"))); // NOI18N
        jToggelLucesComedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelLucesComedor1ActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelLucesComedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 5, -1, 50));

        jToggelLucesComedor2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelLucesComedor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaAVOFF.png"))); // NOI18N
        jToggelLucesComedor2.setText("2");
        jToggelLucesComedor2.setToolTipText("Luces Comedor 2");
        jToggelLucesComedor2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelLucesComedor2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelLucesComedor2.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelLucesComedor2.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelLucesComedor2.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelLucesComedor2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaAVON.png"))); // NOI18N
        jToggelLucesComedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelLucesComedor2ActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelLucesComedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 5, -1, 50));

        jToggelLucesSofa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaSofaOFF.png"))); // NOI18N
        jToggelLucesSofa.setToolTipText("Luces Sofa");
        jToggelLucesSofa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelLucesSofa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelLucesSofa.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelLucesSofa.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelLucesSofa.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelLucesSofa.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaSofaON.png"))); // NOI18N
        jToggelLucesSofa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelLucesSofaActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelLucesSofa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 5, -1, 50));

        jToggelLucesEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelLucesEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaAVOFF.png"))); // NOI18N
        jToggelLucesEntrada.setText("E");
        jToggelLucesEntrada.setToolTipText("Luces Entrada");
        jToggelLucesEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelLucesEntrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelLucesEntrada.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelLucesEntrada.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelLucesEntrada.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelLucesEntrada.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_LamparaAVON.png"))); // NOI18N
        jToggelLucesEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelLucesEntradaActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelLucesEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 5, -1, 50));

        jToggelRadiador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelRadiador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_RadiadorOFF.png"))); // NOI18N
        jToggelRadiador.setToolTipText("Radiador");
        jToggelRadiador.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelRadiador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelRadiador.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelRadiador.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelRadiador.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelRadiador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_RadiadorON.png"))); // NOI18N
        jToggelRadiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelRadiadorActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelRadiador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 5, -1, 50));

        jToggelAireAcondicionado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelAireAcondicionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_AireAcondicionadoOFF.png"))); // NOI18N
        jToggelAireAcondicionado.setToolTipText("Airea Acondicionado");
        jToggelAireAcondicionado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelAireAcondicionado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelAireAcondicionado.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelAireAcondicionado.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelAireAcondicionado.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelAireAcondicionado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_AireAcondicionadoON.png"))); // NOI18N
        jToggelAireAcondicionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelAireAcondicionadoActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelAireAcondicionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 5, -1, 50));

        jToggelMiniCadena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelMiniCadena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_MCadenaOFF.png"))); // NOI18N
        jToggelMiniCadena.setToolTipText("MiniCadena de M�sica");
        jToggelMiniCadena.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelMiniCadena.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelMiniCadena.setIconTextGap(5);
        jToggelMiniCadena.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelMiniCadena.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelMiniCadena.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelMiniCadena.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_MCadenaON.png"))); // NOI18N
        jToggelMiniCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelMiniCadenaActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelMiniCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 5, -1, 50));

        jToggelBluRay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelBluRay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_BluRayOFF.png"))); // NOI18N
        jToggelBluRay.setToolTipText("BluRay V�deo");
        jToggelBluRay.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelBluRay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelBluRay.setIconTextGap(5);
        jToggelBluRay.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelBluRay.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelBluRay.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelBluRay.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_BluRayON.png"))); // NOI18N
        jToggelBluRay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelBluRayActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelBluRay, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 5, -1, 50));

        jToggelTelevisor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelTelevisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_TVOFF.png"))); // NOI18N
        jToggelTelevisor.setToolTipText("Televisor");
        jToggelTelevisor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelTelevisor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelTelevisor.setIconTextGap(5);
        jToggelTelevisor.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelTelevisor.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelTelevisor.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelTelevisor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_TVON.png"))); // NOI18N
        jToggelTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelTelevisorActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelTelevisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 5, -1, 50));

        jToggelPersianaSubir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelPersianaSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_PersianaOFF.png"))); // NOI18N
        jToggelPersianaSubir.setText("S");
        jToggelPersianaSubir.setToolTipText("Subir Persiana");
        jToggelPersianaSubir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelPersianaSubir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelPersianaSubir.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelPersianaSubir.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelPersianaSubir.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelPersianaSubir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_PersianaON.png"))); // NOI18N
        jToggelPersianaSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelPersianaSubirActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelPersianaSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 5, -1, 50));

        jToggelPersianaBajar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggelPersianaBajar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_PersianaOFF.png"))); // NOI18N
        jToggelPersianaBajar.setText("B");
        jToggelPersianaBajar.setToolTipText("Bajar Persiana");
        jToggelPersianaBajar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToggelPersianaBajar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggelPersianaBajar.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggelPersianaBajar.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggelPersianaBajar.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggelPersianaBajar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/habitacion/recursos/btn_PersianaON.png"))); // NOI18N
        jToggelPersianaBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggelPersianaBajarActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggelPersianaBajar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 5, -1, 50));

        getContentPane().add(jPanelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1020, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggelLucesMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelLucesMesaActionPerformed
        if ( lamparaMesa.isEncendida() ) {
            lamparaMesa.apagar(); }
            else {
            lamparaMesa.encender();
        }
    }//GEN-LAST:event_jToggelLucesMesaActionPerformed

    private void jButtonProbarAparatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProbarAparatosActionPerformed
        if (hiloPrueba == null) {
            hiloPrueba = new Thread(this);
            hiloPrueba.start();
            probar = true;
            jButtonProbarAparatos.setEnabled(false);
            jButtonParar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonProbarAparatosActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        salir();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jToggelMiniCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelMiniCadenaActionPerformed
        if ( cadenaMusica.isPlay() ) {
            cadenaMusica.stop(); }
            else {
            if (bluray.isPlay()){
                bluray.stop();
            }
            cadenaMusica.play("Yesterday.mp3");
            }
    }//GEN-LAST:event_jToggelMiniCadenaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        salir();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPararActionPerformed
        botonesOnOff(true);
        apagarAudioVideo();
        jButtonProbarAparatos.setEnabled(true);
        hiloPrueba = null;
        probar = false;
        jButtonParar.setEnabled(false);

    }//GEN-LAST:event_jButtonPararActionPerformed

    private void jToggelTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelTelevisorActionPerformed
        if ( televisor.isEncendido()) {
            televisor.apagar();
            }
            else {
            if(bluray.isPlay()){
            televisor.setImagenVideo("Titanic.png");
            }
           
            televisor.encender();
        }
    }//GEN-LAST:event_jToggelTelevisorActionPerformed

    private void jToggelLucesMuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelLucesMuebleActionPerformed
        if ( lamparaMueble.isEncendida() ) {
            lamparaMueble.apagar();
            }
            else {
            lamparaMueble.encender();
        }
    }//GEN-LAST:event_jToggelLucesMuebleActionPerformed

    private void jToggelLucesComedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelLucesComedor1ActionPerformed
        if ( lamparaComedor1.isEncendida() ) {
            lamparaComedor1.apagar();
            }
            else {
            lamparaComedor1.encender();
        } 
    }//GEN-LAST:event_jToggelLucesComedor1ActionPerformed

    private void jToggelLucesComedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelLucesComedor2ActionPerformed
        if ( lamparaComedor2.isEncendida() ) {
            lamparaComedor2.apagar();
            }
            else {
            lamparaComedor2.encender();
        } 
    }//GEN-LAST:event_jToggelLucesComedor2ActionPerformed

    private void jToggelLucesSofaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelLucesSofaActionPerformed
        if ( lamparaSofa.isEncendida() ) {
            lamparaSofa.apagar();
            }
            else {
            lamparaSofa.encender();
        }
    }//GEN-LAST:event_jToggelLucesSofaActionPerformed

    private void jToggelLucesEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelLucesEntradaActionPerformed
        if ( lamparaEntrada.isEncendida() ) {
            lamparaEntrada.apagar();
            }
            else {
            lamparaEntrada.encender();
        }
    }//GEN-LAST:event_jToggelLucesEntradaActionPerformed

    private void jToggelPersianaSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelPersianaSubirActionPerformed
            persiana.subir();
            jToggelPersianaBajar.setSelected(false);
                 
    }//GEN-LAST:event_jToggelPersianaSubirActionPerformed

    private void jToggelPersianaBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelPersianaBajarActionPerformed
        persiana.bajar();
        jToggelPersianaSubir.setSelected(false);
    }//GEN-LAST:event_jToggelPersianaBajarActionPerformed

    private void jToggelAireAcondicionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelAireAcondicionadoActionPerformed
        if ( aireAcondicionado.isEncendido() ) {
            aireAcondicionado.apagar();
            }
            else {
            aireAcondicionado.enfriar();
        }
    }//GEN-LAST:event_jToggelAireAcondicionadoActionPerformed

    private void jToggelRadiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelRadiadorActionPerformed
        if ( radiador.isEncendido() ) {
            radiador.apagar();
            }
            else {
            radiador.calentar();
        }
    }//GEN-LAST:event_jToggelRadiadorActionPerformed

    private void jToggelBluRayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggelBluRayActionPerformed
        if ( bluray.isPlay() ) {
            bluray.stop(); }
            else {
            if (cadenaMusica.isPlay()){
                cadenaMusica.stop();
            }
            bluray.play("My heart will go on.mp3", "Titanic.png", televisor);
        }
    }//GEN-LAST:event_jToggelBluRayActionPerformed

    private void salir() {
        apagarAudioVideo();
        dispose();
    }

    private void apagaAparatos() {
        
        
    }

    private void apagarAudioVideo() {
       if (cadenaMusica.isPlay()) {
        cadenaMusica.stop();
        }
        if (bluray.isPlay()) {
        bluray.stop();
        }
    }

    // Prueba los aparatos .............................................
    private void pruebaAparatos() {
        botonesOnOff(false);
        apagarAudioVideo();
        
        for (int i =0; i <= 7; i = i + 2){
            lampara = new Lampara(i);
            lampara.setHabitacion(habitacion);
            lampara.encender();
            pausa(500);
        }
        
        pausa(2500);
        
        int i = 1;
        while(i<=7){
           lampara = new Lampara(i);
           lampara.setHabitacion(habitacion);
           lampara.encender();
           pausa(500);
           i +=2;
        }
        
        pausa(5000);
        
        for (int j=7; j>=0; j--){
            lampara = new Lampara(j);
            lampara.setHabitacion(habitacion);
            lampara.apagar();
            pausa(500);
        }
        
        pausa(10000);
        
        for (int k=0; k<=7; k++){
            if(probar==false){
                break;
            }
            else{
                lampara = new Lampara(k);
                lampara.setHabitacion(habitacion);
                lampara.encender();
                pausa(500);
                
                switch(k){         
                    case 2:
                        lampara.apagar();                     
                        pausa(250);
                        lampara.encender();
                        persiana.bajar();
                        pausa(1000);
                        radiador.calentar();
                        pausa(1000);
                        cadenaMusica.play("Imagine.mp3");
                        pausa(10000);
                        cadenaMusica.stop();
                        break;
                    case 7:
                        bluray.play("My heart will go on.mp3", "Titanic.png", televisor);
                        pausa(10000);
                        bluray.stop();
                        break;
                    case 3:
                        lampara.apagar();                                               
                        pausa(250);
                        lampara.encender();
                        break;
                    case 4:
                        lampara.apagar();                       
                        pausa(250);
                        lampara.encender();
                        break;                       
                }
                
                lampara.apagar();
                pausa(500);
            }
        }
        
        botonesOnOff(true);
    }

    private void botonesOnOff(boolean sn) {
        jToggelLucesEntrada.setEnabled(sn);
        jToggelLucesMesa.setEnabled(sn);
        jToggelLucesMueble.setEnabled(sn);
        jToggelLucesComedor1.setEnabled(sn);
        jToggelLucesComedor2.setEnabled(sn);
        jToggelLucesSofa.setEnabled(sn);
        jToggelMiniCadena.setEnabled(sn);
        jToggelBluRay.setEnabled(sn);
        jToggelPersianaSubir.setEnabled(sn);
        jToggelPersianaBajar.setEnabled(sn);
        jToggelTelevisor.setEnabled(sn);
        jToggelRadiador.setEnabled(sn);
        jToggelAireAcondicionado.setEnabled(sn);
    }

    @Override
    public void run() {
        pruebaAparatos();
    }

    // Hacer una pausa
    private void pausa(int sleep) {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException e) {
            //No hacemos nada, que se quede como est�
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaPrincipal vp = new VentanaPrincipal();

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private net.ausiasmarch.habitacion.modelo.Habitacion habitacion;
    private javax.swing.JButton jButtonParar;
    private javax.swing.JButton jButtonProbarAparatos;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanelControl;
    private javax.swing.JPanel jPanelVistaGeneral;
    private javax.swing.JTabbedPane jTabbedPaneHabitacion;
    private javax.swing.JToggleButton jToggelAireAcondicionado;
    private javax.swing.JToggleButton jToggelBluRay;
    private javax.swing.JToggleButton jToggelLucesComedor1;
    private javax.swing.JToggleButton jToggelLucesComedor2;
    private javax.swing.JToggleButton jToggelLucesEntrada;
    private javax.swing.JToggleButton jToggelLucesMesa;
    private javax.swing.JToggleButton jToggelLucesMueble;
    private javax.swing.JToggleButton jToggelLucesSofa;
    private javax.swing.JToggleButton jToggelMiniCadena;
    private javax.swing.JToggleButton jToggelPersianaBajar;
    private javax.swing.JToggleButton jToggelPersianaSubir;
    private javax.swing.JToggleButton jToggelRadiador;
    private javax.swing.JToggleButton jToggelTelevisor;
    // End of variables declaration//GEN-END:variables
}