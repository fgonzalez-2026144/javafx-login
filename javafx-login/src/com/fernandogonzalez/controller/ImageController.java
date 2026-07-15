/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandogonzalez.controller;

import javafx.scene.image.Image;

/**
 *
 * @author informatica
 */
public class ImageController {
    private final String RUTA_IMAGENES = "/com/fernandogonzalez/resources/";
    
    public Image getImageLogin(String nombreImagen){
    Image crearImagen;
    
    switch (nombreImagen){
        case "logo":
            crearImagen = new Image (RUTA_IMAGENES + "login-logo.png");
            break;
        default:
            crearImagen = new Image (RUTA_IMAGENES + "login-logo.png");
    }
    return crearImagen;
    }
    
}
