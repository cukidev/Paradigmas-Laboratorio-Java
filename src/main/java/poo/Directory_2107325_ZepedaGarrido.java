package poo;

/*
==============
= BIBLIOTECA =
==============
*/

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 Clase que representa un archivo de documento en el sistema de archivos.
 Hereda de la clase File_2107325_ZepedaGarrido.
 */
public class Directory_2107325_ZepedaGarrido extends File_2107325_ZepedaGarrido {

    /*
    =============
    = ATRIBUTOS =
    =============
    */
    /**
     * Directorio padre
     */
    private Directory_2107325_ZepedaGarrido parent;
    /**
     * Mapa que almacena las subcarpetas de la carpeta actual
     */
    private Map<String, Directory_2107325_ZepedaGarrido> subdirectories;
    /**
     * Lista de carpetas
     */
    private List<File_2107325_ZepedaGarrido> file2107325ZepedaGarridos;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     * Crea un nuevo directorio
     * @param parent directorio padre
     * @param name nombre del directorio
     */
    public Directory_2107325_ZepedaGarrido(Directory_2107325_ZepedaGarrido parent, String name) {
        super(name, null, null, "");
        this.parent = parent;
        this.subdirectories = new HashMap<>();
        this.file2107325ZepedaGarridos = new ArrayList<>();
    }

    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */

    /**
     * Obtiene el directorio padre
     * @return directorio padre
     */
    public Directory_2107325_ZepedaGarrido getParent() {
        return parent;
    }

    /**
     * Obtiene el subdirectorio padre
     * @param name el nombre del subdirectorio
     * @return el subdirectorio correspondiente al nombre
     */
    public Directory_2107325_ZepedaGarrido getSubdirectory(String name) {
        return subdirectories.get(name);
    }

    /*
    =====================
    = CAPA MODIFICADORA =
    =====================
    */


    /**
     * Método que agrega un subdirectorio al directorio actual
     * @param directory2107325ZepedaGarrido el directorio a agregar
     */
    public void addSubdirectory(Directory_2107325_ZepedaGarrido directory2107325ZepedaGarrido) {
        subdirectories.put(directory2107325ZepedaGarrido.getFileName(), directory2107325ZepedaGarrido);
    }
}
