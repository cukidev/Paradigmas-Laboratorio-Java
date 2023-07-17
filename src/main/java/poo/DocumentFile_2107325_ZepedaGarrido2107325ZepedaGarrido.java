package poo;

/**
 * Clase que representa un documento de texto en el sistema de archivos.
 * Hereda de la clase File_2107325_ZepedaGarrido.
 */
public class DocumentFile_2107325_ZepedaGarrido2107325ZepedaGarrido extends File_2107325_ZepedaGarrido {

    /*
    =============
    = ATRIBUTOS =
    =============
    */
    /**
     * Formato del documento
     */
    private String format;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     * Crea un nuevo archivo de documento.
     * @param name el nombre del archivo
     * @param createdBy el usuario que lo creó
     * @param securityAttributes los atributos de seguridad del archivo
     * @param format formato del archivo
     */
    public DocumentFile_2107325_ZepedaGarrido2107325ZepedaGarrido(String name, User_2107325_ZepedaGarrido createdBy, String securityAttributes, String format) {
        super(name, createdBy, securityAttributes, format);
        this.format = format;
    }
    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */

    /**
     * Obtiene el formato del archivo del documento
     * @return formato del archivo
     */

    public String getFormat() {
        return format;
    }

    /*
    =====================
    = CAPA MODIFICADORA =
    =====================
    */

    /**
     * Establece el formato del archivo del documento
     * @param format nuevo formato del archivo.
     */

    public void setFormat(String format) {
        this.format = format;
    }

}