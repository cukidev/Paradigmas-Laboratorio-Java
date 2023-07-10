package poo;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    /*
    =============
    = ATRIBUTOS =
    =============
    */

    private String name;
    private String createdBy;
    private LocalDateTime creationDate;
    private LocalDateTime lastModified;
    private List<Folder> subFolders;
    private List<File> files;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    public Folder(String name, User createdBy) {
        this.name = name;
        this.createdBy = String.valueOf(createdBy);
        this.creationDate = LocalDateTime.now();
        this.lastModified = LocalDateTime.now();
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }


}