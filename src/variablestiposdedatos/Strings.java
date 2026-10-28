package variablestiposdedatos;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String name = "Daniel";

        // metodos de String
        //Longitud
        System.out.println(name.length());

        // Concatenar
        System.out.println("Hola" + name);

        // obtener un caracter
        System.out.println(name.charAt(2)); // n

        System.out.println(name.charAt(name.length()-1)); // Obtener el ultimo valor de la cadena

        System.out.println(name.substring(1,4)); // para extraer una parte del string sin incluir el ultimo

        // Mayusculas y minisculas
        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);
    }
}
