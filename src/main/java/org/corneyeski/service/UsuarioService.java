package org.sample.jpa.service;

import org.sample.jpa.entities.Usuario;
import org.sample.jpa.exceptions.ResourceNotFoundException;

public interface UsuarioService {

    Usuario create(Usuario usuario);

    Usuario findById(Integer id) throws ResourceNotFoundException;
}
