/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unsch.si2.modelo;

import java.io.Serializable;

/**
 *
 * @author adm3c
 */
public class LoginM implements Serializable {

        private String nombreUsuario;
        private String contrasenia;
      
      

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }
}
