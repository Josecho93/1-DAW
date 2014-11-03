package Dibujos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Dibuja un círculo
 *
 * @author Administrador
 */
public class Circulo extends Figura {

    private double radio;

    /**
     * Crea un nuevo círculo
     *
     * @param x Posición X de la esquina superior izquierda del círculo
     * @param y Posición Y de la esquina superior izquierda del círculo
     * @param radio Radio del círculo
     */
    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    /**
     * Crea un nuevo círculo
     *
     * @param x Posición X de la esquina superior izquierda del círculo
     * @param y Posición Y de la esquina superior izquierda del círculo
     * @param y radio Radio del circulo
     * @param y color Color del círculo
     * @param y borde Circulo con borde
     * @param y relleno Circulo relleno
     *
     * @param radio Radio del círculo
     */
    public Circulo(double x, double y, double radio, Color color, boolean borde, boolean relleno) {
        super(x, y, color, borde, relleno);
        this.radio = radio;
    }

    /**
     * Obtiene el radio del círculo
     *
     * @return Radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio del círculo
     *
     * @param radio Radio del círculo
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        Ellipse2D circulo = new Ellipse2D.Double(x, y, radio, radio);
        
        dibujar(g2d,circulo);    
        
    }
}
