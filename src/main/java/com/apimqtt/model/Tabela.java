package com.apimqtt.model;

import com.apimqtt.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "dados")
@NoArgsConstructor
@AllArgsConstructor
public class Tabela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "topic", nullable = false, unique = true)
    private String topic;
    @NotNull
    @Column(name = "status", nullable = false, unique = true)
    private StatusEnum status;
    @NotNull
    @Column(name = "valor", nullable = false, unique = true)
    private Boolean valor;
    @Column(name = "horimetro")
    private Integer horimetro;
    @Column(name = "minuto")
    private Integer minuto;
    @NotNull
    @Column(name = "ts", nullable = false, unique = true)
    private Integer ts;


}
