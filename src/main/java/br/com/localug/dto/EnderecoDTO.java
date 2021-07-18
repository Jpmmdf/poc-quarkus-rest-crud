package br.com.localug.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private Long id;

    private String nome;

    private String bairro;

    private String logradouro;

    private String complemento;

    private String cep;

}
