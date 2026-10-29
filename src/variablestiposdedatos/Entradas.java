package variablestiposdedatos;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {

        // Inicializa a Scanner
        Scanner scanner = new Scanner(System.in);

        // Muestra por consola un mensaje
        System.out.println("Escribe un mensaje: ");

        // Lee el texto escrito por el usuario y lo asigna a la variable mensaje
        String mensaje = scanner.nextLine();


        // Muestra el mensaje que ingreso el usuario
        System.out.println("\nMensaje capturado...");
        System.out.println(mensaje);
    }
}
