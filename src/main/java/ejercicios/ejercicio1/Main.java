package ejercicios.ejercicio1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora miCalculadora = new Calculadora();

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            miCalculadora.sumar(numero);

            System.out.println("Operaciones disponibles:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Seleccione la operación (1/2/3/4): ");
            int opcion = scanner.nextInt();

            System.out.print("Ingrese otro número: ");
            numero = scanner.nextInt();
            miCalculadora.multiplicar(numero);


            System.out.println("El resultado es: " + miCalculadora.obtenerValor());

            if (miCalculadora.obtenerValor() > 1000) {
                System.out.println("El resultado es un número grande");
            }


        }
    }
}