/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandogonzalez.controller;

import com.fernandogonzalez.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class SceneManager {

    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager ;

    private SceneManager() {

    }
    public void ventanaLogin (){
         try { 
             this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
             LoginView login = LoginView.getInstanciaLoginView();
             cambiarEscena(login, 450 , 500);
             this.escenaPrincipal.setFill(Color.TRANSPARENT);
             new LoginController(login);
         
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error onjeto nulo: Ventana login");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: ventana Login  ");
            errorPadre.printStackTrace();
        }

    
    
    }

    public void cambiarEscena(Pane panel, int ancho, int alto) {
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();

        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error onjeto nulo");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre ");
            errorPadre.printStackTrace();
        }

    }

    public static SceneManager getInstanciaSceneManager() {
        if (instanciaSceneManager == null) {
            instanciaSceneManager = new SceneManager();
        }
        return instanciaSceneManager;
    }

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }

    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }

    
    


}
