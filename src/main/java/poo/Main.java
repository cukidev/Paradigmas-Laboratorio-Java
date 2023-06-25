package poo;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.displayMainMenu();
        }
    }
}


  /*

    Menú con interfaz

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Menu::new);
    }
    */