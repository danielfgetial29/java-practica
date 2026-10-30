package condicionales;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        // Condicionales
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu velocidad: ");

        int velocidad = Integer.valueOf(scanner.nextLine());

        if (velocidad > 120){
            System.out.println("¡Ticket de exceso de velocidad!");
        }

        // Programa Orwell
        System.out.println("Ingrese un entero:");
        int entrada = Integer.valueOf(scanner.nextLine());

        if (entrada == 1984){
            System.out.println("Orwell");
        }

        // Condion con else (otro)
        System.out.println("Ingrese un numero entero: ");
        int entero = Integer.valueOf(scanner.nextLine());

        if (entero > 0){
            System.out.println("El numero es positivo");

        }else {
            System.out.println("El numero es negativo");
        }

        scanner.close();
    }
}
