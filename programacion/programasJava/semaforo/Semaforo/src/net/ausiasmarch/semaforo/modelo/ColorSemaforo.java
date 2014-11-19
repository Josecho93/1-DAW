/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.semaforo.modelo;

/**
 *
 * @author a044531254b
 */
public enum ColorSemaforo {
    ROJO(1), AMBAR(2), VERDE(4);

    private final int value;

    ColorSemaforo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
