/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandogonzalez.controller;

import com.fernandogonzalez.model.Usuario;
import com.fernandogonzalez.view.LoginView;
import javafx.application.Platform;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class LoginController {

    private final LoginView LOGIN_VIEW;
    private double ejeX = 0 ;
    private double ejeY = 0 ;
    private AuthSistema authSistema = new AuthSistema();

    public LoginController(LoginView loginView) {
        this.LOGIN_VIEW = loginView;
        contruirAcciones();
    }
     
    
    
    
    
    private Stage escenarioPrincipal = SceneManager.getInstanciaSceneManager().getEscenarioPrincipal();
    
    
    public void iniciarSesion(){
     String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String clave = this.LOGIN_VIEW.getPwdClave().getText().trim();
        
        if( nombreUsuario.isEmpty() ){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "NO DEJES VACIO EL NOMBRE USUARIO");
            
} else {
    this.LOGIN_VIEW.getPwdClave().getStyleClass().remove("empty");
    // METODO LOGIN
    Usuario usuario = authSistema.login(nombreUsuario, clave);

    if (usuario == null) {
        JOptionPane.showMessageDialog(null, "VERIFICA TUS CREDENCIALES");
    } else {
        // --- AQUÍ VA EL CAMBIO ---
        
        // 1. Cerrar la ventana de Login actual
        Stage loginStage = (Stage) this.escenarioPrincipal.getScene().getWindow();
        loginStage.close();

      
Platform.runLater(() -> {
    SceneManager.getInstanciaSceneManager().ventanaBienvenida(usuario.getNombreUsuario());
});
}
    }
    
    }
    public void contruirAcciones() {
        this.LOGIN_VIEW.getBtnIniciarSesion().setOnMouseClicked(
        (evento) ->{
        iniciarSesion();
        }
        
        );
        
        
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (evento) -> {
                    System.exit(0);
                }
        );

        this.LOGIN_VIEW.setOnMouseClicked(
        
        (evento)-> {
                
            
            ejeX = evento.getSceneX();
            ejeY = evento.getSceneY();
            
            
            
            
        }
        
        );
        
        this.LOGIN_VIEW.setOnMouseDragged(
        (evento) -> {
           double ejeXDesplazamientoVentana = evento.getScreenX();
           double ejeYDesplazamientoVentana = evento.getScreenY();
    
           escenarioPrincipal.setX(ejeXDesplazamientoVentana - ejeX);
           escenarioPrincipal.setY(ejeYDesplazamientoVentana - ejeY);
           
    }
        
        
        );
    }

}
