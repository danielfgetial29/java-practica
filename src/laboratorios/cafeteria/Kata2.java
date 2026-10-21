package laboratorios.cafeteria;

public class Kata2 {

    public static void main(String[] args){
        // Clasificador de bebidas

        double temp = 30;
        String bebida = "Cafe";
        String clasificacion = clasificarTemperatura(temp);

//        infoBedidas(bebida,clasificacion);
        System.out.printf(bebida + ": " + clasificacion);

    }

    // Metodos
    public static String clasificarTemperatura(double temperatura){

        if (temperatura > 60){
            return "Caliente";
        } else if (temperatura < 30) {
            return "Fría";
        }
        else
            return "Templada";
    }

//    public static void infoBedidas(String bebida, String temp){
//        System.out.println(bebida + ": "+ temp);
//    }
}
