package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Usuario;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios")
    public Usuario getUsuarios(){
        Usuario usuario = new Usuario();
        usuario.setId(0);
        usuario.setNombre("antonio");
        usuario.setApellido("Diaz");
        usuario.setEmail("periky22@gmail.com");
        usuario.setPassword("********");
        usuario.setTelefono("3115396201");
        return usuario;
    }
    @RequestMapping(value = "editar/{id}")
    public Usuario editar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("antonio");
        usuario.setApellido("Diaz");
        usuario.setEmail("periky22@gmail.com");
        usuario.setPassword("********");
        usuario.setTelefono("3115396201");
        return usuario;
    }
    @RequestMapping(value = "eliminar/{id}")
    public Usuario eliminar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("antonio");
        usuario.setApellido("Diaz");
        usuario.setEmail("periky22@gmail.com");
        usuario.setPassword("********");
        usuario.setTelefono("3115396201");
        return usuario;
    }
    @RequestMapping(value = "buscar/{id}")
    public Usuario buscar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("antonio");
        usuario.setApellido("Diaz");
        usuario.setEmail("periky22@gmail.com");
        usuario.setPassword("********");
        usuario.setTelefono("3115396201");
        return usuario;
    }
}
