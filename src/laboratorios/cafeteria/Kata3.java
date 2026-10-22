package laboratorios.cafeteria;

import java.util.Scanner;

public class Kata3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables
        int subtotal = 0;
        int precioProducto;

        // Entrada de productos
        while (true) {

            System.out.print("Ingresa el precio del producto (0 para terminar): ");

            precioProducto = scanner.nextInt();

            // Finalizar pedido
            if (precioProducto == 0) {
                break;
            }

            // Acumular precios
            subtotal += precioProducto;
        }

        // Calcular IVA
        double valorIva = subtotal * 0.19;

        // Calcular total con IVA
        double totalConIva = subtotal + valorIva;


        // Inicializar descuento
        double  descuento = 0;


        // Aplicar descuento si corresponde
        if (totalConIva > 50000) {

            descuento = totalConIva * 0.10;

            // Calcular total final
            double  totalFinal = totalConIva - descuento;

            System.out.println("Subtotal: $" + subtotal);
            System.out.println("IVA (19%): $"+ valorIva);
            System.out.println("Total con IVA: $" +  totalConIva);
            System.out.println("Descuento (10%): $" + descuento);
            System.out.println("Total a pagar: $" + totalFinal);

        }else{
            // Salidas
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("IVA (19%): $"+  valorIva);
            System.out.println("Total: $" + totalConIva);
        }

        scanner.close();
    }
}