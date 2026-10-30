package strings;

public class StringExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String cadena1 = "hola";
        String cadena2 = " Como estas";
        System.out.println(cadena1 + cadena2);

        // 2. Muestra la longitud de una cadena de texto.
        String c1 = "Estoy aprendiendo sobre las cadenas de texto";
        int longitud = c1.length();
        System.out.println(longitud);

        // 3. Muestra el primer y último carácter de un string.
        String c2 = "Aprendiendo";
        char primeroCaracter = c2.charAt(0);
        char ultimoCaracter = c2.charAt(c2.length()-1);

        System.out.println("\nPrimer caracter: "+primeroCaracter+" ultimo caracter "+ ultimoCaracter);

        // 4. Convierte a mayúsculas y minúsculas un string.
        String lower_Upeer = "a";
        String upper_lower = "B";
        System.out.println("\nConvertido a mayuscula "+lower_Upeer.toUpperCase());
        System.out.println("Convertido a miniscula" + upper_lower.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("\nEstoy aprendiendo Java". contains("Java"));

        // 6. Formatea un string con un entero.
        String numero = "25";
        int numero_convertido = Integer.valueOf(numero);
        // Imprime el tipo de dato en la consola
        System.out.println(((Object) numero_convertido).getClass().getSimpleName()); // integer

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("\n eliminando espacios al princip y al final   ");
        System.out.println(" eliminando espacios al princip y al final   ". trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("  Sustituyendo espacios por (-) ".replace(" ","-") );
        // 9. Comprueba si dos strings son iguales.

        // 10. Comprueba si dos strings tienen la misma longitud.
    }
}
