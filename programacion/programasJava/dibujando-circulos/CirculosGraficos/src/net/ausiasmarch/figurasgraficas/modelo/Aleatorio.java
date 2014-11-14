/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.figurasgraficas.modelo;

import java.util.Random;
import java.awt.Color;

/**
 *
 * @author  Rubén Martín Martínez y Jose Maria Gascón Artal
 */
public class Aleatorio {

    public static int nextInt(int maxValue) {
// Crea un objeto r para numeros aleatorios tomando como valor inicial el tiempo del
// sistema en nanosegundos
        Random ran = new Random(System.nanoTime());
        return ran.nextInt(maxValue); // genera un nÚmero aleatorio entero y lo devuelve
    }

    // Devuelve un color aleatorio compuesto de rojo, verde y azul, todos entre 0 y 256 - 1
    public static Color nextColor() {
        return new Color(nextInt(256), nextInt(256), nextInt(256));
    }
}
