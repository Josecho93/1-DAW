package Dibujos;

import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Dibuja un ractángulo
 * @author Administrador
 */
public class CuadradoRedondo extends Cuadrado {
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
    public CuadradoRedondo(double x,double y,double lado,double arcoAncho,double arcoAlto) {
        super(x,y,lado);             
        this.arcoAncho = arcoAncho;
        this.arcoAlto = arcoAlto;   
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
        RoundRectangle2D rectangle = new RoundRectangle2D.Double(x,y,super.lado,super.lado,arcoAncho,arcoAlto);        
        g2d.setPaint(colorRelleno);
        g2d.fill(rectangle);
    }
    

    
}
