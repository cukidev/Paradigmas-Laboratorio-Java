package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileSystem filesystem = null;
        while (true) {
            System.out.println("### Manipulador de Sistema de Archivos ###");
            System.out.println("Escoja su opción:");
            System.out.println("1. Crear un Sistema de Archivos");
            System.out.println("2. Visualizar Sistema de Archivos");
            System.out.println("3. Salir");
            System.out.print("INTRODUZCA SU OPCIÓN: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del Sistema de Archivos: ");
                    String name = scanner.nextLine();
                    filesystem = new FileSystem(name);
                    System.out.println("Sistema de archivos '" + name + "' creado exitosamente.");
                    break;
                case 2:
                    if (filesystem != null) {
                        System.out.println("Nombre del Sistema: " + filesystem.getName());
                        System.out.println("Fecha de Creación: " + filesystem.getCreationDate());
                    } else {
                        System.out.println("No se ha creado ningún sistema de archivos aún.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, escoja una opción entre 1 y 3.");
                    break;
            }
        }
    }
}
