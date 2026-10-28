package variablestiposdedatos;

public class Operators {
    public static void main(String[] args) {
        // operadores

        // Aritmeticos

        var a = 5;
        var b = 3;
        System.out.println( a + b); // Suma
        System.out.println( a - b); // Resta
        System.out.println( a * b); // Multiplicacion
        System.out.println( a / b); // division
        System.out.println( a % b); // Modulo (sobrante) de la divison

        // Asignacion
        a = b;
        System.out.println(a);

        // Valores de asignacion directos
        a += 1;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 1;
        System.out.println(a);
    }
}
