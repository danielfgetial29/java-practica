package laboratorios.cafeteria;

public class Kata1 {

    public static void main(String[] args) {
//        Calculadora de propinas
    int valorCuenta = 450;
    int porcentajePropina = 10;

    int totalCuenta = calculateTip(valorCuenta, porcentajePropina);

    System.out.print(totalCuenta);

    }

//    Metodos
    public static int calculateTip(int cuenta, int porcentaje){
        int tip = (cuenta * porcentaje)/ 100;
        int totalTip = cuenta + tip;
        return  totalTip;
    }
}