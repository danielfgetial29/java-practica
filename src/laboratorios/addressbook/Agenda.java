package laboratorios.addressbook;

import java.util.*;

public class Agenda {

    //Atributos
    private Map<String, Contacto> contactos = new TreeMap<>();
    private Set<String> grupos = new TreeSet<>();
    private Map<String, Set<String>> contactosPorGrupo = new TreeMap<>();
    private List<Contacto> historial = new ArrayList<>();
}
