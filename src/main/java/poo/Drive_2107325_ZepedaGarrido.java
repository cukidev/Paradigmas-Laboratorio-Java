package poo;

/*
==============
= BIBLIOTECA =
==============
*/
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que simula una Unidad de Disco dentro de un Sistema de archivos
 * @author Paloma Zepeda Garrido
 */
public class Drive_2107325_ZepedaGarrido {
    /*
    =============
    = ATRIBUTOS =
    =============
    */
    /**
     * Letra de almacenamiento del Drive_2107325_ZepedaGarrido
     */
    private final String letter;
    /**
     * Nombre del Drive_2107325_ZepedaGarrido
     */
    private String name;
    /**
     * Capacidad del drive
     */
    private final int capacity;
    /**
     * Lista de carpetas formadas en del Disco
     */
    private List<Folder_2107325_ZepedaGarrido> folder2107325ZepedaGarridos = new ArrayList<>();
    /**
     * Raíz de la carpeta dentro de un Drive_2107325_ZepedaGarrido
     */
    private Drive_2107325_ZepedaGarrido rootFolder;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     * Constructor que recibe un disco en el sistema de archivos
     * @param letter letra asignada del drive
     * @param name nombre del drive
     * @param capacity capacidad de almacenamiento del drive
     */
    public Drive_2107325_ZepedaGarrido(String letter, String name, int capacity) {
        this.letter = letter;
        this.name = name;
        this.capacity = capacity;
        this.folder2107325ZepedaGarridos = new ArrayList<>();
    }

    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */

    /**
     * Método que devuelve la letra del disco
     * @return letra de la unidad del drive
     */
    public String getLetter() {
        return letter;
    }

    /**
     * Método que devuelve el nombre del disco
     * @return nombre del drive
     */
    public String getName() {
        return name;
    }

    /**
     * Método que devuelve la capacidad del disco
     * @return almacenamiento del drive
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Obtiene el drive correspondiente a una letra especificada
     * @return el drive correspondiente a la letra especificada, o null si no se encuentra
     */

    public Drive_2107325_ZepedaGarrido getDriveByLetter() {
        if (this.letter.equalsIgnoreCase(letter)) {
            return rootFolder;
        }
        return null;
    }

    /**
     * Agrega una carpeta al drive
     * @param folder2107325ZepedaGarrido la carpeta a agregar
     */

    public void addFolder(Folder_2107325_ZepedaGarrido folder2107325ZepedaGarrido) {
        this.folder2107325ZepedaGarridos.add(folder2107325ZepedaGarrido);
    }

    /**
     * Obtiene la lista de carpetas en el drive
     * @return la lista de carpetas en el drive
     */
    public List<Folder_2107325_ZepedaGarrido> getFolders() {
        return folder2107325ZepedaGarridos;
    }

    /**
     * Establece el nombre del drive
     * @param newDriveName el nuevo nombre del drive
     */
    public void setName(String newDriveName) {
        name = newDriveName;
    }

    /**
     * Elimina todo el contenido del drive.
     * Esto borra todas las carpetas y archivos dentro del drive
     */
    public void clearContent() {
        rootFolder.clearContent();
    }
}