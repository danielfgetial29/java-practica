package laboratorios.addressbook;

public class PruebaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        System.out.println("Agregar nuevo y dato duplicado");
        agenda.agregarContacto(new Contacto("Daniel getial", "10000000000", "daniel@gmail.com"));
        agenda.agregarContacto(new Contacto("Daniel getial", "0000000000", "felipe@gmail.com"));
    }
}
