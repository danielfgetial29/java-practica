package metodo_paso_de_parametros;
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
//        <> -> Operadores genericos
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Ana");
        listaNombres.add("Daniel");
        listaNombres.add("Luis");


//        Array
        int[] listaNumeros = new int[3];
        listaNumeros[0] = 2;
        listaNumeros[1] = 3;
        listaNumeros[2] = 4; // No se supera el tamaño del indicado en la declaracion[3]

    }

}
