package poo;

public class DocumentFile extends File {
    private String format;

    public DocumentFile(String name, User createdBy, String securityAttributes, String format) {
        super(name, createdBy, securityAttributes);
        this.format = format;
    }

    // Getter y setter para el formato
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}