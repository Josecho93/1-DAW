package Dibujos;

import java.awt.*;
import java.awt.geom.*;

/**
 * Dibuja un cuadrado
 *
 * @author Administrador
 */
public class Cuadrado extends Figura {

    protected double lado;

    /**
     * Crea un nuevo cuadrado
     *
     * @param x Posición X de la esquina superior izquierda del cuadrado
     * @param y Posición Y de la esquina superior izquierda del cuadrado
     * @param lado Ancho y alto del cuadrado
     */
    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    /**
     * Obtiene el tamaño del lado del cuadrado
     *
     * @return Tamaño del lado del cuadrado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Establece el tamaño del lado del cuadrado
     *
     * @param lado Tamaño del lado del cuadrado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        Rectangle2D cuadrado = new Rectangle2D.Double(x, y, lado, lado);
        dibujar(g2d,cuadrado);
    }
    

}
