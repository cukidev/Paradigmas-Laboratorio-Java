package poo;

/*
==============
= BIBLIOTECA =
==============
*/
import java.time.LocalDateTime;

/**
 * Clase que representa un archivo en el sistema de archivos.
 * Contiene información sobre el nombre, creador, fechas de creación y modificación,
 * atributos de seguridad, tamaño, tipo y contenido del archivo.
 *
 * @author
 */
public class File_2107325_ZepedaGarrido {

    /*
    =============
    = ATRIBUTOS =
    =============
    */
    /**
     * Nombre del archivo
     */
    private String fileName;
    /**
     * Usuario creador
     */
    private User_2107325_ZepedaGarrido createdBy;
    /**
     * Fecha de creación
     */
    private LocalDateTime creationDate;
    /**
     * última modificación
     */
    private LocalDateTime lastModifiedDate;
    /**
     * Atributos de seguridad
     */
    private String securityAttributes;
    /**
     * Tamaño del archivo en bytes
     */
    private int size;
    /**
     * Extensión del archivo
     */
    private String fileType;
    /**
     * Contenido
     */
    private String content;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */
    /**
     * Crea un nuevo archivo con el nombre, creador, atributos de seguridad y contenido especificados.
     *
     * @param fileName           el nombre del archivo
     * @param createdBy          el usuario creador del archivo
     * @param securityAttributes los atributos de seguridad del archivo
     * @param content            el contenido del archivo
     */
    public File_2107325_ZepedaGarrido(String fileName, User_2107325_ZepedaGarrido createdBy, String securityAttributes, String content) {
        this.fileName = fileName;
        this.createdBy = createdBy;
        this.creationDate = LocalDateTime.now();
        this.lastModifiedDate = LocalDateTime.now();
        this.securityAttributes = securityAttributes;
        this.fileType = determineFileType(fileName);
        this.size = 0;
        this.content = content;

    }

    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */

    /**
     * Obtiene el nombre del archivo.
     *
     * @return el nombre del archivo
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Obtiene el tipo de archivo.
     *
     * @return el tipo de archivo
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Obtiene el contenido del archivo.
     *
     * @return el contenido del archivo
     */
    public String getContent() {
        return content;
    }

    /**
     * Obtiene el usuario creador del archivo.
     *
     * @return el usuario creador del archivo
     */
    public User_2107325_ZepedaGarrido getCreatedBy() {
        return createdBy;
    }

    /**
     * Obtiene los atributos de seguridad del archivo.
     *
     * @return los atributos de seguridad del archivo
     */
    public String getSecurityAttributes() {
        return securityAttributes;
    }

    /*
    =====================
    = CAPA MODIFICADORA =
    =====================
    */
    /**
     * Establece el tipo de archivo.
     *
     * @param fileType el nuevo tipo de archivo
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * Establece el contenido del archivo y actualiza el tamaño y la fecha de modificación.
     *
     * @param content el nuevo contenido del archivo
     */
    public void setContent(String content) {
        this.content = content;
        this.size = content.length();
        this.lastModifiedDate = LocalDateTime.now();
    }

    /**
     * Establece el usuario que crea el archivo.
     *
     * @param createdBy el nuevo usuario creador
     */
    public void setCreatedBy(User_2107325_ZepedaGarrido createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Establece los atributos de seguridad del archivo.
     *
     * @param securityAttributes los nuevos atributos de seguridad del archivo
     */
    public void setSecurityAttributes(String securityAttributes) {
        this.securityAttributes = securityAttributes;
    }

    /*
    =============
    = UTILITIES =
    =============
     */

    /**
     * Método auxiliar para determinar el tipo de archivo a partir de la extensión del nombre.
     *
     * @param fileName el nombre del archivo
     * @return el tipo de archivo basado en la extensión
     */
    private String determineFileType(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }
        return ""; // Extensión desconocida
    }

}
