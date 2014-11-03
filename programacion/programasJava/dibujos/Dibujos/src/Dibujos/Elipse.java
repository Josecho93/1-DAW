package Dibujos;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Dibuja un círculo
 *
 * @author Administrador
 */
public class Elipse extends Figura{
    private double radioMenor;
    private double radioMayor;
    /**
     * Crea un nuevo círculo
     *
     * @param x Posición X de la esquina superior izquierda del círculo
     * @param y Posición Y de la esquina superior izquierda del círculo
     * @param radio Radio del círculo
     */
    public Elipse(double x, double y, double radioMenor, double radioMayor) {
        super(x,y);
        this.radioMenor = radioMenor;
        this.radioMayor = radioMayor;
    }

    /**
     * Obtiene el radio mayor del círculo
     *
     * @return Radio del círculo
     */
    public double getRadioMayor() {
        return radioMayor;
    }

    /**
     * Establece el radio mayor del círculo
     *
     * @param radio Radio del círculo
     */
    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    /**
     * Obtiene el radio menor del círculo
     *
     * @return Radio del círculo
     */
    public double getRadioMenor() {
        return radioMenor;
    }

    /**
     * Establece el radio menor del círculo
     *
     * @param radio Radio del círculo
     */
    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        Ellipse2D elipse = new Ellipse2D.Double(x, y,radioMenor,radioMayor);
        dibujar(g2d,elipse);
    }

}
