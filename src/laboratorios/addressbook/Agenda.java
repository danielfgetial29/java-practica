package laboratorios.addressbook;

import java.util.*;

public class Agenda {

    //Atributos
    private Map<String, Contacto> contactos = new TreeMap<>();
    private Set<String> grupos = new TreeSet<>();
    private Map<String, Set<String>> contactosPorGrupo = new TreeMap<>();
    private List<Contacto> historial = new ArrayList<>();

    // Metodos

    /**
     * metodo que registra un contacto y valida que no exista su nombre
     * @param c (contacto)
     */
    public void agregarContacto(Contacto c){
        if (contactos.containsKey(c.getNombre())){ //containsKey comprubea si esa llave existe dentro del map
            System.out.println("Error: Ya existe un contacto con el nombre "+ c.getNombre());
            return;
        }
        contactos.put(c.getNombre(), c);
        historial.add(c);
        System.out.println("Contacto agregado: "+ c.getNombre());

    }

    /**
     * Devuelve el contacto si existe segun el nombre, si no devuelve null,
     * ya que el menu principal devolvera el mensaje de que no existe
     * @param nombre
     * @return
     */
    public Contacto buscarContacto(String nombre){
        return contactos.get(nombre);
    }

    /**
     * Elimina el dato de contactos y lo va eliminando de todas partes, si no
     * existe el valor en contactos sale del metodo
     * @param nombre
     * @return
     */
    public boolean eliminarContacto(String nombre){
        Contacto c = contactos.remove(nombre); // Elimina un elemento especifico de una estructura de datos y captura su valor
        if (c == null){
            return false; // en este caso no existe el nombre
        }
        historial.remove(c); // Elimina del historial
        for (Set<String> miembros: contactosPorGrupo.values()){
           miembros.remove(nombre); // de los grupos
        }
        return true;
    }

    public void listarContactos(){
        for (Contacto c: contactos.values()){
            System.out.println(c);
        }
    }



}
