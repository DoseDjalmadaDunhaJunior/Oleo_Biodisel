package com.company;

public class Decantador {
    public int EtOH;
    public int Reator;
    public int glicerina;
    public int capacidade = 500;
    public int ocupado = 0; // vai ser usado para gastar a capacidade
    public int descanco = 5; // cada 1000l lancado tem que descançar por 5 segundos
    public int Lancado = 0;
    public int saida_glicerina; // tem que ser 2%
    public int saida_EtOH; // tem que ser 8%
    public int saida_solucao; // tem que ser 90%
    
    public void entrada(int reat, int et) {
        if (ocupado < 500) {
            Reator = Reator + reat;
            EtOH = EtOH + et;
        }
        else if(ocupado < 1000){
            //aqui é se estourar o decantador
        }
    }

    public int lancamento(){
        int P = 0;
        if(Lancado >= 100){
            //esperar 5 seg
        }else {
            Lancado++;
        }
        return P;
    }
}