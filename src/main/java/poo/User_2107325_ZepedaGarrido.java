package poo;

/*
==============
= BIBLIOTECA =
==============
*/

import java.util.Objects;

/**
 * Clase que simula los Usuarios dentro de un Sistema de archivos
 * @author Paloma Zepeda Garrido
 */
public class User_2107325_ZepedaGarrido {
    /*
    =============
    = ATRIBUTOS =
    =============
    */

    /**
     * Nombre de usuario
     */
    private final String userName;

    /*
    =====================
    = CAPA CONSTRUCTORA =
    =====================
    */

    /**
     * Constructor que recibe un nombre de usuario
     * @param userName nombre de usuario
     */
    public User_2107325_ZepedaGarrido(String userName) {
        this.userName = userName;
    }

    /*
    ==================
    = CAPA SELECTORA =
    ==================
     */

    /**
     * Método que devuelve el userName
     * @return nombre de usuario
     */
    public String getUserName() {
        return userName;
    }

    /*
    =============
    = UTILITIES =
    =============
    */

    /**
     * Compara los usuarios para saber si son iguales
     * @param obj a comparar
     * @return true si los objetos son iguales, false si no
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User_2107325_ZepedaGarrido user2107325ZepedaGarrido = (User_2107325_ZepedaGarrido) obj;
        return userName.equals(user2107325ZepedaGarrido.userName);
    }

    /**
     * Genera un código Hash para un usuario, básicamente genera una ID por usuario
     * @return una ID por usuario
     */
    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}
