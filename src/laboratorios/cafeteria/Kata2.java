package laboratorios.cafeteria;

public class Kata2 {

    public static void main(String[] args){
        // Clasificador de bebidas

        double temp = 29.00;
        String clasificacion = clasificarTemperatura(temp);
        System.out.print(clasificacion);

    }

    // Metodos
    public static String clasificarTemperatura(double temperatura){
        String clasificacion = " ";

        if (temperatura > 60){
            return clasificacion = "Caliente";
        } else if (temperatura < 30) {
            return clasificacion = "Fría";
        }
        else
            return clasificacion = "Templada";
    }
}
