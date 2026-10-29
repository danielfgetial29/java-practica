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

        System.out.println("Primer caracter: "+primeroCaracter+" ultimo caracter "+ ultimoCaracter);


        // 4. Convierte a mayúsculas y minúsculas un string.

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        // 6. Formatea un string con un entero.

        // 7. Elimina los espacios en blanco al principio y final de un string.

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        // 9. Comprueba si dos strings son iguales.

        // 10. Comprueba si dos strings tienen la misma longitud.
    }
}
