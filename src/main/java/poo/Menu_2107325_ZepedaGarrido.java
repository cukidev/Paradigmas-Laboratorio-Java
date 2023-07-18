package poo;

/*
==============
= BIBLIOTECA =
==============
*/
import java.util.Scanner;

/**
 * Clase que representa el menú del sistema de archivos.
 */
public class Menu_2107325_ZepedaGarrido {

    /*
    =============
    = ATRIBUTOS =
    =============
    */

    /**
     * Sistema de archivos
     */
    private System2107325ZepedaGarrido fileSystem;
    /**
     * Scanner que lee la entrada del usuario
     */
    private final Scanner scanner;
    /**
     * Usuario actual
     */
    private User_2107325_ZepedaGarrido currentUser2107325ZepedaGarrido;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     * Método para mostrar el menú principal y procesar la opción seleccionada por el usuario.
     */
    public Menu_2107325_ZepedaGarrido() {
        this.scanner = new Scanner(java.lang.System.in);
    }

    /*
    =====================
    = CAPA MODIFICADORA =
    =====================
    */

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
            case 1: // Crear un Sistema de Archivos"
                java.lang.System.out.print("Ingrese el nombre del Sistema de Archivos: ");
                String name = scanner.nextLine();
                fileSystem = new System2107325ZepedaGarrido(name);
                java.lang.System.out.println("Sistema de archivos '" + name + "' creado exitosamente.");
                break;
            case 2: // Gestor de Unidades
                if (fileSystem != null) {
                    displayDriveMenu();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;
            case 3: // Gestor de Usuarios
                if (fileSystem != null) {
                    displayUserMenu();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;
            case 4: // Gestor de Directorios."
                if (fileSystem != null) {
                    displayDirectoryMenu();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 5: // Salir
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

            case 1: // Añadir una Unidad al Sistema de Archivos"
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

            case 2: // Visualizar Sistema de Archivos
                if (fileSystem != null) {
                    java.lang.System.out.println("Nombre del Sistema: " + fileSystem.getName());
                    java.lang.System.out.println("Fecha de Creación: " + fileSystem.getCreationDate());
                    java.lang.System.out.println("Unidades:");
                    for (Drive_2107325_ZepedaGarrido drive2107325ZepedaGarrido : fileSystem.getDrives()) {
                        java.lang.System.out.println("  Letra: " + drive2107325ZepedaGarrido.getLetter() + ", Nombre: " + drive2107325ZepedaGarrido.getName() + ", Capacidad: " + drive2107325ZepedaGarrido.getCapacity());
                    }
                } else {
                    java.lang.System.out.println("No se ha creado ningún sistema de archivos aún.");
                }
                break;

            case 3: // Seleccionar unidad de trabajo
                java.lang.System.out.print("Introduzca la letra de la unidad en la que desea trabajar: ");
                String letter = scanner.nextLine();
                assert fileSystem != null;
                fileSystem.switchDrive(letter);
                break;

            case 4: // Salir
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

            case 1: // Registrar un nuevo usuario"
                if (fileSystem != null) {
                    java.lang.System.out.print("Ingrese el nombre de usuario: ");
                    String userName = scanner.nextLine();
                    fileSystem.register(userName);
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 2: // Iniciar sesión
                if (fileSystem != null){
                    java.lang.System.out.println("Ingrese el nombre de usuario: ");
                    String userName = scanner.nextLine();
                    fileSystem.login(userName);
                }else{
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 3: // Cerrar sesión
                if (fileSystem != null) {
                    fileSystem.logout();
                } else {
                    java.lang.System.out.println("Primero debe crear un sistema de archivos.");
                }
                break;

            case 4: // Visualizar usuarios registrados.
                if (fileSystem != null) {
                    fileSystem.listUsers();
                } else {
                    java.lang.System.out.println("Debe crear un sistema de archivos primero.");
                }
                break;

            case 5: // Volver al menú principal
                break;

            default:
                java.lang.System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 5.");
                break;

        }
    }

    private void displayDirectoryMenu(){
        java.lang.System.out.println("\n");
        java.lang.System.out.println("#### Gestor de Directorios ####");
        java.lang.System.out.println("1. Crear Directorio");
        java.lang.System.out.println("2. Cambiar Directorio");
        java.lang.System.out.println("3. Añadir archivo");
        java.lang.System.out.println("4. Eliminar archivo");
        java.lang.System.out.println("5. Volver al menú principal");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1: // Crear Directorio
                java.lang.System.out.print("Introduzca el nombre del directorio que desea crear: ");
                String folderName = scanner.nextLine();
                fileSystem.mkdir(folderName);
                break;
            case 2: // Cambiar Directorio
                java.lang.System.out.print("Introduzca la ruta a la que desea cambiar: ");
                String path = scanner.nextLine();
                fileSystem.cd(path);
                break;
            case 3: // Añadir archivo
                java.lang.System.out.print("Ingrese el nombre del archivo: ");
                String fileName = scanner.nextLine();
                java.lang.System.out.print("Ingrese el contenido del archivo: ");
                String content = scanner.nextLine();
                // Crear un objeto File_2107325_ZepedaGarrido con los datos ingresados
                File_2107325_ZepedaGarrido newFile2107325ZepedaGarrido = new File_2107325_ZepedaGarrido(fileName, currentUser2107325ZepedaGarrido, "", content);
                // Agregar el archivo al sistema
                fileSystem.addFile(newFile2107325ZepedaGarrido);
                break;


            default:
                java.lang.System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 5.");
                break;
        }

    }
}