package com.company;

/**
 * pelo que eu entendi sai 100L por vez se não for me avisem, que eu arrumo
 */
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
    public int pega = 0; //se o pega for 0 não é possivel pegar nada daqui
    public int recebe = 0; // se o recebe for 0 não é possivel receber nada daqui


    private void espera(int tempo) {
        try {
            Thread.sleep((tempo * 1000));
        } catch (InterruptedException e1) {
            System.out.println("ola");
        }
    }
    public void entrada(int reat, int et) {
        if (ocupado < 500) {
            Reator = Reator + reat;
            EtOH = EtOH + et;
        } else if (ocupado < 1000) {
            System.out.println("estourou decantador," +
                    " precisa mensagem de erro");
            //aqui é se estourar o decantador
        }
    }
    public int lancamento() {
        int P = 0;
        if (Lancado >= 100) {
            if(pega == 0) {
                recebe = 0;
                espera(5);
                recebe = 1;
            }
            else{
                pega = 0;
                recebe = 0;
                espera(5);
                pega = 1;
                recebe = 1;
            }
        } else {
            Lancado++;
            if(glicerina >= 2 && saida_solucao >= 90){
                pega = 1;
            }
            else{
                pega = 0;
            }
            System.out.println("pode pegar a saida_solucao, EtOH e glicerina");
        }
        return P;
    }
}