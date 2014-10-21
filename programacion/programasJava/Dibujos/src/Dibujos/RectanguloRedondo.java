package Dibujos;

import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Dibuja un ractángulo
 * @author Administrador
 */
public class RectanguloRedondo extends Rectangulo {
    private double arcoAncho;
    private double arcoAlto;
            
    /**
     * Crea un nuevo Rectangulo con esquinas redondeadas
     * @param x Posición X de la esquina superior izquierda del rectangulo
     * @param y Posición Y de la esquina superior izquierda del rectangulo
     * @param ancho Ancho del rectangulo
     * @param alto Alto del rectangulo
     * @param arcoAncho Ancho del arco del rectangulo
     * @param arcoAlto Alto del arco del rectangulo
     */
    public RectanguloRedondo(double x,double y,double ancho,double alto, double arcoAncho,double arcoAlto) {
        super(x,y,ancho,alto);    
        this.arcoAncho = arcoAncho;
        this.arcoAlto = arcoAlto;   
    }

    public double getArcoAncho() {
        return arcoAncho;
    }

    public void setArcoAncho(double arcoAncho) {
        this.arcoAncho = arcoAncho;
    }

    public double getArcoAlto() {
        return arcoAlto;
    }

    public void setArcoAlto(double arcoAlto) {
        this.arcoAlto = arcoAlto;
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */    
    @Override
    public void dibujar(Graphics2D g2d) {
        RoundRectangle2D rectangle = new RoundRectangle2D.Double(x,y,super.ancho,super.alto,arcoAncho,arcoAlto);        
        dibujar(g2d,rectangle);
    }
    

    
}
