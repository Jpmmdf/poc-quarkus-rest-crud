package br.com.localug.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_ENDERECO")
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ENDERECO")
    @NotNull
    private Long id;

    @Column(name = "NO_ENDERECO")
    @NotNull
    private String nome;

    @Column(name = "NO_BAIRRO")
    private String bairro;

    @Column(name = "NO_LOGRADOURO")
    private String logradouro;

    @Column(name = "NO_COMPLEMENTO")
    private String complemento;

    @Column(name = "NO_CEP")
    private String cep;


}
