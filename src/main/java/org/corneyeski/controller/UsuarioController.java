package org.corneyeski.controller;

import org.corneyeski.entities.Usuario;
import org.corneyeski.exceptions.ResourceNotFoundException;
import org.corneyeski.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jpa/user")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Integer id) throws ResourceNotFoundException {
        return usuarioService.findById(id);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.create(usuario);
    }
}
