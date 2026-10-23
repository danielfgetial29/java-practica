package laboratorios.cafeteria;
import java.util.Scanner;

public class Kata1 {

    public static void main(String[] args) {
//        Calculadora de propinas

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta: ");
        int total = scanner.nextInt();
        System.out.print("Ingresa el porcentaje de propina: ");
        int porcentaje = scanner.nextInt();

        // Validaciones
        if (total <= 0) {
            System.out.println("Error: total inválido");
        } else if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: porcentaje inválido");
        } else {
            int propina = total * porcentaje / 100;
            int totalAPagar = total + propina;

            System.out.println("Propina: $" + propina);
            System.out.println("Total a pagar: $" + totalAPagar);

            if (porcentaje > 30) {
                System.out.println("¡Propina generosa!");
            } else if (porcentaje < 5) {
                System.out.println("Propina muy baja");
            }
        }
        scanner.close();
    }
}
