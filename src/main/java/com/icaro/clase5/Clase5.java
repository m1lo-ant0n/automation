package com.icaro.clase5;

import java.util.Scanner;

public class Clase5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar nombre y apellido: ");
        String nombreYApellido = scanner.nextLine();
        System.out.println("Nombre y apellido ingresado es: " + nombreYApellido);

        System.out.println("Ingresar nombre: ");
        String nombre = scanner.next();
        System.out.println("Nombre ingresado es: " + nombre);

        System.out.println("Ingresar edad: ");
        int edad = scanner.nextInt();
        System.out.println("La edad ingresada es: " + edad);

        System.out.println("Ingresar precio: ");
        float precio = scanner.nextFloat();
        System.out.println("El precio ingresado es: " + precio);

    }
}
