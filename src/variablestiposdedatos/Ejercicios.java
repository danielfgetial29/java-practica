package variablestiposdedatos;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        System.out.println("Calculadora de segundos en un dia");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de dias a convertir a segundos: ");
        int dias = Integer.valueOf(scanner.nextLine());
        int segundos = dias * 3600;
        System.out.printf("Hay %d segundos en %dias", segundos, dias);

        System.out.println("\n--- Calculadora ---");

        System.out.println("Ingresa el primer numero: ");
        int numero1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingresa el segundo numero: ");
        int numero2 = Integer.valueOf(scanner.nextLine());

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        double division = numero1 / numero2;
        int multiplicacion = numero1 * numero2;

        System.out.println("\nResultados...");
        System.out.printf("\n%d + %d = %d", numero1, numero2, suma);
        System.out.printf("\n%d - %d = %d", numero1, numero2, resta);
        System.out.printf("\n%d / %d = %f", numero1, numero2, division);
        System.out.printf("\n%d * %d = %d", numero1, numero2, multiplicacion);

        scanner.close();


    }
}
