package com.company;

public class Secadores {
    public float saida(float entrada) {
        return perdido(entrada);
    }

    private float perdido(float numero) {
        Thread.sleep(3000);
        float temp = numero * 0.01;
        return numero - temp;

    }
}