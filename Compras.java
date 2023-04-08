import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numClientes, numArticulos;
        double totalGeneral = 0;
        
        System.out.print("Ingrese la cantidad de clientes: ");
        numClientes = input.nextInt();
        
        for (int i = 1; i <= numClientes; i++) {
            System.out.print("Ingrese el nombre del cliente " + i + ": ");
            String nombreCliente = input.next();
            
            System.out.print("Ingrese la cantidad de artículos comprados por el cliente " + nombreCliente + ": ");
            numArticulos = input.nextInt();
            
            double totalCliente = 0;
            
            for (int j = 1; j <= numArticulos; j++) {
                System.out.print("Ingrese el nombre del artículo " + j + " comprado por el cliente " + nombreCliente + ": ");
                String nombreArticulo = input.next();
                
                System.out.print("Ingrese el precio unitario del artículo " + nombreArticulo + ": ");
                double precioUnitario = input.nextDouble();
                
                System.out.print("Ingrese la cantidad de " + nombreArticulo + " comprados por el cliente " + nombreCliente + ": ");
                int cantidad = input.nextInt();
                
                double totalArticulo = precioUnitario * cantidad;
                System.out.println("Total del artículo " + nombreArticulo + ": $" + totalArticulo);
                
                totalCliente += totalArticulo;
            }
            
            System.out.println("Total del cliente " + nombreCliente + ": $" + totalCliente);
            totalGeneral += totalCliente;
        }
        
        System.out.println("Total general: $" + totalGeneral);
        
        input.close();
    }
}