package variablestiposdedatos;

public class VariablesAndConstants {
    public static void main(String[] args) {

        // Variables
        String name = "Daniel"; // Cadena de texto
        System.out.println(name);

        int  age = 25; // numeros de tipo entero
        System.out.println(age);

        name = "Felipe";
        System.out.println(name);

         // Palabra var, infiere en lo que le pasemos a la variable la primera vez
        var anio = 2025; // toma que la variable anio es un entero y no se puede redefinir como otro tipo de valor
        var mensaje = "Hola como estas";

        System.out.println(anio);
        System.out.println(mensaje);

//        anio = "hooa"; // Arrojaria error porque se infirio que anio es de tipo entero


        // Constantes - como buena practica se usan en mayuscula

         final String EMAIL = "daniel.getial@gmail.com";
        System.out.println(EMAIL);
    }
}
