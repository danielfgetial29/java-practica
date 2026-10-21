package laboratorios.cafeteria;
import java.util.Scanner;

public class Kata2 {

    public static void main(String[] args){
        // Clasificador de bebidas

        // Inicializo Scanner
        Scanner scanner = new Scanner(System.in);

        // Valores desde la consola
        System.out.print("Ingresa el nombre de la bebida: ");
        String nombreBebida = scanner.nextLine();

        System.out.print("Ingresa la temperatura: ");
        double temperatura = scanner.nextDouble();


        // Llamado de metodos
        String clasificacion = clasificarTemperatura(temperatura);

//        infoBedidas(bebida,clasificacion);
        System.out.printf("%s: %s", nombreBebida, clasificacion);

    }

    // Metodos
    public static String clasificarTemperatura(double valorTemp){

        if (valorTemp > 60){
            return "Caliente";
        } else if (valorTemp < 30) {
            return "Fría";
        }
        else
            return "Templada";
    }

//    public static void infoBedidas(String bebida, String temp){
//        System.out.println(bebida + ": "+ temp);
//    }
}
