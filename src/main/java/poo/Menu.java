

package poo;


import java.util.Scanner;

public class Menu {
    private FileSystem fileSystem;
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMainMenu() {
        System.out.println("\n");
        System.out.println("#### Manipulador de Sistema de Archivos ####");
        System.out.println("Escoja su opción:");
        System.out.println("1. Crear un Sistema de Archivos");
        System.out.println("2. Gestor de Unidades");
        System.out.println("3. Gestor de Usuarios");
        System.out.println("4. Salir");
        System.out.print("INTRODUZCA SU OPCIÓN: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.print("Ingrese el nombre del Sistema de Archivos: ");
                String name = scanner.nextLine();
                fileSystem = new FileSystem(name);
                System.out.println("Sistema de archivos '" + name + "' creado exitosamente.");
                break;
            case 2:
                if (fileSystem != null) {
                    displayDriveMenu();
                } else {
                    System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;
            case 3:
                if (fileSystem != null) {
                    displayUserMenu();
                } else {
                    System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;
            case 4:
                System.out.println("Saliendo...");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 4.");
                break;
        }
    }

    private void displayDriveMenu() {
        System.out.println("\n");
        System.out.println("#### Gestor de Unidades ####");
        System.out.println("Escoja su opción:");
        System.out.println("1. Añadir una Unidad al Sistema de Archivos");
        System.out.println("2. Visualizar Sistema de Archivos");
        System.out.println("3. Seleccionar unidad de trabajo");
        System.out.println("4. Volver al menú principal");
        System.out.print("INTRODUZCA SU OPCIÓN: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {

            case 1:
                if (fileSystem != null) {
                    System.out.print("Ingrese la letra de la Unidad: ");
                    String letter = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la Unidad: ");
                    String driveName = scanner.nextLine();
                    System.out.print("Ingrese la capacidad de la Unidad: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    fileSystem.addDrive(letter, driveName, capacity);
                } else {
                    System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 2:
                if (fileSystem != null) {
                    System.out.println("Nombre del Sistema: " + fileSystem.getName());
                    System.out.println("Fecha de Creación: " + fileSystem.getCreationDate());
                    System.out.println("Unidades:");
                    for (Drive drive : fileSystem.getDrives()) {
                        System.out.println("  Letra: " + drive.getLetter() + ", Nombre: " + drive.getName() + ", Capacidad: " + drive.getCapacity());
                    }
                } else {
                    System.out.println("No se ha creado ningún sistema de archivos aún.");
                }
                break;

            case 3:
                System.out.print("Introduzca la letra de la unidad en la que desea trabajar: ");
                String letter = scanner.nextLine();
                assert fileSystem != null;
                fileSystem.switchDrive(letter);
                break;

            case 4:
                break;

            default:
                System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 4.");
                break;
        }
    }

    private void displayUserMenu() {
        System.out.println("\n");
        System.out.println("#### Gestor de Usuarios ####");
        System.out.println("Escoja su opción:");
        System.out.println("1. Registrar un nuevo usuario");
        System.out.println("2. Iniciar sesión");
        System.out.println("3. Cerrar sesión");
        System.out.println("4. Visualizar usuarios registrados.");
        System.out.println("5. Volver al menú principal");
        System.out.print("INTRODUZCA SU OPCIÓN: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {

            case 1:
                if (fileSystem != null) {
                    System.out.print("Ingrese el nombre de usuario: ");
                    String userName = scanner.nextLine();
                    fileSystem.register(userName);
                } else {
                    System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 2:
                if (fileSystem != null){
                    System.out.println("Ingrese el nombre de usuario: ");
                    String userName = scanner.nextLine();
                    fileSystem.login(userName);
                }else{
                    System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 3:
                if (fileSystem != null) {
                    fileSystem.logout();
                } else {
                    System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 4:
                if (fileSystem != null) {
                    fileSystem.listUsers();
                } else {
                    System.out.println("Debe crear un sistema de archivos primero.");
                }
                break;

            case 5:
                break;

            default:
                System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 5.");
                break;

        }
    }
}
