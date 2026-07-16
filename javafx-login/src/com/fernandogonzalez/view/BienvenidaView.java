/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandogonzalez.view;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 *
 * @author gfern
 */
public class BienvenidaView extends VBox {
      private static BienvenidaView instanciaBienvenidaView;
    
    public BienvenidaView (){
        
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
        //IF es null
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }
public void mostrar(String nombreUsuario) {
    Stage stage = new Stage();
    
    // Crear componentes
    Label lblBienvenido = new Label("| BIENVENIDO |");
    Label lblNombre = new Label(nombreUsuario != null ? nombreUsuario : "Usuario");
    Label lblMensaje = new Label("Acceso al sistema autorizado");
    Button btnAceptar = new Button("Aceptar");

    
    //profe no pude pones los arreglos css en la Styles no me dajaba ejecutar 
    lblBienvenido.setStyle("-fx-text-fill: #ecf0f1; -fx-font-weight: bold; -fx-font-size: 18px;");
    lblNombre.setStyle("-fx-text-fill: #3498db; -fx-font-size: 18px; -fx-font-weight: bold;");
    lblMensaje.setStyle("-fx-text-fill: #bdc3c7;");
    btnAceptar.setStyle("-fx-background-color: #34495e; -fx-text-fill: white; -fx-font-weight: bold;");

    // Accion del boton
    btnAceptar.setOnAction(e -> stage.close());

    // Layout
    VBox layout = new VBox(20, lblBienvenido, lblNombre, lblMensaje, btnAceptar);
    layout.setAlignment(Pos.CENTER);
    layout.setStyle("-fx-background-color: #2c3e50; -fx-padding: 30;");

    // Escena y Stage
    Scene scene = new Scene(layout, 300, 250);
    stage.setTitle("Bienvenido");
    stage.setScene(scene);
    stage.setResizable(false);
    stage.show();
}
}

