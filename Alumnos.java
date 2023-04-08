import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0;
        int desaprobados = 0;
        while (true) {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la primera nota:");
            double nota1 = scanner.nextDouble();

            System.out.println("Ingrese la segunda nota:");
            double nota2 = scanner.nextDouble();

            System.out.println("Ingrese la tercera nota:");
            double nota3 = scanner.nextDouble();

            double promedio = (nota1 + nota2 + nota3) / 3;

            String condicion = promedio >= 4 ? "APROBADO" : "DESAPROBADO";

            System.out.println("Nombre del alumno: " + nombre);
            System.out.println("Calificaciones: " + nota1 + ", " + nota2 + ", " + nota3);
            System.out.println("Promedio: " + promedio);
            System.out.println("Condición: " + condicion);

            if (condicion.equals("APROBADO")) {
                aprobados++;
            } else {
                desaprobados++;
            }

            scanner.nextLine();

            System.out.println("¿Desea continuar con la carga de alumnos? (s/n)");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Total de alumnos aprobados: " + aprobados);
        System.out.println("Total de alumnos desaprobados: " + desaprobados);
        scanner.close();
    }
}