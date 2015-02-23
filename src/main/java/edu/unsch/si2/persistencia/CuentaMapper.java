package edu.unsch.si2.persistencia;

import edu.unsch.si2.dominio.Usuario;



public interface CuentaMapper {

  Usuario getCuentaPorId(int id);

  Usuario getAccountByUsernameAndPassword(Usuario usuario);

  void insertaCuenta(Usuario usuario);
  
  void editaCuenta(Usuario usuario);
  
  void insertProfile(Usuario usuario);
  
  void insertSignon(Usuario usuario);

  void updateAccount(Usuario usuario);

  void updateProfile(Usuario usuario);

  void updateSignon(Usuario usuario);

}
