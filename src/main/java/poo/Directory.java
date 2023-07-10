package poo;

import java.util.HashMap;
import java.util.Map;

public class Directory extends File {
    private Directory parent;
    private Map<String, Directory> subdirectories;

    public Directory(Directory parent, String name) {
        super(name, null, null);  // Modifica esto de acuerdo a cómo tienes definida tu clase File
        this.parent = parent;
        this.subdirectories = new HashMap<>();
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
        subdirectories.put(directory.getName(), directory);
    }
}
