package com.app.notas.service.impl;

import com.app.notas.entity.Usuarios;
import com.app.notas.repositorio.UsuarioRepository;
import com.app.notas.service.UsuariosService;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    private final UsuarioRepository usuarioRepository;

public UsuariosServiceImpl(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
}
    @Override
    public Usuarios addUsuario(Usuarios userEntity) {
        return usuarioRepository.save(userEntity);
    }

    @Override
    public Usuarios updateUsuario(Usuarios userEntity) {
        return usuarioRepository.save(userEntity);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
