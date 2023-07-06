

package poo;


import java.util.Scanner;

public class Menu {
    private System fileSystem;
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(java.lang.System.in);
    }

    public void displayMainMenu() {
        java.lang.System.out.println("\n");
        java.lang.System.out.println("#### Manipulador de Sistema de Archivos ####");
        java.lang.System.out.println("Escoja su opción:");
        java.lang.System.out.println("1. Crear un Sistema de Archivos");
        java.lang.System.out.println("2. Gestor de Unidades");
        java.lang.System.out.println("3. Gestor de Usuarios");
        java.lang.System.out.println("4. Gestor de Directorios.");
        java.lang.System.out.println("5. Salir");
        java.lang.System.out.print("INTRODUZCA SU OPCIÓN: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                java.lang.System.out.print("Ingrese el nombre del Sistema de Archivos: ");
                String name = scanner.nextLine();
                fileSystem = new System(name);
                java.lang.System.out.println("Sistema de archivos '" + name + "' creado exitosamente.");
                break;
            case 2:
                if (fileSystem != null) {
                    displayDriveMenu();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;
            case 3:
                if (fileSystem != null) {
                    displayUserMenu();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;
            case 4:
                if (fileSystem != null) {
                    displayDirectoryMenu();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 5:
                java.lang.System.out.println("Saliendo...");
                scanner.close();
                java.lang.System.exit(0);
                break;
            default:
                java.lang.System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 4.");
                break;
        }
    }

    private void displayDriveMenu() {
        java.lang.System.out.println("\n");
        java.lang.System.out.println("#### Gestor de Unidades ####");
        java.lang.System.out.println("Escoja su opción:");
        java.lang.System.out.println("1. Añadir una Unidad al Sistema de Archivos");
        java.lang.System.out.println("2. Visualizar Sistema de Archivos");
        java.lang.System.out.println("3. Seleccionar unidad de trabajo");
        java.lang.System.out.println("4. Volver al menú principal");
        java.lang.System.out.print("INTRODUZCA SU OPCIÓN: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {

            case 1:
                if (fileSystem != null) {
                    java.lang.System.out.print("Ingrese la letra de la Unidad: ");
                    String letter = scanner.nextLine();
                    java.lang.System.out.print("Ingrese el nombre de la Unidad: ");
                    String driveName = scanner.nextLine();
                    java.lang.System.out.print("Ingrese la capacidad de la Unidad: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    fileSystem.addDrive(letter, driveName, capacity);
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 2:
                if (fileSystem != null) {
                    java.lang.System.out.println("Nombre del Sistema: " + fileSystem.getName());
                    java.lang.System.out.println("Fecha de Creación: " + fileSystem.getCreationDate());
                    java.lang.System.out.println("Unidades:");
                    for (Drive drive : fileSystem.getDrives()) {
                        java.lang.System.out.println("  Letra: " + drive.getLetter() + ", Nombre: " + drive.getName() + ", Capacidad: " + drive.getCapacity());
                    }
                } else {
                    java.lang.System.out.println("No se ha creado ningún sistema de archivos aún.");
                }
                break;

            case 3:
                java.lang.System.out.print("Introduzca la letra de la unidad en la que desea trabajar: ");
                String letter = scanner.nextLine();
                assert fileSystem != null;
                fileSystem.switchDrive(letter);
                break;

            case 4:
                break;

            default:
                java.lang.System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 4.");
                break;
        }
    }

    private void displayUserMenu() {
        java.lang.System.out.println("\n");
        java.lang.System.out.println("#### Gestor de Usuarios ####");
        java.lang.System.out.println("Escoja su opción:");
        java.lang.System.out.println("1. Registrar un nuevo usuario");
        java.lang.System.out.println("2. Iniciar sesión");
        java.lang.System.out.println("3. Cerrar sesión");
        java.lang.System.out.println("4. Visualizar usuarios registrados.");
        java.lang.System.out.println("5. Volver al menú principal");
        java.lang.System.out.print("INTRODUZCA SU OPCIÓN: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {

            case 1:
                if (fileSystem != null) {
                    java.lang.System.out.print("Ingrese el nombre de usuario: ");
                    String userName = scanner.nextLine();
                    fileSystem.register(userName);
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 2:
                if (fileSystem != null){
                    java.lang.System.out.println("Ingrese el nombre de usuario: ");
                    String userName = scanner.nextLine();
                    fileSystem.login(userName);
                }else{
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 3:
                if (fileSystem != null) {
                    fileSystem.logout();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 4:
                if (fileSystem != null) {
                    fileSystem.listUsers();
                } else {
                    java.lang.System.out.println("Debe crear un sistema de archivos primero.");
                }
                break;

            case 5:
                break;

            default:
                java.lang.System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 5.");
                break;

        }
    }

    private void displayDirectoryMenu(){
        java.lang.System.out.println("\n");
        java.lang.System.out.println("#### Gestor de Usuarios ####");
        java.lang.System.out.println("1. MkDir");
        java.lang.System.out.println("2. Volver al menú principal");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                java.lang.System.out.print("Introduzca el nombre del directorio que desea crear: ");
                String folderName = scanner.nextLine();
                fileSystem.mkdir(folderName);
                break;
            case 2:
                break;

            default:
                java.lang.System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y .");
                break;
        }

    }
}
