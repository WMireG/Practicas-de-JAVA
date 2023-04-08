import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.print("Ingrese el primer número (mayor que 0): ");
            num1 = sc.nextInt();
        } while (num1 <= 0);

        do {
            System.out.print("Ingrese el segundo número (mayor que 0): ");
            num2 = sc.nextInt();
        } while (num2 <= 0);

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }

        sc.close();
    }
}