package metodo_paso_de_parametros;
import java.util.ArrayList;
import java.util.List;


public class EnviosListas {
    public static void main(String[] args) {
        List<String> envios = new ArrayList<>();
        envios.add("Envio-001");
        agregarEnvio(envios);
        System.out.println("Objeto envios despues de la llamada al método: " + envios);
        intentarRemplazar(envios);
        System.out.println("Despues de intentar reemplazar "+ envios);

    }

    private static void agregarEnvio(List<String> lista){
        lista.add("Envio-002");
        System.out.println("Objeto lista dentor del método: "+ lista);
    }

    public static void intentarRemplazar (List<String> lista){
        lista  = new ArrayList<>();
        lista.add("Envio-999");
        System.out.println("Dentro del metodo reemplazar: " + lista);

    }

}
