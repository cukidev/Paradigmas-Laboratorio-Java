package poo;


/*
==============
= BIBLIOTECA =
==============
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Clase que simula el Sistema de archivos
 * @author Paloma Zepeda Garrido
 */
public class System2107325ZepedaGarrido implements FileSystem_2107325_ZepedaGarrido {
    /*
    =============
    = ATRIBUTOS =
    =============
    */
    /**
     * Nombre del sistema de archivos
     */
    private final String name;
    /**
     * Fecha de creación
     */
    private final LocalDate creationDate;
    /**
     * Lista de Drives
     */
    private final List<Drive_2107325_ZepedaGarrido> drive2107325ZepedaGarridos;
    /**
     * Conjunto de usuarios
     */
    private final Set<User_2107325_ZepedaGarrido> user2107325ZepedaGarridos;
    /**
     * Usuario que está conectado actualmente
     */
    private User_2107325_ZepedaGarrido currentUser2107325ZepedaGarrido = null;
    /**
     * Drive_2107325_ZepedaGarrido que está seleccionado
     */
    private Drive_2107325_ZepedaGarrido activeDrive2107325ZepedaGarrido;
    /**
     * Carpeta actual
     */
    private Folder_2107325_ZepedaGarrido currentFolder2107325ZepedaGarrido;
    /**
     * Directorio raíz
     */
    private Directory_2107325_ZepedaGarrido root;
    /**
     * Directorio actual
     */
    private Directory_2107325_ZepedaGarrido currentDirectory2107325ZepedaGarrido;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     * Crea un nuevo sistema de archivos
     *
     * @param name nombre del sistema de archivos
     */
    // RF3: constructor
    public System2107325ZepedaGarrido(String name) {
        this.name = name; // nombre del sistema
        this.creationDate = LocalDate.now(); // fecha de creación
        this.drive2107325ZepedaGarridos = new ArrayList<>(); // drive2107325ZepedaGarridos
        this.user2107325ZepedaGarridos = new HashSet<>(); //usuario
        this.root = new Directory_2107325_ZepedaGarrido(null, "/");
        this.currentDirectory2107325ZepedaGarrido = root;
    }

    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */

    /**
     * Obtiene el nombre del sistema de archivos
     *
     * @return String con el nombre del sistema
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene la fecha de creación del sistema de archivos
     *
     * @return LocalDate con la fecha de creación
     */
    public LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * Obtiene una lista de los Drives en el sistema de archivos
     *
     * @return Lista de objetos Drives
     */
    public List<Drive_2107325_ZepedaGarrido> getDrives() {
        // retorna una copia de los drive2107325ZepedaGarridos actuales
        return new ArrayList<>(this.drive2107325ZepedaGarridos);
    }

    /**
     * Devuelve el directorio actual del sistema de archivos
     * @return directorio actual
     */
    public Directory_2107325_ZepedaGarrido getCurrentDirectory(){
        return currentDirectory2107325ZepedaGarrido;
    }

    /**
     * @return Devuelve la carpeta actual del sistema de archivos.
     */

    public Folder_2107325_ZepedaGarrido getCurrentFolder(){
        return currentFolder2107325ZepedaGarrido;
    }

    /*
    ====================
    = CAPA PERTENENCIA =
    ====================
     */

    /**
     * Verifica si una letra del drive ya existe en el sistema de archivos
     *
     * @param letter letra del drive
     * @return bool, true si la letra existe, false si no
     */
    private boolean driveLetterExist(String letter) {
        return this.drive2107325ZepedaGarridos.stream().anyMatch(d -> d.getLetter().equals(letter));
    }
    /*
    =============
    = UTILITIES =
    =============
     */

    /**
     * Muestra en pantalla los usuarios que actualmente se encuentran registrados
     */
    public void listUsers() {
        if (this.user2107325ZepedaGarridos.isEmpty()) {
            java.lang.System.out.println("No hay usuarios registrados en el sistema.");
        } else {
            java.lang.System.out.println("Usuarios registrados:");
            for (User_2107325_ZepedaGarrido user2107325ZepedaGarrido : this.user2107325ZepedaGarridos) {
                java.lang.System.out.println(user2107325ZepedaGarrido.getUserName());
            }
        }
    }

    /*
    =====================
    = CAPA MODIFICADORA =
    =====================
    */

    /**
     * Añade un nuevo disco al sistema de archivos
     *
     * @param letter   letra del drive
     * @param name     nombre del disco
     * @param capacity capacidad del disco
     */
    // RF4: addDrive
    public void addDrive(String letter, String name, int capacity) {
        letter = letter.toUpperCase();
        /*
        Hace que no sea sensible entre carácteres, por ejemplo noté que si agregaba una unidad "C", y luego otra "c",
        me las tomaba como unidades distintas, por lo cual el UpperCase lo soluciona.
        */
        if (!driveLetterExist(letter)) {
            Drive_2107325_ZepedaGarrido drive2107325ZepedaGarrido = new Drive_2107325_ZepedaGarrido(letter, name, capacity);
            this.drive2107325ZepedaGarridos.add(drive2107325ZepedaGarrido);
            java.lang.System.out.println("Unidad '" + letter + "' añadida con éxito.");
        } else {
            java.lang.System.out.println("Error: Ya existe una unidad con la letra '" + letter + "'.");

        }
    }

    /**
     * Registra en el sistema un nuevo usuario
     *
     * @param userName nombre del usuario nuevo
     */
    // RF5: register
    public void register(String userName) {
        User_2107325_ZepedaGarrido user2107325ZepedaGarrido = new User_2107325_ZepedaGarrido(userName);
        if (user2107325ZepedaGarridos.contains(user2107325ZepedaGarrido)) {
            java.lang.System.out.println("El nombre de usuario ya está en uso.");
        } else {
            user2107325ZepedaGarridos.add(user2107325ZepedaGarrido);
            java.lang.System.out.println("Usuario " + userName + " añadido con exito.");
        }
    }

    /**
     * Permite logear a un usuario ya creado en el sistema
     *
     * @param userName nombre del usuario que iniciará sesión
     */
    // RF6: login
    public void login(String userName) {
        if (currentUser2107325ZepedaGarrido != null) {
            java.lang.System.out.println("Un usuario ya está conectado. Por favor, cierra la sesión antes de iniciar una nueva.");
            return;
        }

        for (User_2107325_ZepedaGarrido user2107325ZepedaGarrido : user2107325ZepedaGarridos) {
            if (user2107325ZepedaGarrido.getUserName().equals(userName)) {
                currentUser2107325ZepedaGarrido = user2107325ZepedaGarrido;
                java.lang.System.out.println("¡Inicio de sesión exitoso!");
                return;
            }
        }
        java.lang.System.out.println("Usuario no encontrado.");
    }

    /**
     * Cierra la sesión del usuario que actualmente se encuentra conectado en el sistema
     */
    // RF7: logout
    public void logout() {
        if (currentUser2107325ZepedaGarrido == null) {
            java.lang.System.out.println("No hay usuario conectado.");
            return;
        }
        currentUser2107325ZepedaGarrido = null;
        java.lang.System.out.println("¡Se ha cerrado la sesión correctamente!");
    }

    /**
     * Permite fijar la unidad en la que el usuario realizará acciones.
     *
     * @param letter , letra en donde se trabajará.
     */
    // RF8: switchDrive
    public void switchDrive(String letter) {
        if (currentUser2107325ZepedaGarrido == null) {
            java.lang.System.out.println("No hay un usuario conectado. Inicia sesión para cambiar de unidad." + letter);
            //JOptionPane.showMessageDialog(null, "No hay un usuario conectado. Inicia sesión para cambiar de unidad.");
            return;
        }

        for (Drive_2107325_ZepedaGarrido drive2107325ZepedaGarrido : drive2107325ZepedaGarridos) {
            if (drive2107325ZepedaGarrido.getLetter().equalsIgnoreCase(letter)) {
                // Drive_2107325_ZepedaGarrido que se está trabajando
                activeDrive2107325ZepedaGarrido = drive2107325ZepedaGarrido;
                java.lang.System.out.println("Cambio de unidad exitoso a: " + letter);
                return;
            }
        }
        java.lang.System.out.println("Unidad no encontrada.");
    }

    /**
     * Permite crear un nuevo directorio
     * @param folderName , nombre del directorio
     */
    // RF9: mkdir
    public void mkdir(String folderName) {
        if (currentUser2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe iniciar sesión para crear un directorio.");
            return;
        }
        if (activeDrive2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe seleccionar una unidad para crear un directorio.");
            return;
        }
        Folder_2107325_ZepedaGarrido newFolder2107325ZepedaGarrido = new Folder_2107325_ZepedaGarrido(folderName, currentUser2107325ZepedaGarrido);
        activeDrive2107325ZepedaGarrido.addFolder(newFolder2107325ZepedaGarrido);
        java.lang.System.out.println("Directorio " + folderName + " creado con éxito.");
    }

    /**
     * Cambia el directorio actual según la ruta especificada.
     * @param path la ruta del directorio al que se desea cambiar
     */

    public void cd(String path) {
        if (path.equals("/")) {
            this.currentDirectory2107325ZepedaGarrido = root;
        } else if (path.equals("..")) {
            if (this.currentDirectory2107325ZepedaGarrido.getParent() != null) {
                this.currentDirectory2107325ZepedaGarrido = this.currentDirectory2107325ZepedaGarrido.getParent();
            }
        } else if (!path.contains("/")) {
            Directory_2107325_ZepedaGarrido nextDir = this.currentDirectory2107325ZepedaGarrido.getSubdirectory(path);
            if (nextDir != null) {
                this.currentDirectory2107325ZepedaGarrido = nextDir;
            } else {
                java.lang.System.out.println("El directorio no existe");
            }
        }
    }

    /**
     * Agrega un archivo al sistema de archivos.
     * @param file2107325ZepedaGarrido el archivo a agregar
     */

    public void addFile(File_2107325_ZepedaGarrido file2107325ZepedaGarrido) {
        if (currentUser2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe iniciar sesión para realizar esta acción.");
            return;
        }
        if (activeDrive2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe seleccionar una unidad para realizar esta acción.");
            return;
        }
        String fileName = file2107325ZepedaGarrido.getFileName();
        Folder_2107325_ZepedaGarrido currentFolder2107325ZepedaGarrido = getCurrentFolder();

        // Buscar si ya existe un archivo con el mismo nombre
        java.io.File existingFile = currentFolder2107325ZepedaGarrido.getFileByName(fileName);
        if (existingFile != null) {
            // Reemplazar el tipo y contenido del archivo existente
            existingFile.delete();
            existingFile.getParent();
            java.lang.System.out.println("El archivo '" + fileName + "' ha sido reemplazado.");
        } else {
            // Crear un nuevo objeto de archivo y agregarlo a la carpeta actual
            java.io.File newFile = new java.io.File(fileName);
            currentFolder2107325ZepedaGarrido.addFile(newFile);
            java.lang.System.out.println("El archivo '" + fileName + "' ha sido creado correctamente.");
        }
    }

    /**
     * Elimina un archivo del sistema de archivos.
     * @param fileName el nombre del archivo a eliminar
     */
    public void del(String fileName) {
        // Comprueba si está logeado
        if (currentUser2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe iniciar sesión para eliminar archivos.");
            return;
        }

        // Comprueba si existe un Drive_2107325_ZepedaGarrido
        if (activeDrive2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe seleccionar una unidad para eliminar archivos.");
            return;
        }

        // Comprueba si hay una carpeta actual seleccionada
        if (currentDirectory2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe seleccionar una carpeta para eliminar archivos.");
            return;
        }

        // Busca el archivo por su nombre y lo elimina
        java.io.File fileToDelete = currentFolder2107325ZepedaGarrido.getFileByName(fileName);
        if (fileToDelete == null) {
            java.lang.System.out.println("No se encontró el archivo '" + fileName + "'.");
            return;
        }

        currentFolder2107325ZepedaGarrido.deleteFile(fileToDelete);
        java.lang.System.out.println("El archivo '" + fileName + "' ha sido eliminado.");
    }

    /**
     * Formatea una unidad del sistema de archivos.
     * @param driveLetter Letra de la unidad a formatear.
     * @param newDriveName Nuevo nombre para la unidad formateada.
     */
    public void format(String driveLetter, String newDriveName) {
        // Comprobar si está logeado
        if (currentUser2107325ZepedaGarrido == null) {
            java.lang.System.out.println("Debe iniciar sesión para formatear una unidad.");
            return;
        }

        // Buscar la unidad con la letra especificada
        Drive_2107325_ZepedaGarrido drive2107325ZepedaGarrido = activeDrive2107325ZepedaGarrido.getDriveByLetter();
        if (drive2107325ZepedaGarrido == null) {
            java.lang.System.out.println("No se encontró una unidad con la letra " + driveLetter);
            return;
        }

        // Formatear la unidad (borrar su contenido y actualizar el nombre)
        drive2107325ZepedaGarrido.clearContent();
        drive2107325ZepedaGarrido.setName(newDriveName);

        java.lang.System.out.println("La unidad " + driveLetter + " ha sido formateada con éxito.");
    }

}