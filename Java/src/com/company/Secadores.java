package com.company;

public class Secadores {
    public int tempo = 0;
    public float saida(float entrada){
        return perdido(entrada);
    }

    private float perdido(float numero){
        if(tempo == 3) {
            float temp = numero * 0.01;
            return numero - temp;
        }
    }
}