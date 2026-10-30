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

    }
}
