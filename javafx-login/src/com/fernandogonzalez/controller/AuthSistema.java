/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandogonzalez.controller;

import com.fernandogonzalez.model.Rol;
import com.fernandogonzalez.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSistema {
    private static ArrayList <Usuario> ListaUsuarios = new ArrayList <>();
    
public AuthSistema(){


        Usuario usuarioAdmin = new Usuario("admin",
                "admin", "admin", Rol.ADMIN);
               Usuario  usuarioUser   = new Usuario("user",
                "user", "user", Rol.USER);
                    Usuario usuarioYo = new Usuario("kenneth",
                    "123", "Kenneth Bryan Velasquez", Rol.ADMIN);
                    
        ListaUsuarios.add(usuarioAdmin);
        ListaUsuarios.add(usuarioUser);
        ListaUsuarios.add(usuarioYo);
    
}

public Usuario login (String nombreUsuario, String clave){

for (Usuario usuarioBuscado : ListaUsuarios ){

if (usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
   && usuarioBuscado.getPassword().equals(clave)
        )
return usuarioBuscado;
}
return null;

}




    public static ArrayList<Usuario> getListaUsuarios() {
        return ListaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> ListaUsuarios) {
        AuthSistema.ListaUsuarios = ListaUsuarios;
    }


}