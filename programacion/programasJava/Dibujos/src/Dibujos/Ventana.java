package Dibujos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ventana donde dibujar figuras geométricas.
 * @author Administrador
 */
public class Ventana {

    private JFrame jFrame;
    private Panel panel;

    /**
     * Crea una nueva ventana
     * @param ancho Ancho de la ventana
     * @param alto Alto de la ventana
     */
    public Ventana(int ancho, int alto) {
        panel = new Panel();
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(ancho, alto);
        jFrame.setTitle("Dibujos");

    }

    /**
     * Añade una nueva figura a la ventana para dibujarla
     *
     * @param figura Figura a añadir
     */
    public void addFigura(Figura figura) {
        panel.addFigura(figura);
    }

    /**
     * Muestra la ventana
     *
     * @param x Coordenada X de la esquina superior izquierda donde se mostrará
     * la ventana
     * @param y Coordenada Y de la esquina superior izquierda donde se mostrará
     * la ventana
     */
    public void mostrar(int x, int y) {
        jFrame.setLocation(x,y);
        jFrame.add(panel);
        jFrame.setVisible(true);
    }

    /**
     * Obtiene si se mostrará la la rejilla con el eje de coordenadas
     *
     * @return Retorna <code>true</code> si se muestra la rejilla
     * o <code>false</code> si no se muestra la rejilla
     */
    public boolean isShowGrid() {
        return panel.isShowGrid();
    }

    /**
     * Establece si se mostrará la la rejilla con el eje de coordenadas
     *
     * @param showGrid Si vale <code>true</code> se mostrará la rejilla y si
     * vale <code>false</code> no se mostrará
     */
    public void setShowGrid(boolean showGrid) {
        panel.setShowGrid(showGrid);
    }

    public void setRezizable(boolean flag) {
        jFrame.setResizable(flag);
    }

    public void centeredScreen() {
        jFrame.setLocationRelativeTo(null);
    }

    public void mostrar() {
        jFrame.add(panel);
        jFrame.setVisible(true);
    }

    public void setTitle(String title) {
        jFrame.setTitle(title);
    }

    public void maximized() {
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void setColor(Color color) {
        panel.setBackground(color);
    }
   
    
}

class Panel extends JPanel {

    private boolean showGrid = false;
    private java.util.List<Figura> figuras = new ArrayList<>();
    private final int GRID = 50; 

    void addFigura(Figura figura) {
        figuras.add(figura);
    }

    Panel() {
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < figuras.size(); i++) {
            Figura figura = figuras.get(i);
            figura.dibujar(g2d);
        }

        if (showGrid) {
            g2d.setPaint(Color.GRAY);
            float dash1[] = {5.0f};
            BasicStroke dashed = new BasicStroke(1.0f,BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_MITER, 5.0f, dash1, 0.0f);

            g2d.setStroke(dashed);

            for (int x = 0; x <= this.getSize().width; x = x + GRID) {
                Line2D line = new Line2D.Float(x, 0, x, this.getSize().height);
                g2d.draw(line);
            }

            for (int y = 0; y <= this.getSize().height; y = y + GRID) {
                Line2D line = new Line2D.Float(0, y, this.getSize().width, y);
                g2d.draw(line);
            }

            //Dibujar los textos
            for (int x = 0; x <= this.getSize().width; x = x + GRID * 2) {
                for (int y = 0; y <= this.getSize().height; y = y + GRID * 2) {
                    g2d.drawString(x + "," + y, x, y + 10);
                }
            }
        }
    }

    public boolean isShowGrid() {
        return showGrid;
    }

    public void setShowGrid(boolean showGrid) {
        this.showGrid = showGrid;
    }
}
