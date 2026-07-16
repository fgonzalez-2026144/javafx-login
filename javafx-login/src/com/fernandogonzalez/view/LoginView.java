/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandogonzalez.view;


import com.fernandogonzalez.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author informatica
 */
public class LoginView  extends BorderPane {
    private static LoginView instanciaLoginView;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;
    private HBox barraDeOpciones;
    
    private VBox cajaVertical;
    private Label lblNombreUsuario;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave;

    private GridPane formulario;
    private ImageView imgLogoLogin;
    private Button btnIniciarSesion;
    
    private String RUTA_ESTILOS = "/com/fernandogonzalez/styles/";
    
    
    private LoginView(){
        this.getStylesheets().add(RUTA_ESTILOS+"LoginStyles.css");
       this.setPadding (new Insets (15));
       this.setBorder( new Border (
               new BorderStroke (Paint.valueOf("#292C8C"), // Color Del Borde 
               BorderStrokeStyle.SOLID,
                new CornerRadii(22),
                new BorderWidths(2))
       ));
       
       this.setBackground(new Background(
               new BackgroundFill (Color.WHITESMOKE,
                       new CornerRadii (25),
                       Insets.EMPTY
              
               )
       
       
       ));
       
    barraDeOpciones = new HBox (35);
    
    btnCerrarVentana =  new Button ("X");
    
    lblTituloVentana = new Label ("javafx - simulation login ");
    
    barraDeOpciones.getChildren().addAll(btnCerrarVentana,lblTituloVentana );
    
    this.setTop(barraDeOpciones);
    
    //OBJETOS DEL FORMULARIO
    
    cajaVertical = new VBox(25);
    
    formulario = new GridPane();
    
    lblNombreUsuario = new Label("INGRESE SU NOMBRE DE USUARIO");
    txtNombreUsuario = new TextField ();
    
    lblClave = new Label ("INGRESE SU CONTRASEÑA ");
    pwdClave = new  PasswordField ();
    
    
    formulario.add(lblNombreUsuario,0,0);
    formulario.add(txtNombreUsuario,1,0);
    
    
    formulario.add(lblClave,0,1);
    formulario.add(pwdClave,1,1);
    

formulario.setHgap(10); 
formulario.setVgap(10); 
formulario.setAlignment(Pos.CENTER);
    
     btnIniciarSesion = new Button ("iniciar Sesion");
    
    
    imgLogoLogin = new ImageView(new ImageController().getImageLogin("logo"));
    imgLogoLogin.setFitWidth(100);
    imgLogoLogin.setFitHeight(100) ;
    imgLogoLogin.setCache(true);
    cajaVertical.setStyle("-fx-background-color: #D3D3D3;");
    cajaVertical.setAlignment(Pos.CENTER);
    
    
   
    
    cajaVertical.getChildren().addAll(imgLogoLogin,formulario,btnIniciarSesion);
    
    this.setCenter (cajaVertical);
    }
    
    
    
    
    public static LoginView getInstanciaLoginView() {
        if (instanciaLoginView == null)
            instanciaLoginView = new LoginView();
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }

    public VBox getCajaVertical() {
        return cajaVertical;
    }

    public void setCajaVertical(VBox cajaVertical) {
        this.cajaVertical = cajaVertical;
    }

    public Label getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public void setLblNombreUsuario(Label lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public Label getLblClave() {
        return lblClave;
    }

    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }

    public PasswordField getPwdClave() {
        return pwdClave;
    }

    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public ImageView getImgLogoLogin() {
        return imgLogoLogin;
    }

    public void setImgLogoLogin(ImageView imgLogoLogin) {
        this.imgLogoLogin = imgLogoLogin;
    }

    public Button getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(Button btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    
    
    
}
