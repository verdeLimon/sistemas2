/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unsch.si2.vista;

import edu.unsch.core.annotation.Action;
import edu.unsch.core.annotation.MVP;
import edu.unsch.core.annotation.Model;
import edu.unsch.si2.controlador.LoginC;
import edu.unsch.si2.modelo.LoginM;

/**
 *
 * @author adm3c
 */
@MVP(modelClass = LoginM.class, presenterClass = LoginC.class)
public class LoginV extends javax.swing.JFrame {

    /**
     * Creates new form LoginV2
     */
    public LoginV() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contrasenia = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INICIAR SESION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("USUARIO:");

        jLabel2.setText("CONTRASEÑA:");

        salir.setText("SALIR");

        button.setText("INGRESAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreUsuario)
                            .addComponent(contrasenia)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(button)
                        .addGap(59, 59, 59)
                        .addComponent(salir)))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(button)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    @Action(name = "iniciarSesion")
    private javax.swing.JButton button;
    @Model(property = "contrasenia")
    private javax.swing.JTextField contrasenia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    @Model(property = "nombreUsuario")
    private javax.swing.JTextField nombreUsuario;
    @Action(name = "salir")
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the button
     */
    public javax.swing.JButton getButton() {
        return button;
    }
public javax.swing.JButton getSalir() {
        return salir;
    }
    /**
     * @return the contrasenia
     */
    public javax.swing.JTextField getContrasenia() {
        return contrasenia;
    }

    /**
     * @return the nombreUsuario
     */
    public javax.swing.JTextField getNombreUsuario() {
        return nombreUsuario;
    }

    

   
}
