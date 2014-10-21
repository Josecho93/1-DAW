package Dibujos;

import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 * Dibuja un Triangulo
 * @author Administrador
 */
public class Triangulo extends Figura {
    private int[] coordX = new int[3];
    private int[] coordY = new int[3];
            
    /**
     * Crea un nuevo Rectangulo
     * @param x Posición X de la esquina superior izquierda del rectangulo
     * @param y Posición Y de la esquina superior izquierda del rectangulo
     * @param ancho Ancho del rectangulo
     * @param alto Alto del rectangulo
     */
    public Triangulo(int x1,int y1,int x2,int y2,int x3,int y3) {        
        super(x1,y1);        
        coordX[0] = x1;
        coordY[0] = y1;       
        coordX[1] = x2;
        coordY[1] = y2;       
        coordX[2] = x3;       
        coordY[2] = y3;               
    }

    /**
     * Obtiene la primera coordenada X del triangulo
     * @return La primera coordenada X del triangulo
     */    
    public int getX1() {
        return coordX[0];
    }
    
    /**
     * Establece la primera coordenada X del triangulo
     * @param x primera Coordenada X del triangulo
     */
    public void setX1(int x) {
        coordX[0]= x;
    }

     /**
     * Obtiene la segunda coordenada X del triangulo
     * @return La segunda coordenada X del triangulo
     */    
    public int getX2() {
        return coordX[1];
    }
    
    /**
     * Establece la primera coordenada X del triangulo
     * @param x primera Coordenada X del triangulo
     */
    public void setX2(int x) {
        coordX[1]= x;
    }
   
      /**
     * Obtiene la tercera coordenada X del triangulo
     * @return La tercera coordenada X del triangulo
     */    
    public int getX3() {
        return coordX[2];
    }
    
    /**
     * Establece la tercera coordenada X del triangulo
     * @param x tercera Coordenada X del triangulo
     */
    public void setX3(int x) {
        coordX[2]= x;
    }
   
    /**
     * Método que dibuja la figura sobre la ventana.
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */    
    @Override
    public void dibujar(Graphics2D g2d) {
        Polygon triangulo = new Polygon(coordX, coordY, 3); 
        dibujar(g2d,triangulo);
    }
    

}
