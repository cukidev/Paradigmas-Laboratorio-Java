package poo;

import java.time.LocalDateTime;

public class File {
    private String fileName;
    private User createdBy;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private String securityAttributes;
    private int size; // Tamaño del archivo en bytes
    private String fileType; // Extensión del archivo
    private String content;

    public File(String fileName, User createdBy, String securityAttributes, String content) {
        this.fileName = fileName;
        this.createdBy = createdBy;
        this.creationDate = LocalDateTime.now();
        this.lastModifiedDate = LocalDateTime.now();
        this.securityAttributes = securityAttributes;
        this.fileType = fileType;
        this.size = 0;
        this.content = content;

    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.size = content.length();
        this.lastModifiedDate = LocalDateTime.now();
    }

    // Método auxiliar para determinar el tipo de archivo a partir de la extensión
    private String determineFileType(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }
        return ""; // Extensión desconocida
    }


    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getSecurityAttributes() {
        return securityAttributes;
    }

    public void setSecurityAttributes(String securityAttributes) {
        this.securityAttributes = securityAttributes;
    }
}
