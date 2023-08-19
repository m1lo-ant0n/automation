package ejercicios.ejercicio1;
import java.util.Scanner;
public class Main {
    int numero1;
    int numero2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        Calculadora miCalculadora = new Calculadora();

            System.out.print("Ingrese un número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese otro número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Operaciones disponibles:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Seleccione la operación: ");
            int opcion = scanner.nextInt();

            if(opcion == 1) {
                miCalculadora.sumar(numero1, numero2);
                System.out.println("El resultado de la suma es "+miCalculadora.sumar(numero1, numero2));
            } else if (opcion == 2) {
                miCalculadora.restar(numero1, numero2);
                System.out.println("El resultado de la suma es "+miCalculadora.restar(numero1, numero2));
            } else if (opcion == 3) {
                miCalculadora.multiplicar(numero1, numero2);
                System.out.println("El resultado de la suma es "+miCalculadora.multiplicar(numero1, numero2));
            } else if (opcion == 4) {
                miCalculadora.dividir(numero1, numero2);
                System.out.println("El resultado de la suma es "+miCalculadora.dividir(numero1, numero2));
            }

        }

    }