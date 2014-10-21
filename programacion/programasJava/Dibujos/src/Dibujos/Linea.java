package Dibujos;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Dibuja una linea
 *
 * @author Administrador
 */
public class Linea extends Figura {

    private double xFin;
    private double yFin;

    /**
     * Dibuja una linea
     *
     * @param xInicio Coordenada X de inicio de la linea
     * @param yInicio Coordenada Y de inicio de la linea
     * @param xFin Coordenada X de fin de la linea
     * @param yFin Coordenada Y de fin de la linea
     */
    public Linea(double xInicio, double yInicio, double xFin, double yFin) {
        super(xInicio, yInicio);
        this.xFin = xFin;
        this.yFin = yFin;
    }

    /**
     * Obtiene la coordenada X donde acaba la linea
     *
     * @return Coordenada X donde acaba la linea
     */
    public double getXFin() {
        return xFin;
    }

    /**
     * Establece la coordenada X donde acaba la linea
     *
     * @param xFin Coordenada X donde acaba la linea
     */
    public void setXFin(double xFin) {
        this.xFin = xFin;
    }

    /**
     * Obtiene la coordenada Y donde acaba la linea
     *
     * @return Coordenada Y donde acaba la linea
     */
    public double getYFin() {
        return yFin;
    }

    /**
     * Establece la coordenada Y donde acaba la linea
     *
     * @param yFin Coordenada Y donde acaba la linea
     */
    public void setYFin(double yFin) {
        this.yFin = yFin;
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        Line2D linea = new Line2D.Double(getX(), getY(), xFin, yFin);
        dibujar(g2d,linea);
    }
}
