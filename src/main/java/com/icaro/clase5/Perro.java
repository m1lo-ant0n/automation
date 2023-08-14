package com.icaro.clase5;

public class Perro extends Animal {

    public Perro(String nombre, String tipo) {
        this.nombre = nombre;
        setTipo(tipo);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guaaauuuuu");
    }

    @Override
    public void caminar() {
        System.out.println("camino como un perro");
    }

    @Override
    public String toString() {
        return "Me llamo " + this.nombre + " y soy de tipo " + this.getTipo();
    }
}
