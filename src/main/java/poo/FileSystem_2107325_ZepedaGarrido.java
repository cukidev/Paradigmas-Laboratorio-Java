package poo;

/**
 * Interfaz que define las operaciones disponibles en un sistema de archivos.
 * Permite agregar unidades de disco, registrar y gestionar usuarios, cambiar entre unidades de disco,
 * crear directorios, navegar por la estructura de carpetas, agregar archivos y eliminar archivos.
 * Todas las operaciones se realizan a través de métodos sin retorno (void).
 * Las implementaciones de esta interfaz deben proporcionar la lógica necesaria para ejecutar
 * cada operación en el contexto del sistema de archivos correspondiente.
 * Las implementaciones pueden tener requisitos y prerrequisitos específicos para cada operación.
 * Esta interfaz proporciona una forma estandarizada de interactuar con un sistema de archivos,
 * independientemente de su implementación subyacente.
 */
public interface FileSystem_2107325_ZepedaGarrido {

    /**
     * Agrega una unidad de disco al sistema de archivos.
     * @param letter   la letra asignada a la unidad de disco
     * @param name     el nombre de la unidad de disco
     * @param capacity la capacidad de almacenamiento de la unidad de disco
     */
    void addDrive(String letter, String name, int capacity);

    /**
     * Registra un nuevo usuario en el sistema de archivos.
     * @param userName el nombre del usuario a registrar
     */
    void register(String userName);

    /**
     * Inicia sesión con el nombre de usuario especificado.
     * @param userName el nombre del usuario para iniciar sesión
     */
    void login(String userName);

    /**
     * Cierra la sesión actual.
     */
    void logout();

    /**
     * Cambia la unidad de disco activa en el sistema de archivos.
     * @param letter la letra de la unidad de disco a cambiar
     */
    void switchDrive(String letter);

    /**
     * Crea un nuevo directorio en la ubicación actual.
     * @param folderName el nombre del directorio a crear
     */
    void mkdir(String folderName);

    /**
     * Cambia el directorio actual a la ubicación especificada.
     * @param path la ruta del directorio al que se desea cambiar
     */
    void cd(String path);

    /**
     * Agrega un archivo al directorio actual.
     * @param file2107325ZepedaGarrido el archivo a agregar
     */
    void addFile(File_2107325_ZepedaGarrido file2107325ZepedaGarrido);

    /**
     * Elimina un archivo del directorio actual o del sistema de archivos, según el nombre especificado.
     * @param fileName el nombre del archivo a eliminar
     */
    void del(String fileName);
}
