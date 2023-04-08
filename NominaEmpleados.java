import java.util.Scanner;

public class NominaEmpleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = sc.nextInt();

        double totalSueldosNetos = 0;

        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("Empleado #" + i);
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Sueldo neto mensual: ");
            double sueldoNetoMensual = sc.nextDouble();

            double sueldoBrutoMensual = sueldoNetoMensual * 1.195;

            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo bruto mensual: " + sueldoBrutoMensual);
            System.out.println("Sueldo neto mensual: " + sueldoNetoMensual);
            System.out.println();

            totalSueldosNetos += sueldoNetoMensual;
        }

        System.out.println("Total de sueldos netos a pagar: " + totalSueldosNetos);
        System.out.println("Cantidad de empleados ingresados: " + cantidadEmpleados);

        sc.close();
    }
}