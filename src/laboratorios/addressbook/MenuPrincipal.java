package laboratorios.addressbook;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean salir = false;

        while (!salir){
            mostrarMenu();

            if (!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.println("Opcion invalida, intenta de nuevo");
                continue;
            }
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.println("--- AGREGAR CONTACTO ---");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    agenda.agregarContacto(new Contacto(nombre, telefono, email));
                    break;
                }
                case 2: {
                    System.out.print("Nombre a buscar: ");
                    String nombre = scanner.nextLine();
                    Contacto c = agenda.buscarContacto(nombre);
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        System.out.println("Contacto no encontrado: " + nombre);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nombre a eliminar: ");
                    String nombre = scanner.nextLine();
                    if (agenda.eliminarContacto(nombre)) {
                        System.out.println("Contacto eliminado: " + nombre);
                    } else {
                        System.out.println("Contacto no encontrado: " + nombre);
                    }
                    break;
                }
                case 4:
                    System.out.println("--- LISTA DE CONTACTOS (orden alfabetico) ---");
                    agenda.listarContactos();
                    break;
                case 5:
                    System.out.println("--- HISTORIAL (orden de insercion) ---");
                    agenda.listarHistorial();
                    break;
                case 6: {
                    System.out.print("Nombre del grupo: ");
                    String grupo = scanner.nextLine();
                    agenda.agregarGrupo(grupo);
                    break;
                }
                case 7: {
                    System.out.print("Nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Nombre del grupo: ");
                    String grupo = scanner.nextLine();
                    agenda.agregarContactoAGrupo(nombre, grupo);
                    break;
                }
                case 8:
                    System.out.println("--- GRUPOS (orden alfabetico) ---");
                    agenda.listarGrupos();
                    break;
                case 9: {
                    System.out.print("Nombre del grupo: ");
                    String grupo = scanner.nextLine();
                    agenda.mostrarContactosPorGrupo(grupo);
                    break;
                }
                case 10:
                    System.out.println("Saliendo de la agenda...");
                    salir = true;
                    break;
                default:
                    // Numero fuera de rango
                    System.out.println("Opcion invalida, intenta de nuevo");
            }
        }

    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("=== AGENDA DE CONTACTOS ===");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Listar contactos (orden alfabetico)");
        System.out.println("5. Listar historial (orden de insercion)");
        System.out.println("6. Agregar grupo");
        System.out.println("7. Agregar contacto a grupo");
        System.out.println("8. Listar grupos");
        System.out.println("9. Mostrar contactos por grupo");
        System.out.println("10. Salir");
        System.out.println("==========================");
        System.out.print("Elige una opcion: ");
    }
}
