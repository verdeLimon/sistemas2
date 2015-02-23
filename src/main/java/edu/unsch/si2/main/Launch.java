/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unsch.si2.main;

import edu.unsch.core.impl.reflect.AppControllerReflect;
import edu.unsch.core.impl.reflect.AppControllerReflectFactory;
import edu.unsch.si2.controlador.LoginC;
import edu.unsch.si2.modelo.LoginM;
import edu.unsch.si2.vista.LoginV;
import edu.unsch.si2.vista.LoginV;


/**
 *
 * @author adm3c
 */
public class Launch {

        public static void main(String[] args) {

                        
         LoginV view = new LoginV();
         LoginM model = new LoginM();
         LoginC presenter = new LoginC(view, model);
                
         view.setVisible(true);
                
                
        AppControllerReflect appController = AppControllerReflectFactory
                                .getAppControllerInstance();
        appController.bind(view, model, presenter);
                

      }
}