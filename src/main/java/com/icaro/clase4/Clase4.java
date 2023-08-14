package com.icaro.clase4;

import java.util.ArrayList;
import java.util.List;

public class Clase4 {

    public static void main(String[] args) {

        Estudiante pepe = new Estudiante();
        pepe.rendirExamen("Programacion Java");
        pepe.setNombre("PEPE");
        System.out.println("El nombre del estudiante es: " + pepe.getNombre());


        pepe.setApellido("pepeppepe");


        Estudiante cesar = new Estudiante("Cesar", "Mejia", 12345678);
        System.out.println("El nombre del estudiante es: " + cesar.getNombre());
        System.out.println("El apellido del estudiante es: " + cesar.getApellido());


        Estudiante miVariable = new Estudiante();
        System.out.println("El nombre del estudiante es: " + miVariable.getNombre());

        List<String> listaDeString = new ArrayList<>();

        listaDeString.add("hola"); //0
        listaDeString.add("chau"); //1
        listaDeString.add(1, "pepe"); // va a pisar la posicion 1 -> va a tener pepe y no chau
    }
}
