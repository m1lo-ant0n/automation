package com.icaro.clase6;

public class Main {

    public static void main(String[] args) {

        Vehiculo toyota = new Vehiculo
                ("Toyota", "Corolla", 2020);

        Coche ford = new Coche
                ("Ford", "Mustang", 2021, 5000);

        // Vehiculo
        System.out.println("Marca de Vehiculo: " + toyota.getMarca());
        System.out.println("Modelo de Vehiculo: " + toyota.getModelo());
        System.out.println("Anio del vehiculo: " + toyota.getAnio());

        toyota.acelerar();
        toyota.frenar();

        System.out.println("\n\n");

        // Coche
        System.out.println("Marca de Coche: " + ford.getMarca());
        System.out.println("Modelo de Coche: " + ford.getModelo());
        System.out.println("Anio del Coche: " + ford.getAnio());
        System.out.println("Cilindrada del Coche: " + ford.getCilindrada());

        ford.acelerar();
        ford.frenar();
    }
}
