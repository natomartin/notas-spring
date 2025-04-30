package com.app.notas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "notas")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notas")
    private Long id;
    @Column(length = 100, nullable = false)
    private String title;
    @Column(length = 500, nullable = false)
    private String content;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private Usuarios user;

}
