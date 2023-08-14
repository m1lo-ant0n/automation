package ejercicios.ejercicio1;

class Calculadora {
    private double valorActual;

    public Calculadora() {
        valorActual = 0;
    }

    public void sumar(double numero) {
        valorActual += numero;
    }

    public void restar(double numero) {
        valorActual -= numero;
    }

    public void multiplicar(double numero) {
        valorActual *= numero;
    }

    public void dividir(double numero) {
        if (numero != 0) {
            valorActual /= numero;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    public double obtenerValor() {
        return valorActual;
    }
}
