package poo.interfacesabastraccion;

public class Main {
    public static void main(String[] args) {

        // Debemos especificar que es primero la interfaz que el objeto funcione
        // correctamente
        ControlRemoto dispositivo = new Televisor();
        ControlRemoto aire = new AireAcondicionado();
    }
}
