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
public class FileSystem {
    /*
    =============
    = ATRIBUTOS =
    =============
    */
    private final String name; // Nombre del sistema de archivos
    private final LocalDate creationDate; // Fecha de creación
    private final List<Drive> drives; // Lista de Drives
    private final Set<User> users; // Conjunto de usuarios
    private User currentUser = null; // Usuario que está conectado actualmente

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
    public FileSystem(String name) {
        this.name = name; // nombre del sistema
        this.creationDate = LocalDate.now(); // fecha de creación
        this.drives = new ArrayList<>(); // drives
        this.users = new HashSet<>(); //usuarios
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
    public List<Drive> getDrives() {
        // retorna una copia de los drives actuales
        return new ArrayList<>(this.drives);
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
        return this.drives.stream().anyMatch(d -> d.getLetter().equals(letter));
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
        if (this.users.isEmpty()) {
            System.out.println("No hay usuarios registrados en el sistema.");
        } else {
            System.out.println("Usuarios registrados:");
            for (User user : this.users) {
                System.out.println(user.getUserName());
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
            Drive drive = new Drive(letter, name, capacity);
            this.drives.add(drive);
            System.out.println("Unidad '" + letter + "' añadida con éxito.");
        } else {
            System.out.println("Error: Ya existe una unidad con la letra '" + letter + "'.");

        }
    }

    /**
     * Registra en el sistema un nuevo usuario
     *
     * @param userName nombre del usuario nuevo
     */
    // RF5: register
    public void register(String userName) {
        User user = new User(userName);
        if (users.contains(user)) {
            System.out.println("El nombre de usuario ya está en uso.");
            //JOptionPane.showMessageDialog(null, "El nombre de usuario ya esta en uso.");
        } else {
            users.add(user);
            System.out.println("Usuario " + userName + "anadido con exito.");
            //JOptionPane.showMessageDialog(null, "Usuario " + userName + "anadido con exito.");
        }
    }

    /**
     * Permite logear a un usuario ya creado en el sistema
     *
     * @param userName nombre del usuario que iniciará sesión
     */
    // RF6: login
    public void login(String userName) {
        if (currentUser != null) {
            System.out.println("Un usuario ya está conectado. Por favor, cierra la sesión antes de iniciar una nueva.");
            return;
        }

        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                currentUser = user;
                System.out.println("¡Inicio de sesión exitoso!");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    /**
     * Cierra la sesión del usuario que actualmente se encuentra conectado en el sistema
     */
    // RF7: logout
    public void logout() {
        if (currentUser == null) {
            System.out.println("No hay usuario conectado.");
            return;
        }
        currentUser = null;
        System.out.println("¡Se ha cerrado la sesión correctamente!");
    }

    /**
     * Permite fijar la unidad en la que el usuario realizará acciones.
     *
     * @param letter , letra en donde se trabajará.
     */
    // RF8: switchDrive
    public void switchDrive(String letter) {
        if (currentUser == null) {
            System.out.println("No hay un usuario conectado. Inicia sesión para cambiar de unidad." + letter);
            //JOptionPane.showMessageDialog(null, "No hay un usuario conectado. Inicia sesión para cambiar de unidad.");
            return;
        }

        for (Drive drive : drives) {
            if (drive.getLetter().equalsIgnoreCase(letter)) {
                // Drive que se está trabajando
                System.out.println("Cambio de unidad exitoso a: " + letter);
                return;
            }
        }
        System.out.println("Unidad no encontrada.");
    }

    // RF9: mkdir


}
