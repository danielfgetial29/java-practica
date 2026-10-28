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

    /**
     * Muestra la lista en orden alfabetico (TreeMap), duevelve las claves
     * ordenadas de manera alfabetica
     */
    public void listarContactos(){
        for (Contacto c: contactos.values()){
            System.out.println(c);
        }
    }

    /**
     * Muestra el historial en orden que se insertaron los datos
     *
     */
    public void listarHistorial(){
        for(Contacto c: historial){ // ArrayList devuevle los valores estrictamente en el orden que se insertaron
            System.out.println(c);
        }
    }

    // Grupos

    /**
     * Agrega grupos dependiendo si no existen, si ya existen arroja un mensaje
     * @param nombreGrupo
     */
    public void agregarGrupo(String nombreGrupo) {
        if (!grupos.add(nombreGrupo)) { // devuelve false si ya existe el grupo por lo que se niega (true) para que entre en la validacion y muestre el mensaje
            System.out.println("Error: El grupo '" + nombreGrupo + "' ya existe");
            return;
        }
        contactosPorGrupo.put(nombreGrupo, new TreeSet<>());
        System.out.println("Grupo '" + nombreGrupo + "' creado");
    }



}
