package poo;

/*
==============
= BIBLIOTECA =
==============
*/
import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una carpeta en un sistema de archivos.
 * Contiene subcarpetas y archivos como contenido.
 */
public class Folder_2107325_ZepedaGarrido {

    /*
    =============
    = ATRIBUTOS =
    =============
    */
    /**
     * Nombre de la carpeta
     */
    private String name;
    /**
     * Usuario que creó la carpeta
     */
    private String createdBy;
    /**
     * Fecha de creación
     */
    private LocalDateTime creationDate;
    /**
     * Fecha de última modificación
     */
    private LocalDateTime lastModified;
    /**
     * Lista de carpetas
     */
    private List<Folder_2107325_ZepedaGarrido> subFolder2107325ZepedaGarridos;
    /**
     * Archivos
     */
    private List<File> files;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     * Crea una nueva carpeta con el nombre especificado y el usuario que la creó.
     * @param name       el nombre de la carpeta
     * @param createdBy  el usuario que creó la carpeta
     */
    public Folder_2107325_ZepedaGarrido(String name, User_2107325_ZepedaGarrido createdBy) {
        this.name = name;
        this.createdBy = String.valueOf(createdBy);
        this.creationDate = LocalDateTime.now();
        this.lastModified = LocalDateTime.now();
        this.subFolder2107325ZepedaGarridos = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */

    /**
     * Devuelve el archivo con el nombre especificado, buscándolo en esta carpeta y sus subcarpetas.
     * Si no se encuentra el archivo, devuelve null.
     * @param fileName el nombre del archivo a buscar
     * @return el archivo con el nombre especificado, o null si no se encuentra
     */
    public File getFileByName(String fileName) {
        for (File file : files) {
            if (file.getName().equals(fileName)) {
                return file;
            }
        }
        for (Folder_2107325_ZepedaGarrido subFolder2107325ZepedaGarrido : subFolder2107325ZepedaGarridos) {
            File file = subFolder2107325ZepedaGarrido.getFileByName(fileName);
            if (file != null) {
                return file;
            }
        }
        return null;
    }

    /*
    =====================
    = CAPA MODIFICADORA =
    =====================
     */

    /**
     * Agrega un archivo a la carpeta.
     * @param newFile el archivo a agregar
     */
    public void addFile(File newFile) {
        files.add(newFile);
    }

    /**
     * Elimina un archivo de la carpeta.
     * @param fileToDelete el archivo a eliminar
     */
    public void deleteFile(File fileToDelete) {
        files.remove(fileToDelete);
    }

    /**
     * Elimina todo el contenido de la carpeta, incluyendo subcarpetas y archivos.
     */
    public void clearContent() {
        subFolder2107325ZepedaGarridos.clear();
        files.clear();
    }
}
