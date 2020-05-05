package com.company;

//varia de 100 a 200 litros a saida
public class Fritura {
    public int tempo = 5; //tempo é em segundos
    private float resultado = 0;

    public float saida(){
        if(resultado >= 100 && resultado <= 200){
            return resultado;
        }
    }
}