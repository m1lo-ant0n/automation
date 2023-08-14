package com.icaro.clase5;

public class Gato extends Animal {

    private int num1;
    private int num2;

    public void hacerAlgo() {
        System.out.println("Holaaa");
    }

    public void hacerAlgo(String param1) {
        System.out.println("Holaaa");
    }

    public void hacerAlgo(String param1, int param2) {
        System.out.println("Holaaa");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miauuuuu");
    }

    @Override
    public void caminar() {
        System.out.println("estoy caminando como un gato");
    }
}
