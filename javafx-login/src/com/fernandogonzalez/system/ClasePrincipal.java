/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fernandogonzalez.system;

import javafx.stage.Stage;
import com.fernandogonzalez.controller.SceneManager;
import javafx.application.Application;
import static javafx.application.Application.launch;
        
        
        
/**
 *
 * @author informatica
 */
public class ClasePrincipal extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch (args);
        
    }
    
    @Override 
    
    
    
    public void start (Stage escenarioRaiz){
    SceneManager.getInstanciaSceneManager().setEscenarioPrincipal(escenarioRaiz);
    SceneManager.getInstanciaSceneManager().ventanaLogin();
    }
    
    
}
