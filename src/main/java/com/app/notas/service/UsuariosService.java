package com.app.notas.service;

import com.app.notas.entity.Usuarios;

public interface UsuariosService {
    Usuarios addUsuario(Usuarios userEntity);
    Usuarios updateUsuario(Usuarios userEntity);
    void deleteUsuario(Long id);
}
