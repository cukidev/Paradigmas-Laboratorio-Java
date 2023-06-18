package poo;

public class Drive {
    private final String letter;
    private final String name;
    private final int capacity;

    public Drive(String letter, String name, int capacity) {
        this.letter = letter;
        this.name = name;
        this.capacity = capacity;
    }

    // Getters y setters

    public String getLetter() {
        return letter;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
