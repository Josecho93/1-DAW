package figuras;

/**
 * Ejemplo: circulos. Clase para representar círculos situados sobre el plano.
 *
 * @author Rubén Martín
 * @version 1.0
 */
public class Circulo {

    /**
     * Coordenadas del centro
     */
    protected double x, y;
    /**
     * Radio del circulo
     */
    protected double r;

    /**
     * Constructor. Crea un círculo a partir de su origen su radio.
     *
     * @param x: coordenada X.
     * @param y: coordenada Y.
     * @param r radio.
     */
    public Circulo(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    /**
     * Metodo que calcula el area de este circulo
     *
     * @return devuelve el area del circulo
     */
    // Cálculo del área de este círculo.
    public double área() {
        return Math.PI * r * r;
    }

    /**
     * Metodo que indica si un punto esta dentro del circulo
     *
     * @param px contiene el valor de la coordenada x del punto que queremos
     * comprobar (X, y)
     * @param py contiene el valor de la coordenada y del punto que queremos
     * comprobar (x, Y)
     * @return devuelve si el punto esta dentro del circulo o no, para ello
     * compara la distancia con el radio.
     */
    public boolean contiene(double px, double py) {
        /**
         * Variable double d. Contiene la distancia entre el punto y el radio
         */
        double d = Math.sqrt((px - x) * (px - x) + (py - y) * (py - y));

        return d <= r;
    }
}
