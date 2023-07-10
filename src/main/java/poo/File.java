package poo;

import java.time.LocalDateTime;

public class File {
    private String name;
    private User createdBy;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private String securityAttributes;
    private int size; // Tamaño del archivo en bytes
    private String extension; // Extensión del archivo

    public File(String name, User createdBy, String securityAttributes) {
        this.name = name;
        this.createdBy = createdBy;
        this.creationDate = LocalDateTime.now();
        this.lastModifiedDate = LocalDateTime.now();
        this.securityAttributes = securityAttributes;
        this.extension = extension;
        this.size = 0;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public String getSecurityAttributes() {
        return securityAttributes;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void updateLastModifiedDate() {
        this.lastModifiedDate = LocalDateTime.now();
    }

    public void increaseSize(int amount) {
        this.size += amount;
    }

    public void decreaseSize(int amount) {
        this.size -= amount;
        if (this.size < 0) {
            this.size = 0;
        }
    }

    public void rename(String newName) {
        this.name = newName;
    }
}
