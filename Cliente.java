import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numClientes;
        do {
            System.out.print("Ingrese la cantidad de clientes a procesar: ");
            numClientes = input.nextInt();
        } while (numClientes <= 0);

        double subtotalTotal = 0, descuentoTotal = 0, totalAPagarTotal = 0;
        for (int i = 1; i <= numClientes; i++) {
            System.out.println("Cliente #" + i);
            System.out.print("Ingrese el nombre del cliente: ");
            String nombreCliente = input.next();
            
            int tipoCliente;
            do {
                System.out.print("Ingrese el tipo de cliente (1, 2, 3, 4): ");
                tipoCliente = input.nextInt();
            } while (tipoCliente < 1 || tipoCliente > 4);
            double toneladasPlastico, precioTonelada;
            do {
                System.out.print("Ingrese la cantidad de toneladas de plástico: ");
                toneladasPlastico = input.nextDouble();
            } while (toneladasPlastico <= 0);
            do {
                System.out.print("Ingrese el precio por tonelada de plástico: ");
                precioTonelada = input.nextDouble();
            } while (precioTonelada <= 0);

            double subtotal = toneladasPlastico * precioTonelada;
            double descuento = 0;
            switch (tipoCliente) {
                case 1:
                    descuento = subtotal * 0.05;
                    break;
                case 2:
                    descuento = subtotal * 0.08;
                    break;
                case 3:
                    descuento = subtotal * 0.12;
                    break;
                case 4:
                    descuento = subtotal * 0.15;
                    break;
            }
            double totalAPagar = subtotal - descuento;

            System.out.println("Nombre del cliente: " + nombreCliente);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + totalAPagar);
            System.out.println();

            subtotalTotal += subtotal;
            descuentoTotal += descuento;
            totalAPagarTotal += totalAPagar;
        }

        System.out.println("Reporte de venta de plásticos:");
        System.out.println("Subtotal total: $" + subtotalTotal);
        System.out.println("Descuento total: $" + descuentoTotal);
        System.out.println("Total a pagar total: $" + totalAPagarTotal);
        input.close();
    }
}