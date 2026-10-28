package laboratorios.addressbook;

public class PruebaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        System.out.println("Agregar nuevo y dato duplicado");
        agenda.agregarContacto(new Contacto("Daniel getial", "10000000000", "daniel@gmail.com"));
        agenda.agregarContacto(new Contacto("Carlos Gomez", "555-5678", "carlos@email.com"));
        agenda.agregarContacto(new Contacto("Ana Perez", "555-1234", "ana@email.com"));
        agenda.agregarContacto(new Contacto("Daniel getial", "0000000000", "felipe@gmail.com"));

        System.out.println("\nCriterios 3 y 4: Buscar contactos existentes");
        System.out.println(agenda.buscarContacto("Daniel getial"));
        System.out.println(agenda.buscarContacto("felipe"));

        System.out.println("\nCriterio 5 y 6: Eliminar contacto");
        System.out.println(agenda.eliminarContacto("Daniel getial")); // Elimina dato existente (true)
        System.out.println(agenda.eliminarContacto("Daniel getial")); // Ya no existe el dato (false)

        System.out.println("\nCriterio 7: Listar contactos alfabeticamente ");
        agenda.listarContactos();

        System.out.println("\nCriterio 8; Mostra el historial");
        agenda.listarHistorial();

        System.out.println("Criterio 9 y 10: grupos");
        agenda.agregarGrupo("Trabajo");
        agenda.agregarGrupo("Familia");
        agenda.agregarGrupo("Trabajo");
    }
}
