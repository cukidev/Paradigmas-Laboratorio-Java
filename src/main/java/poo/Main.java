package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileSystem fileSystem = null;
        while (true) {
            System.out.println("=============================================== ");
            System.out.println("### Manipulador de Sistema de Archivos ###");
            System.out.println("Escoja su opción:");
            System.out.println("1. Crear un Sistema de Archivos.");
            System.out.println("2. Añadir una Unidad al Sistema de Archivos.");
            System.out.println("3. Visualizar Sistema de Archivos.");
            System.out.println("4. Visualizar usuarios registrados.");
            System.out.println("5. Registrar un nuevo usuario.");
            System.out.println("6. Iniciar sesión.");
            System.out.println("7. Cerrar sesión.");
            System.out.println("8. Seleccionar unidad de trabajo.");
            System.out.println("9. Salir.");
            System.out.println("=============================================== ");
            System.out.print("INTRODUZCA SU OPCIÓN: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (option) {
                // Crear un Sistema de Archivos
                case 1:
                    System.out.print("Ingrese el nombre del Sistema de Archivos: ");
                    String name = scanner.nextLine();
                    fileSystem = new FileSystem(name);
                    System.out.println("Sistema de archivos '" + name + "' creado exitosamente.");
                    break;
                // Añadir una Unidad al Sistema de Archivos
                case 2:
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
                // Visualizar Sistema de Archivos
                case 3:
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
                // Visualizar usuarios registrados"
                case 4:
                    if (fileSystem != null) {
                        fileSystem.listUsers();
                    } else {
                        System.out.println("Debe crear un sistema de archivos primero.");
                    }
                    break;
                // Registrar un nuevo usuario
                case 5:
                    if (fileSystem != null) {
                        System.out.print("Ingrese el nombre de usuario: ");
                        String userName = scanner.nextLine();
                        fileSystem.register(userName);
                    } else {
                        System.out.println("Primero debe crear un sistema de archivos.");
                    }
                    break;
                // Iniciar sesión
                case 6:
                    if (fileSystem != null){
                        System.out.println("Ingrese el nombre de usuario: ");
                        String userName = scanner.nextLine();
                        fileSystem.login(userName);
                    }else{
                        System.out.println("Primero debe crear un sistema de archivos.");
                    }
                    break;
                // Cerrar sesión
                case 7:
                    if (fileSystem != null) {
                        fileSystem.logout();
                    } else {
                        System.out.println("Primero debe crear un sistema de archivos.");
                    }
                    break;
                // Switch Drive
                case 8:
                    System.out.print("Introduzca la letra de la unidad de disco en la cual desea trabajar: ");
                    char driveLetter = scanner.nextLine().charAt(0);
                    assert fileSystem != null;
                    fileSystem.switchDrive(driveLetter);
                    break;
                // Salir
                case 9:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                // Opción no válida
                default:
                    System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 7.");
                    break;
            }
        }
    }
}

