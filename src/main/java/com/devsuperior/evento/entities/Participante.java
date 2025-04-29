package com.devsuperior.evento.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    @Column(unique = true)
    private String email;
}
