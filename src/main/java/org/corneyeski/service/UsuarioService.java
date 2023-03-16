package org.corneyeski.service;

import org.corneyeski.entities.Usuario;
import org.corneyeski.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {

    Usuario create(Usuario usuario);

    Usuario findById(Integer id) throws ResourceNotFoundException;
}
