package poo.proyectoarriendoautos;

public class Carro {
    // Atributos
    // private: Significa que nadie puede acceder a esta varialbe, solo se puede hacer por medio de metodos
    private String marca;
    private  String modelo;
    private int anio;
    private String placa;
    private int kilometraje;
    private boolean arrendado;

//    protected String id; // Solamente tiene acceso a este elemento dentro del paquete o si es heredada
// cuando tiene defaul es accesible unicamente para las clases dentro de esta carpeta


    // Constructor
    // El cosntructor va despues de los atributos y antes de los metodos

    public Carro(String marca, String modelo, int anio, String placa, int kilometraje, boolean arrendado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.arrendado = arrendado;
    }


//    public Carro(String marca, String modelo, int anio, String placa, int kilometraje, boolean arrendado){
//        this.marca = marca;
//        this.modelo = modelo;
//    }

    // Metodos

    public boolean arrendar() {

        if (!arrendado){
            arrendado = true;
            return true;
        }
        return false;
    }

    public void devolver(int nuevoKilometraje){
        arrendado = false;
        this.kilometraje = nuevoKilometraje;
    }
//
//    public boolean estaDisponible(){
//
//    }
}
