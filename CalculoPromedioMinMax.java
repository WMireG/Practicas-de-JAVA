import java.util.Scanner;

public class CalculoPromedioMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        int cantidadNumeros = sc.nextInt();

        double promedio = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int cantidadValidos = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese un número entre 0 y 9999: ");
            int numero = sc.nextInt();

            if (numero >= 0 && numero <= 9999) {
                cantidadValidos++;
                promedio += numero;

                if (numero > maximo) {
                    maximo = numero;
                }

                if (numero < minimo) {
                    minimo = numero;
                }
            } else {
                System.out.println("Número inválido.");
            }
        }

        if (cantidadValidos > 0) {
            promedio /= cantidadValidos;
            System.out.println("Promedio: " + promedio);
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        sc.close();
    }
}