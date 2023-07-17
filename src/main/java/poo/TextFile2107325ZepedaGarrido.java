package poo;

/**
 * Clase que representa un archivo de texto en el sistema de archivos.
 * Hereda de la clase File_2107325_ZepedaGarrido.
 */
public class TextFile2107325ZepedaGarrido extends File_2107325_ZepedaGarrido {

    /*
    =============
    = ATRIBUTOS =
    =============
    */
    /**
     * Contenido del archivo de texto
     */
    private String content;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     Crea un nuevo archivo de texto.
     @param name nombre del archivo
     @param createdBy usuario que creó el archivo
     @param securityAttributes atributos de seguridad del archivo
     @param content contenido del archivo
     */
    public TextFile2107325ZepedaGarrido(String name, User_2107325_ZepedaGarrido createdBy, String securityAttributes, String content) {
        super(name, createdBy, securityAttributes, content);
    }

    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */
    /**
     Obtiene el contenido del archivo de texto.
     @return contenido del archivo de texto
     */
    public String getContent() {
        return content;
    }

    /*
    =====================
    = CAPA MODIFICADORA =
    =====================
    */
    /**
     Establece el contenido del archivo de texto.
     @param content nuevo contenido del archivo de texto
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     Agrega texto al contenido existente del archivo de texto.
     @param text texto a agregar
     */
    public void appendContent(String text) {
        this.content += text;
    }
}