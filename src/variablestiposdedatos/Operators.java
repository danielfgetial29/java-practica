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

        // Comparacion (Relacionales)
        System.out.println(a == b); // igualdad
        System.out.println(a != b); // diferente
        System.out.println(a > b); // Mayor
        System.out.println(a >= b); // Mayor o igual
        System.out.println(a < b); // Menor
        System.out.println(a <= b); // Menor o igual

        // Operadores logicos
        // Y (AND)
        // solo es true si ambos son verdaderos
        System.out.println(true && true); // true
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // O (OR)
        // si solo uno es verdadero sera = true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false); // false
    }
}
