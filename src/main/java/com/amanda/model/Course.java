package com.amanda.model;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Entity
//@Table(name = "cursos") -> caso queira criar a tabela em um banco já existente.
@SQLDelete(sql = "UPDATE Course SET status = 'Inativo' WHERE id = ?" )
@Where(clause = "status = 'Ativo'")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    //@JsonIgnore -> caso queira ignorar, não enviar essa informação.
    private Long id;

    @NotBlank
    @NotNull
    @Length(min = 2, max = 100)
    @Column(length = 100, nullable = false) //(name = "nome") -> caso o nome da coluna seja diferente no BD
    private String name;

    @NotNull
    @Length(max = 12)
    @Column(length = 12, nullable = false)
    @Pattern(regexp = "Front-end|Back-end")
    private String category;

    @NotNull
    @Length(max = 12)
    @Column(length = 12, nullable = false)
    @Pattern(regexp = "Ativo|Inativo")
    private String status = "Ativo";

}
