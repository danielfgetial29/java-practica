package laboratorios.cafeteria;
import java.util.Scanner;

public class Kata1 {

    public static void main(String[] args) {
//        Calculadora de propinas

        //Inicializo la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Toma de valores desde la consola
        System.out.println("Ingrese valor de la cuenta: ");
        int valorCuenta = scanner.nextInt();

        System.out.println("Ingrese porcentaje de la propina: ");
        int porcentajePropina = scanner.nextInt();

        // Variables



        checkValues(valorCuenta, porcentajePropina);

    }

//    Metodos

    /**
     * Calcula el valor total de una cuenta basandose en su valor neto
     * y su porcentjae de propina
     *
      * @param cuenta
     * @param porcentaje
     * @return
     */
    public static int calculateTip(int cuenta, int porcentaje){

        // Se calcula el valor de la propina segun el porcentaje
        int tip = (cuenta * porcentaje)/ 100;

        // Se suma el valor de la propina para calcular el valor total de la cuenta
        int totalTip = cuenta + tip;
        return  totalTip;
    }

    /**
     * Imprime por consola un mensaje dependiendo del valor ingresado en la propina
     *
     * @param porcentaje
     */
    public static void tipMessage(int porcentaje){

        if (porcentaje >30) {
            System.out.println("¡Propina generosa! Eres el mejor😊");
        } else if (porcentaje <5) {
            System.out.println("Propina muy baja, Tacaño😒");
        }
    }

    /**
     * Evalua que el valor de la cuenta no sea negativo y el valor del porcentaje este
     * entre 0 y 100
     * @param cuenta
     * @param porcentaje
     */
    public static boolean checkValues(int cuenta, int porcentaje){
        if (cuenta <= 0){
            System.out.println("Error: Total invalido");
            return false;
        } else if ( porcentaje <0 || porcentaje > 100) {
            System.out.println("Error: Porcentaje invalido");
            return  false;
        }
        else
            return true;
    }
}