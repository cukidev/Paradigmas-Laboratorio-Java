package poo;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    private Directory parent;
    private Map<String, Directory> subdirectories;
    private List<File> files;

    public Directory(Directory parent, String name) {
        super(name, null, null, "");
        this.parent = parent;
        this.subdirectories = new HashMap<>();
        this.files = new ArrayList<>();
    }

    public Directory getParent() {
        return parent;
    }

    public Directory getSubdirectory(String name) {
        return subdirectories.get(name);
    }

    /**
     * Método para crear subdirectorios
     * @param directory directorios
     */
    public void addSubdirectory(Directory directory) {
        subdirectories.put(directory.getFileName(), directory);
    }
}
