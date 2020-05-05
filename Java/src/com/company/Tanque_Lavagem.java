package com.company;

public class Tanque_Lavagem {
    public float saida(float entrada_agua){
        return perdido(entrada_agua);
    }

    private float perdido(float numero){
        float temp = numero * 0.03;
        return numero - temp;
    }
}