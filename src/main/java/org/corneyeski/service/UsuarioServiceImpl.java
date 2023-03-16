package org.corneyeski.service;

import org.corneyeski.entities.Usuario;
import org.corneyeski.exceptions.ResourceNotFoundException;
import org.corneyeski.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Integer id) throws ResourceNotFoundException {
        return usuarioRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
