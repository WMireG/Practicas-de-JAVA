import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            num = sc.nextInt();
            
            if (num == 0) {
                System.out.println("Programa finalizado");
                break;
            } else if (num % 2 == 0) {
                System.out.println(num + " es par");
            } else {
                System.out.println(num + " es impar");
            }
        } while (true);
        
        sc.close();
    }
}
