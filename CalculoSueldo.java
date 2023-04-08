import java.util.Scanner;

public class CalculoSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmpleados = 0;
        double sueldoTotal = 0;
        boolean agregarEmpleado = true;

        do {
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = sc.next();
            System.out.print("Ingrese las horas trabajadas: ");
            int horas = sc.nextInt();
            System.out.print("Ingrese el valor de la hora: ");
            double valorHora = sc.nextDouble();

            double sueldo = horas * valorHora;
            System.out.println("El sueldo de " + nombre + " es: $" + sueldo);

            sueldoTotal += sueldo;
            numEmpleados++;

            System.out.print("¿Desea ingresar otro empleado? (1: Sí, 0: No): ");
            agregarEmpleado = sc.nextInt() == 1;
        } while (agregarEmpleado);

        System.out.println("Se ingresaron " + numEmpleados + " empleados.");
        System.out.println("El sueldo total es: $" + sueldoTotal);

        sc.close();
    }
}