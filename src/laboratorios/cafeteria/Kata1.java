package laboratorios.cafeteria;

public class Kata1 {

    public static void main(String[] args) {
//        Calculadora de propinas
    int valorCuenta = 450;
    int porcentajePropina = 4;



    int totalCuenta = calculateTip(valorCuenta, porcentajePropina);

    System.out.println(totalCuenta);
    tipMessage(porcentajePropina);

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

    public static void tipMessage(int porcentaje){

        if (porcentaje >30) {
            System.out.println("¡Propina generosa! Eres el mejor😊");
        } else if (porcentaje <5) {
            System.out.println("Propina muy baja, Tacaño😒");
        }
    }
}