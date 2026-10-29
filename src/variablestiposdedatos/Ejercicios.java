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
    }
}
