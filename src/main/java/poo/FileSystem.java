package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private final String name;
    private final LocalDate creationDate;

    private final List<Drive> drives;

    public FileSystem(String name) {
        this.name = name;
        this.creationDate = LocalDate.now();
        this.drives = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public List<Drive> getDrives() {
        // retorna una copia de los drives actuales
        return new ArrayList<>(this.drives);
    }

    public void addDrive(String letter, String name, int capacity){
        letter = letter.toUpperCase();
        /*
        Hace que no sea sensible entre carácteres, por ejemplo noté que si agregaba una unidad "C", y luego otra "c",
        me las tomaba como unidades distintas, por lo cual el UpperCase lo soluciona.
        */
        if (!driveLetterExist(letter)){
            Drive drive  = new Drive(letter, name, capacity);
            this.drives.add(drive);
            System.out.println("Unidad '" + letter + "' añadida con éxito.");
        } else {
            System.out.println("Error: Ya existe una unidad con la letra '" + letter + "'.");

        }
    }

    private boolean driveLetterExist(String letter){
        return this.drives.stream().anyMatch(d -> d.getLetter().equals(letter));
    }

}
