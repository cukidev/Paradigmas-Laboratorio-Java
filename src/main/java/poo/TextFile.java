package poo;

public class TextFile extends File{
    private String content;

    public TextFile(String name, User createdBy, String securityAttributes) {
        super(name, createdBy, securityAttributes);
    }

    // Getter y setter para el contenido
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Otros métodos específicos para los archivos de texto
    public void appendContent(String text) {
        this.content += text;
    }
}