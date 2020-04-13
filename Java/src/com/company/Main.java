package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e1) {
            System.out.println("ola");
        }
        System.out.println("bom dia");
    }
}
