import java.util.Scanner;

public class Inflacion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaración de variables
        String nombre;
        double precioAnterior, precioActual, inflacion, promedioInflacion = 0;
        int cantArticulos, contador = 0;
        String nombreArticuloMayorInflacion = "";
        double mayorInflacion = 0;
        
        // Pedir la cantidad de artículos a procesar
        System.out.print("Ingrese la cantidad de artículos a procesar: ");
        cantArticulos = input.nextInt();
        
        // Procesar cada artículo
        for (int i = 0; i < cantArticulos; i++) {
            System.out.println("Artículo " + (i+1) + ":");
            
            // Pedir los datos del artículo
            System.out.print("Nombre: ");
            nombre = input.next();
            
            System.out.print("Precio anterior: ");
            precioAnterior = input.nextDouble();
            
            System.out.print("Precio actual: ");
            precioActual = input.nextDouble();
            
            // Calcular la inflación y mostrar los resultados
            inflacion = (precioActual - precioAnterior) / precioAnterior * 100;
            System.out.println("Precio anterior: " + precioAnterior);
            System.out.println("Precio actual: " + precioActual);
            System.out.println("Inflación: " + inflacion + "%");
            
            // Calcular el promedio de inflación
            promedioInflacion += inflacion;
            
            // Verificar si es el artículo con mayor inflación
            if (inflacion > mayorInflacion) {
                mayorInflacion = inflacion;
                nombreArticuloMayorInflacion = nombre;
            }
            
            contador++;
        }
        
        // Calcular el promedio de inflación
        promedioInflacion /= contador;
        
        // Mostrar el promedio de inflación y el artículo con mayor inflación
        System.out.println("\nPromedio de inflación: " + promedioInflacion + "%");
        System.out.println("Artículo con mayor inflación: " + nombreArticuloMayorInflacion + " - " + mayorInflacion + "%");
        
        // Cerrar el scanner
        input.close();
    }

}