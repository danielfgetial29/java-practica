package strings;

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

        // comprobar si contiene algo igual
        System.out.println("Hola Java".contains("daniel")); // false
        System.out.println("Hola Java".contains("Java")); // true

        // Comparacion
        String nombre = "Daniel";
        System.out.println(nombre.equals("Daniel"));// true
        System.out.println(nombre.equals("daniel"));// false
        System.out.println(nombre.equalsIgnoreCase("daiel"));// true ignora si es mayuscula o minuscula
        System.out.println(nombre.equalsIgnoreCase("daniel"));// false

        // Trim - para eliminar espacios en blanco al principio y al final
        System.out.println("\n  Hola como estas  ".trim());
        System.out.println("\n  Hola como estas  ");

        // Replace - remplaz valores
        System.out.println(" Estamos parendido Java ".replace(" ", "")); // remplaza espacios en blanco y los quita
        System.out.println(" Estamos parendido Java ".replace("Java", "Python")); // remplaza un valor en la cadena

        //Format

    }
}
