/*


Corresponde a la interfaz futura que se está creando, por el momento estará comentada puesto que aún se tienen que
hacer modificaciones, pero se está creanado a la par de la implementación, para que al final cueste menos.

package poo;

import javax.swing.*;
import java.awt.*;

public class Menu {
    private FileSystem fileSystem;

    public Menu() {
        displayMainMenu();
    }

    public void displayMainMenu() {
        JFrame mainFrame = new JFrame("Manipulador de Sistema de Archivos");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(5,1));

        JButton createFileSystemButton = new JButton("Crear un Sistema de Archivos");
        JButton manageDriveButton = new JButton("Gestor de Unidades");
        JButton manageUserButton = new JButton("Gestor de Usuarios");
        JButton exitButton = new JButton("Salir");

        createFileSystemButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(mainFrame, "Ingrese el nombre del Sistema de Archivos:");
            fileSystem = new FileSystem(name);
            JOptionPane.showMessageDialog(mainFrame, "Sistema de archivos '" + name + "' creado exitosamente.");
        });

        manageDriveButton.addActionListener(e -> {
            if (fileSystem != null) {
                displayDriveMenu();
            } else {
                JOptionPane.showMessageDialog(mainFrame, "Primero debe crear un sistema de archivos.");
            }
        });

        manageUserButton.addActionListener(e -> {
            if (fileSystem != null) {
                displayUserMenu();
            } else {
                JOptionPane.showMessageDialog(mainFrame, "Primero debe crear un sistema de archivos.");
            }
        });

        exitButton.addActionListener(e -> System.exit(0));

        mainFrame.add(createFileSystemButton);
        mainFrame.add(manageDriveButton);
        mainFrame.add(manageUserButton);
        mainFrame.add(exitButton);

        mainFrame.setVisible(true);
    }

    public void displayDriveMenu() {
        JFrame driveFrame = new JFrame("Gestor de Unidades");
        driveFrame.setSize(400, 300);
        driveFrame.setLayout(new GridLayout(5, 1));
        JButton addDriveButton = new JButton("Añadir una Unidad al Sistema de Archivos");
        JButton viewSystemButton = new JButton("Visualizar Sistema de Archivos");
        JButton selectDriveButton = new JButton("Seleccionar unidad de trabajo");
        JButton returnButton = new JButton("Volver al menú principal");

        addDriveButton.addActionListener(e -> {
            if (fileSystem != null) {
                String letter = JOptionPane.showInputDialog(driveFrame, "Ingrese la letra de la Unidad:");
                String driveName = JOptionPane.showInputDialog(driveFrame, "Ingrese el nombre de la Unidad:");
                String capacityStr = JOptionPane.showInputDialog(driveFrame, "Ingrese la capacidad de la Unidad:");
                int capacity = Integer.parseInt(capacityStr);
                fileSystem.addDrive(letter, driveName, capacity);
            } else {
                JOptionPane.showMessageDialog(driveFrame, "Primero debe crear un sistema de archivos.");
            }
        });

        viewSystemButton.addActionListener(e -> {
            if (fileSystem != null) {
                StringBuilder message = new StringBuilder("Nombre del Sistema: " + fileSystem.getName() + "\n");
                message.append("Fecha de Creación: ").append(fileSystem.getCreationDate()).append("\n");
                message.append("Unidades:\n");
                for (Drive drive : fileSystem.getDrives()) {
                    message.append("  Letra: ").append(drive.getLetter()).append(", Nombre: ").append(drive.getName()).append(", Capacidad: ").append(drive.getCapacity()).append("\n");
                }
                JOptionPane.showMessageDialog(driveFrame, message.toString());
            } else {
                JOptionPane.showMessageDialog(driveFrame, "No se ha creado ningún sistema de archivos aún.");
            }
        });

        selectDriveButton.addActionListener(e -> {
            if (fileSystem != null) {
                String letter = JOptionPane.showInputDialog(driveFrame, "Introduzca la letra de la unidad en la que desea trabajar:");
                fileSystem.switchDrive(letter);
            } else {
                JOptionPane.showMessageDialog(driveFrame, "Primero debe crear un sistema de archivos.");
            }
        });

        returnButton.addActionListener(e -> {
            driveFrame.dispose();
            displayMainMenu();
        });

        driveFrame.add(addDriveButton);
        driveFrame.add(viewSystemButton);
        driveFrame.add(selectDriveButton);
        driveFrame.add(returnButton);

        driveFrame.setVisible(true);
    }


    public void displayUserMenu() {
        JFrame userFrame = new JFrame("Gestor de Usuarios");
        userFrame.setSize(400, 300);
        userFrame.setLayout(new GridLayout(5, 1));
        JButton addUserButton = new JButton("Registrar un nuevo usuario");
        JButton loginUserButton = new JButton("Iniciar Sesión");
        JButton logoutUserButton = new JButton("Cerrar Sesión");
        JButton viewRegisterUsersButton = new JButton("Visualizar usuarios registrados");
        JButton returnButton = new JButton("Volver al menú principal");

        addUserButton.addActionListener(e -> {
            if (fileSystem != null) {
                String userName = JOptionPane.showInputDialog(userFrame, "Ingrese el nombre de usuario: ");
                if (userName != null) {
                    fileSystem.register(userName);
                    JOptionPane.showMessageDialog(userFrame, "Usuario registrado exitosamente.");
                }
            }
        });

        loginUserButton.addActionListener(e -> {
            if (fileSystem != null) {
                String userName = JOptionPane.showInputDialog(userFrame, "");
                if (userName != null){
                    fileSystem.login(userName);
                    JOptionPane.showMessageDialog(userFrame, "Logeado con exito.");

                }




            }

        });

        userFrame.add(addUserButton);
        userFrame.add(loginUserButton);
        userFrame.setVisible(true);

    }
}

*/