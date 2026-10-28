package laboratorios.addressbook;

public class PruebaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        System.out.println("Agregar nuevo y dato duplicado");
        agenda.agregarContacto(new Contacto("Daniel getial", "10000000000", "daniel@gmail.com"));
        agenda.agregarContacto(new Contacto("Daniel getial", "0000000000", "felipe@gmail.com"));

        System.out.println("\nCriterios 3 y 4: Buscar contactos existentes");
        System.out.println(agenda.buscarContacto("Daniel getial"));
        System.out.println(agenda.buscarContacto("felipe"));

        System.out.println("\nCriterio 5 y 6: Eliminar contacto");
        System.out.println(agenda.eliminarContacto("Daniel getial")); // Elimina dato existente (true)
        System.out.println(agenda.eliminarContacto("Daniel getial")); // Ya no existe el dato (false)
    }
}
