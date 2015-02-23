/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unsch.si2.controlador;

import edu.unsch.si2.modelo.LoginM;
import edu.unsch.si2.vista.LoginV;
import edu.unsch.si2.vista.LoginV;



/**
 *
 * @author adm3c
 */
public class LoginC {

        LoginV view;
        LoginM model;

        
        public LoginC(LoginV view, LoginM model) {
                this.view = view;
                this.model = model;
        }
        
        public void iniciarSesion(){
                System.out.println("uss: "+model.getNombreUsuario());
                System.out.println("pass: "+model.getContrasenia());
        }
        public void salir(){
        this.view.dispose();
        }
}
