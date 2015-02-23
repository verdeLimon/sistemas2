/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unsch.si2.dominio;

/**
 *
 * @author Wilber
 */
public class Usuario {
  
    private int id;
    private String nombreUsuario;
    private String contrasenia;
    private int persona_id;

    public Usuario(int id, String usuario, String contrasenia, int persona_id) {
        this.id = id;
        this.nombreUsuario = usuario;
        this.contrasenia = contrasenia;
        this.persona_id = persona_id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the NombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param usuario the NombreUsuario to set
     */
    public void setNombreUsuario(String usuario) {
        this.nombreUsuario = usuario;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * @return the persona_id
     */
    public int getPersona_id() {
        return persona_id;
    }

    /**
     * @param persona_id the persona_id to set
     */
    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    
}
