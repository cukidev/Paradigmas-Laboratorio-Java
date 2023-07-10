package poo;

public interface FileSystem {
    void addDrive(String letter, String name, int capacity);
    void register(String userName);
    void login(String userName);
    void logout();
    void switchDrive(String letter);
    void mkdir(String folderName);
    void cd(String path);

}