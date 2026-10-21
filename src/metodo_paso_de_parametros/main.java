package metodo_paso_de_parametros;

public class main {
    public static void main(String[] args) {

        int kilometrosRecorridos = 5;

//        actualizarKilometros(kilometrosRecorridos);

        kilometrosRecorridos = actualizarKilometros(kilometrosRecorridos);
        System.out.printf("Kilometros despues de la llamada del metodo: %d", kilometrosRecorridos);

    }

    public static int actualizarKilometros(int km){
        System.out.printf("Dentro del metodo: %d %n", km);

        return  km + 10;
    }
}
