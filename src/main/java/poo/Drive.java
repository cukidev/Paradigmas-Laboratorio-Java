package poo;

/**
 * Clase que simula una Unidad de Disco dentro de un Sistema de archivos
 * @author Paloma Zepeda Garrido
 */
public class Drive {
    /*
    =============
    = ATRIBUTOS =
    =============
    */
    private final String letter;
    private final String name;
    private final int capacity;

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
    public Drive(String letter, String name, int capacity) {
        this.letter = letter;
        this.name = name;
        this.capacity = capacity;
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
}
