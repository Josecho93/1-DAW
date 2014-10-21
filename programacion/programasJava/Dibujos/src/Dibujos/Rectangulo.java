package Dibujos;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * Dibuja un ractángulo
 *
 * @author Administrador
 */
public class Rectangulo extends Figura {

    protected double ancho;
    protected double alto;

    /**
     * Crea un nuevo Rectangulo
     *
     * @param x Posición X de la esquina superior izquierda del rectangulo
     * @param y Posición Y de la esquina superior izquierda del rectangulo
     * @param ancho Ancho del rectangulo
     * @param alto Alto del rectangulo
     */
    public Rectangulo(double x, double y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Obtiene el ancho del rectángulo
     *
     * @return Ancho del rectángulo
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Establece el ancho del rectángulo
     *
     * @param ancho Ancho del rectángulo
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * Obtiene el alto del rectángulo
     *
     * @return Alto del rectángulo
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Establece el alto del rectángulo
     *
     * @param alto Alto del rectángulo
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        Rectangle2D rectangle = new Rectangle2D.Double(x, y, ancho, alto);
        dibujar(g2d, rectangle);
    }
}
