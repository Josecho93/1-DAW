package Dibujos;

import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;

/**
 * Dibuja un círculo
 *
 * @author Administrador
 */
public class Curva extends Figura{

    private double x1, y1, xc, yc, x2,y2;
    /**
     * Crea un nuevo círculo
     *
     * @param x Posición X de la esquina superior izquierda del círculo
     * @param y Posición Y de la esquina superior izquierda del círculo
     * @param radio Radio del círculo
     */
    public Curva(double x1, double y1, double xc, double yc, double x2, double y2, float grosor) {
        super(x1,y1);
        this.xc = xc;
        this.yc = yc;
        this.x2 = x2;
        this.y2 = y2;
        this.grosorBorde = grosor;      
    }

    /**
     * Obtiene la coordenada X de la esquina superior izquierda del círculo
     *
     * @return La coordenada X de la esquina superior izquierda del círculo
     */
    public double getX1() {
        return x1;
    }

    /**
     * Establece la coordenada X de la esquina superior izquierda del círculo
     *
     * @param x Coordenada X de la esquina superior izquierda del círculo
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * Obtiene la coordenada Y de la esquina superior izquierda del círculo
     *
     * @return La coordenada Y de la esquina superior izquierda del círculo
     */
    public double getY1() {
        return y1;
    }

    /**
     * Establece la coordenada Y de la esquina superior izquierda del círculo
     *
     * @param y Coordenada Y de la esquina superior izquierda del círculo
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        QuadCurve2D curva = new QuadCurve2D.Double(x1, y1, xc, yc, x2, y2);
        dibujar(g2d,curva);

    }


}
