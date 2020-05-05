package com.company;

public class Reator {
    public float Parte_NaOH = 0; // tem que ser 1 parte
    public float Parte_EtOH = 0; // tem que ser 4 partes
    public float Parte_Oleo = 0; // tem que ser 100 partes

    public int saida(){
        if(Parte_NaOH >= 1 && Parte_EtOH >= 4 && Parte_Oleo >= 100){
            return 50;
        }
    }

}