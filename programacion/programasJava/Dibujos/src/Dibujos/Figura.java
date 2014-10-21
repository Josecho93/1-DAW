package Dibujos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

/**
 * Clase de la que heredan todas las figuras
 *
 * @author Administrador
 */
public class Figura implements Dibujable {

    protected double x;
    protected double y;
    protected Color colorRelleno;
    protected boolean borde;
    protected boolean relleno;
    protected double xRot, yRot;
    protected float grosorBorde;
    protected Color colorBorde;
    protected int anguloRot;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
        colorRelleno = Color.BLACK;
        colorBorde = Color.BLACK;
        grosorBorde = 0.0f;
        relleno = true;
        borde = false;
        anguloRot = 0;
        xRot = x;
        yRot = y;
    }

    public float getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(float grosorBorde) {
        this.grosorBorde = grosorBorde;
    }

    public Figura(double x, double y, Color colorRelleno, boolean borde, boolean relleno) {
        this.x = x;
        this.y = y;
        this.colorRelleno = colorRelleno;
        this.borde = borde;
        this.relleno = relleno;
    }

    public int getAnguloRotacion() {
        return anguloRot;
    }

    public void setPuntoRotacion(double xRot, double yRot) {
        this.xRot = xRot;
        this.yRot = yRot;
    }

    public void setAnguloRotacion(int anguloRot) {
        this.anguloRot = anguloRot;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }

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

    public Color getColor() {
        return colorRelleno;
    }

    public void setColor(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public boolean isBorde() {
        return borde;
    }

    public void setBorde(boolean borde) {
        this.borde = borde;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    /**
     * Establece el color de la figura
     *
     * @param rojo Cantidad de Rojo. De 0 a 255
     * @param verde Cantidad de Verde. De 0 a 255
     * @param azul Cantidad de Azul. De 0 a 255
     */
    public void setColor(int rojo, int verde, int azul) {
        this.colorRelleno = new Color(rojo, verde, azul);
    }

    /**
     * Método que dibuja la figura sobre la ventana.
     *
     * @param g2d Entorno gráfico sobre el que se dibuja la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
    }

    public Color getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    protected void dibujar(Graphics2D g2d, Shape shape) {
        AffineTransform at = g2d.getTransform();

        g2d.transform(AffineTransform.getRotateInstance(Math.toRadians(anguloRot),xRot,yRot));

        if (relleno) {
            g2d.setPaint(colorRelleno);
            g2d.fill(shape);
        }

        if (borde) {
            g2d.setStroke(new BasicStroke(grosorBorde));
            g2d.setPaint(colorBorde);
            g2d.draw(shape);
        }

        g2d.setTransform(at);
    }

}
