package poo.interfacesabastraccion;

public class Televisor implements ControlRemoto{

    //atributos
    private boolean encendido = false;
    private int volumen = 0;

    // implementaciones obtenidas de la interfaz ControlRemoto
    @Override
    public void encender() {
        encendido = true;
        System.out.println("El televisor esta encendido y tiene un sonido de inicio");

    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("El televisor se ha apagado");
    }

    @Override
    public void subirVolumne() {
        if (encendido){
            volumen++;
            System.out.println("Volumen del televisor en: "+ volumen);
        }
    }

    @Override
    public void bajarVolumne() {
        if (encendido && volumen > 0){
            volumen--;
            System.out.println("El volumen del televisor esta en: "+volumen);
        }
    }
}
