package com.icaro.clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clase3 {
    public static void main(String[] args) {
        // Declaracion e instanciacion
        int edad; // declarando la variable edad de tipo int
        char fecha;
        edad = 18; // inicializando la variable edad con valor 18
        char tipo_documento = 'D'; // declarar e inicializar una variable


        // Tipos primitivos
        byte var1 = 5;
        short var2 = 100;
        int var3 = 10000;
        long var4 = 10000000000000L;

        float var5 = 10.12f;
        double var6 = 10.222222222222222222222222222222222222;

        char var7 = 't';

        boolean var8 = true;
        boolean var9 = false;


        String var10 = "Hola";


        int valor1 = 10;
        int valor2 = 20;

        int suma = valor1 + valor2;
        System.out.println(suma);

        System.out.println(var1 + var3);

        System.out.println(var5 + var6);

        System.out.println(var3 + var5);


        // Colecciones
        int[] arrayDeInt = new int[3];

        arrayDeInt[0] = 10;
        arrayDeInt[1] = 20;
        arrayDeInt[2] = 30;

        System.out.println("El array tiene: " + Arrays.toString(arrayDeInt));

        List<Integer> listaDeInt = new ArrayList<>();

        listaDeInt.add(50);
        listaDeInt.add(10);
        listaDeInt.add(20);
        listaDeInt.add(30);

        System.out.println("La lista tiene: " + listaDeInt);


        // Estructura de control
        int dato1 = 200;
        int dato2 = 30;

        if (dato1 < dato2) {
            System.out.println("Dato 1 es mas chico que dato 2");

            if (dato1 < 5) {
                System.out.println("Dato 1 es muy muy chico");
            }
        }
        else {
            System.out.println("Dato 2 es mas grande que dato 1");
        }


        if (dato1 < dato2) {
            System.out.println("Dato 1 es mas chico que dato 2");
        }
        else if (dato1 != dato2) {
            System.out.println("Dato 1 es igual a dato 2");
        }
        else if (dato1 > dato2) {
            System.out.println("Dato 1 es igual a dato 2");
        }
        else {
            System.out.println("Dato 2 es mas grande que dato 1");
        }


        if (dato1 == dato2) {
            System.out.println("Dato 1 es mas chico que dato 2");
        }

        if (dato1 != dato2) {
            System.out.println("Dato 1 es igual a dato 2");
        }

        if (dato1 > dato2) {
            System.out.println("Dato 1 es igual a dato 2");
        }


        System.out.println("-----------------------------");
        String nombre = "Pepe";

        switch (nombre) {
            case "Carla":
                System.out.println("Soy Carla");
                break;
            case "Pepe":
                System.out.println("Soy Pepe");
                break;
            case "Ramiro":
                System.out.println("Soy Ramiro");
                break;
            default:
                System.out.println("No estas en la lista");
        }

        if (nombre.equals("Carla")) {
            System.out.println("Soy Carla");
        }
        else if (nombre.equals("Pepe")) {
            System.out.println("Soy Pepe");
        }
        else if (nombre.equals("Ramiro")) {
            System.out.println("Soy Ramiro");
        }
        else {
            System.out.println("No estas en la lista");
        }




        int numero = 10;

        while(numero <= 100) {
            System.out.println("El numero es: " + numero);
            numero = numero + 10;
            // numero += 10;
        }

        System.out.println("*******************");
        int numero2 = 10;
        do {
            System.out.println("El numero es: " + numero2);
            numero2 = numero2 + 10;
        }
        while (numero2 < 100);



        System.out.println("*******************");

        for (int numero3 = 10; numero3 < 100; numero3 = numero3 + 10) {
            System.out.println("El numero es: " + numero3);
            //---------------
            // i = i + 10
        }

    }
}


















