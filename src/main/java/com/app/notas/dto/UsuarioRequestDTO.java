package com.app.notas.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsuarioRequestDTO {
    private String username;
    private String email;
    private String password;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Long id_nota;
}
