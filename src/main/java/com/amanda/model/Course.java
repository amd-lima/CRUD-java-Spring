package com.amanda.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
//@Table(name = "cursos") -> caso queira criar a tabela em um banco já existente.
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    //@JsonIgnore -> caso queira ignorar, não enviar essa informação.
    private Long id;

    @Column(length = 200, nullable = false) //(name = "nome") -> caso o nome da coluna seja diferente no BD
    private String name;

    @Column(length = 12, nullable = false)
    private String category;

}
