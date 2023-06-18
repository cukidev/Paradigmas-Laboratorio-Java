package poo;

import java.time.LocalDate;

public class FileSystem {
    private final String name;
    private final LocalDate creationDate;

    public FileSystem(String name) {
        this.name = name;
        this.creationDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }


}
