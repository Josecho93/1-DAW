package figuras;

/**
 * Ejemplo: circulos.
 * Clase para representar círculos situados sobre el plano.
 * @author Rubén Martín
 * @version 1.0
 */
public class Circulo {
    /**
        * Variables protected double. Coordenadas del centro
        */
    protected double x, y;
    /**
        * Variable protected double. Radio del circulo
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
        * @return 
        */
    // Cálculo del área de este círculo.
    public double área() {
        return Math.PI * r * r;
    }

    //Indica si un punto está dentro del círculo.
    public boolean contiene(double px, double py) {
        /* Calculamos la distancia de (px,py) al centro del círculo (x,y),
         que se obtiene como raíz cuadrada de (px-x)^2+(py-y)^2 */
        double d = Math.sqrt((px - x) * (px - x) + (py - y) * (py - y));

        // el círculo contiene el punto si d es menor o igual al radio
        return d <= r;
    }
}
