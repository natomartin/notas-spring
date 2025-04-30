package com.app.notas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "usuarios")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(length = 100, nullable = false)
    private String username;
    @Column(length = 150, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String password;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Notas> notas;
}
