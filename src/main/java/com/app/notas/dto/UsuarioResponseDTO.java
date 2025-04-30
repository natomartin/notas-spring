package com.app.notas.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UsuarioResponseDTO {
    private Long id_user;
    private String username;
    private String email;
    private String password;
    private LocalDateTime created_atUser;
    private LocalDateTime updated_atUser;
    private String title;
    private String content;
    private LocalDateTime created_atNota;
    private LocalDateTime updated_atNota;
}
