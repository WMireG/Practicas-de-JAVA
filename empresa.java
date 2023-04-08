import java.util.Scanner;

public class empresa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de obreros: ");
        int n = input.nextInt();
        
        String[] nombres = new String[n];
        int[][] unidades = new int[n][];
        int[] totales = new int[n];
        int maxUnidades = Integer.MIN_VALUE;
        int maxIndex = -1;
        int minUnidades = Integer.MAX_VALUE;
        int minIndex = -1;
        double promedio = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del obrero " + (i+1) + ": ");
            nombres[i] = input.next();
            
            System.out.print("Ingrese la cantidad de dias trabajados: ");
            int dias = input.nextInt();
            unidades[i] = new int[dias];
            
            for (int j = 0; j < dias; j++) {
                System.out.print("Ingrese la cantidad de unidades producidas en el dia " + (j+1) + ": ");
                unidades[i][j] = input.nextInt();
                totales[i] += unidades[i][j];
            }
            
            promedio += (double) totales[i] / dias;
            
            if (totales[i] > maxUnidades) {
                maxUnidades = totales[i];
                maxIndex = i;
            }
            
            if (totales[i] < minUnidades) {
                minUnidades = totales[i];
                minIndex = i;
            }
        }
        
        System.out.println("\nCantidad de obreros: " + n);
        System.out.println("Operario más productivo: " + nombres[maxIndex] + " (" + maxUnidades + " unidades)");
        System.out.println("Operario menos productivo: " + nombres[minIndex] + " (" + minUnidades + " unidades)");
        System.out.println("Promedio de unidades fabricadas por operario: " + (promedio / n));
        
        input.close();
    }
}