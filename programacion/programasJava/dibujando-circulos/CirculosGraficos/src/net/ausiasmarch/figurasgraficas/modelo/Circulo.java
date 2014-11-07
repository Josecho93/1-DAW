package net.ausiasmarch.figurasgraficas.modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;

/**
 *
 * @author Programador
 */
public class Circulo {

    //PROPIEDADES
    private double x, y, radio;
    private int grosor;
    private boolean relleno;
    private String mensaje;
    Color colorRelleno = new Color(0, 0, 0);
    Color colorContorno = new Color(0, 0, 0);

    //CONSTRUCTORES
    public Circulo(double radio, double x, double y) {
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    public Circulo(double radio, double x, double y, Color colorRelleno, Color colorContorno, int grosor) {
        this.radio = radio;
        this.x = x;
        this.y = y;
        this.colorRelleno = colorRelleno;
        this.colorContorno = colorContorno;
        this.grosor = grosor;
    }

    //GET Y SET
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Color getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public Color getColorContorno() {
        return colorContorno;
    }

    public void setColorContorno(Color colorContorno) {
        this.colorContorno = colorContorno;
    }

    //METODOS
    public void setColorRelleno(int rojo, int verde, int azul) {
        this.colorRelleno = new Color(rojo, verde, azul);
    }

    public void setColorContorno(int rojo, int verde, int azul) {
        this.colorContorno = new Color(rojo, verde, azul);
    }

    public double area() {
        return radio * radio * Math.PI;
    }

    public double circunferencia() {
        return 2 * radio * Math.PI;
    }

    public int validate(){
        if(radio <= 1){
            mensaje = "El radio no puede ser menor o igual que 1";
            return 1;
        }
        if(grosor < 0 || grosor >= radio){
            mensaje = "El grosor no puede ser menor que cero ni mayor o igual que el radio";
            return 2;
        }
        return 0;
    }
    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    public void dibujar(Graphics2D g2d) {
        Ellipse2D circulo = new Ellipse2D.Double(x, y, radio, radio);
        if (relleno) {
// si tiene relleno ...
            g2d.setPaint(colorRelleno);
// establece el color de relleno
            g2d.fill(circulo);
// dibuja el circulo con relleno
        }
        g2d.setPaint(this.colorContorno);
// establece el color de contorno
        g2d.setStroke(new BasicStroke(grosor)); // establece el grosor
        g2d.draw(circulo);
// dibuja el circulo

    }

}
