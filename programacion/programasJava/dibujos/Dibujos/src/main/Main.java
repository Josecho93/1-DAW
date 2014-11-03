package main;

import Dibujos.*;
import java.awt.Color;

/**
 * Programa para dibujar figuras geométricas
 * @author Administrador
 */
public class Main  {

    /**
     * El método principal
     * @param args No se usa
     */
    public static void main(String[] args) {
        // Crea la ventana de dibujo
        Ventana ventana = new Ventana(1000,500); 
        
        // Muestra u oculta el grid de la ventana
        ventana.setShowGrid(false);  
        
        // Crea las figuras
        /*Circulo circulo = new Circulo(20,20,100);      
        circulo.setRelleno(true);
        circulo.setColor(Color.BLUE);
        circulo.setBorde(true);
        circulo.setGrosorBorde(5.0f);
        circulo.setColorBorde(Color.MAGENTA);       
        ventana.addFigura(circulo);
        
        RectanguloRedondo rectanguloR = new RectanguloRedondo(400,200,300,100,25,25);
        rectanguloR.setColor(Color.YELLOW);     
        ventana.addFigura(rectanguloR);      
        
        Cuadrado cuadrado = new Cuadrado(300,300,100);
        cuadrado.setColor(250,190,120);
        cuadrado.setAnguloRotacion(45);
        cuadrado.setPuntoRotacion(300,300);
        ventana.addFigura(cuadrado);
        
        Elipse elipse = new Elipse(100,200,100,50);
        elipse.setRelleno(false);
        elipse.setBorde(true);   
        elipse.setColorBorde(Color.RED);
        elipse.setGrosorBorde(3.0f);
        elipse.setAnguloRotacion(90);
        ventana.addFigura(elipse);
            
        Rectangulo rectangulo = new Rectangulo(700,400, 200, 40);
        rectangulo.setColor(170,110,100);
        rectangulo.setRelleno(false);
        rectangulo.setBorde(true);
        rectangulo.setGrosorBorde(10.0f);
        rectangulo.setColorBorde(Color.blue);
        rectangulo.setAnguloRotacion(70);
        ventana.addFigura(rectangulo);     
   
        Triangulo triangulo = new Triangulo(400,100,200,300,200,100);
        triangulo.setColor(150,100,120);       
        ventana.addFigura(triangulo);*/
        
        //CABEZA
        
        Rectangulo rectanguloCabeza = new Rectangulo(550,100,150,100);
        rectanguloCabeza.setColor(200,200,200);
        rectanguloCabeza.setRelleno(true);
        rectanguloCabeza.setBorde(true);
        rectanguloCabeza.setGrosorBorde(2f);
        ventana.addFigura(rectanguloCabeza);
        
        //OJOS
        
        Circulo circuloOjoizquierdo = new Circulo(587,135,23);      
        circuloOjoizquierdo.setRelleno(true);
        circuloOjoizquierdo.setColor(250,240,0);
        circuloOjoizquierdo.setBorde(true);
        circuloOjoizquierdo.setGrosorBorde(2f);       
        ventana.addFigura(circuloOjoizquierdo);
        
        Circulo circuloOjoderecho = new Circulo(637,135,23);      
        circuloOjoderecho.setRelleno(true);
        circuloOjoderecho.setColor(250,240,0);
        circuloOjoderecho.setBorde(true);
        circuloOjoderecho.setGrosorBorde(2f);       
        ventana.addFigura(circuloOjoderecho);
        
        //PECTORALES
        
        Rectangulo rectanguloPectoralizquierdo = new Rectangulo(500,200,125,100);
        rectanguloPectoralizquierdo.setColor(200,200,200);
        rectanguloPectoralizquierdo.setRelleno(true);
        rectanguloPectoralizquierdo.setBorde(true);
        rectanguloPectoralizquierdo.setGrosorBorde(2f);
        ventana.addFigura(rectanguloPectoralizquierdo);
        
        Rectangulo rectanguloPectoralderecho = new Rectangulo(625,200,125,100);
        rectanguloPectoralderecho.setColor(200,200,200);
        rectanguloPectoralderecho.setRelleno(true);
        rectanguloPectoralderecho.setBorde(true);
        rectanguloPectoralderecho.setGrosorBorde(2f);
        ventana.addFigura(rectanguloPectoralderecho);
        
        //ABDOMEN
        
        Rectangulo rectanguloAbdomen = new Rectangulo(525,300,200,100);
        rectanguloAbdomen.setColor(200,200,200);
        rectanguloAbdomen.setRelleno(true);
        rectanguloAbdomen.setBorde(true);
        rectanguloAbdomen.setGrosorBorde(2f);
        ventana.addFigura(rectanguloAbdomen);
        
        //PIERNAS
        
        Rectangulo rectanguloPiernaizquierda = new Rectangulo(550,425,75,200);
        rectanguloPiernaizquierda.setColor(200,200,200);
        rectanguloPiernaizquierda.setRelleno(true);
        rectanguloPiernaizquierda.setBorde(true);
        rectanguloPiernaizquierda.setGrosorBorde(2f);
        ventana.addFigura(rectanguloPiernaizquierda);
        
        Rectangulo rectanguloPiernaderecha = new Rectangulo(625,425,75,200);
        rectanguloPiernaderecha.setColor(200,200,200);
        rectanguloPiernaderecha.setRelleno(true);
        rectanguloPiernaderecha.setBorde(true);
        rectanguloPiernaderecha.setGrosorBorde(2f);
        ventana.addFigura(rectanguloPiernaderecha);
        
        //CADERA
        
        Triangulo trianguloCadera = new Triangulo(725,400,625,500,525,400);
        trianguloCadera.setColor(200,200,200);
        trianguloCadera.setRelleno(true);
        trianguloCadera.setBorde(true);
        trianguloCadera.setGrosorBorde(2);
        ventana.addFigura(trianguloCadera);
        
        //PIES
        
        Rectangulo rectanguloPieizquierdo = new Rectangulo(500,625,125,50);
        rectanguloPieizquierdo.setColor(200,200,200);
        rectanguloPieizquierdo.setRelleno(true);
        rectanguloPieizquierdo.setBorde(true);
        rectanguloPieizquierdo.setGrosorBorde(2f);
        ventana.addFigura(rectanguloPieizquierdo);
        
        Rectangulo rectanguloPiederecho = new Rectangulo(625,625,125,50);
        rectanguloPiederecho.setColor(200,200,200);
        rectanguloPiederecho.setRelleno(true);
        rectanguloPiederecho.setBorde(true);
        rectanguloPiederecho.setGrosorBorde(2f);
        ventana.addFigura(rectanguloPiederecho);
        
        // BRAZO IZQUIERDO
        
        Rectangulo rectanguloHombroizquierdo = new Rectangulo(425,190,65,70);
        rectanguloHombroizquierdo.setColor(200,200,200);
        rectanguloHombroizquierdo.setRelleno(true);
        rectanguloHombroizquierdo.setBorde(true);
        rectanguloHombroizquierdo.setGrosorBorde(2f);
        ventana.addFigura(rectanguloHombroizquierdo);
        
        Rectangulo rectanguloBrazoizquierdo = new Rectangulo(430,260,54,130);
        rectanguloBrazoizquierdo.setColor(200,200,200);
        rectanguloBrazoizquierdo.setRelleno(true);
        rectanguloBrazoizquierdo.setBorde(true);
        rectanguloBrazoizquierdo.setGrosorBorde(2f);
        ventana.addFigura(rectanguloBrazoizquierdo);
        
        Triangulo trianguloManoizquierda = new Triangulo(430,390,484,390,484,437);
        trianguloManoizquierda.setColor(200,200,200);
        trianguloManoizquierda.setRelleno(true);
        trianguloManoizquierda.setBorde(true);
        trianguloManoizquierda.setGrosorBorde(2);
        ventana.addFigura(trianguloManoizquierda);
        
        //BRAZO DERECHO
        
        Rectangulo rectanguloHombroderecho = new Rectangulo(760,190,65,70);
        rectanguloHombroderecho.setColor(200,200,200);
        rectanguloHombroderecho.setRelleno(true);
        rectanguloHombroderecho.setBorde(true);
        rectanguloHombroderecho.setGrosorBorde(2f);
        ventana.addFigura(rectanguloHombroderecho);
        
        Rectangulo rectanguloBrazoderecho = new Rectangulo(765,260,54,130);
        rectanguloBrazoderecho.setColor(200,200,200);
        rectanguloBrazoderecho.setRelleno(true);
        rectanguloBrazoderecho.setBorde(true);
        rectanguloBrazoderecho.setGrosorBorde(2f);
        ventana.addFigura(rectanguloBrazoderecho);
        
        Triangulo trianguloManoderecha = new Triangulo(819,390,765,390,769,440);
        trianguloManoderecha.setColor(200,200,200);
        trianguloManoderecha.setRelleno(true);
        trianguloManoderecha.setBorde(true);
        trianguloManoderecha.setGrosorBorde(2);
        ventana.addFigura(trianguloManoderecha);
        
        //SIMBOLO
        
        Elipse elipse90 = new Elipse(701,225,50,25);
        elipse90.setRelleno(false);
        elipse90.setBorde(true);   
        elipse90.setColorBorde(Color.RED);
        elipse90.setGrosorBorde(3.0f);
        elipse90.setAnguloRotacion(90);
        ventana.addFigura(elipse90);
        
        Elipse elipse180 = new Elipse(713,263,50,25);
        elipse180.setRelleno(false);
        elipse180.setBorde(true);   
        elipse180.setColorBorde(Color.RED);
        elipse180.setGrosorBorde(3.0f);
        elipse180.setAnguloRotacion(180);
        ventana.addFigura(elipse180);
        
        /*Elipse elipse45 = new Elipse(680,225,50,25);
        elipse45.setRelleno(false);
        elipse45.setBorde(true);   
        elipse45.setColorBorde(Color.RED);
        elipse45.setGrosorBorde(3.0f);
        elipse45.setAnguloRotacion(45);
        ventana.addFigura(elipse45);
        
        Elipse elipse315 = new Elipse(660,259,50,25);
        elipse315.setRelleno(false);
        elipse315.setBorde(true);   
        elipse315.setColorBorde(Color.RED);
        elipse315.setGrosorBorde(3.0f);
        elipse315.setAnguloRotacion(315);
        ventana.addFigura(elipse315);*/
        
        // Centra la ventana
        ventana.centeredScreen();
        // Maximiza la ventana
        ventana.maximized();
        // Muestra la ventana
        ventana.mostrar();  
    }  
    
}
/*
        Cuadrado cuadradoRojo=new Cuadrado(0, 0, 100);
        cuadradoRojo.setColor(255, 0, 0);
        ventana.addFigura(cuadradoRojo);
        
        Circulo circuloVerde=new Circulo(100, 100, 100);
        circuloVerde.setColor(0,255, 0);
        ventana.addFigura(circuloVerde);       
        
        Linea linea=new Linea(0, 0, 300, 300);        
        ventana.addFigura(linea); 
 */