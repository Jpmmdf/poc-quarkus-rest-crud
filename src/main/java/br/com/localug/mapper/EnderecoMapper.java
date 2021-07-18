package br.com.localug.mapper;

import br.com.localug.dto.EnderecoDTO;
import br.com.localug.entity.Endereco;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = QuarkusMappingConfig.class)
public interface EnderecoMapper {

    EnderecoDTO toResource(Endereco endereco);

    List<EnderecoDTO> toList(List<Endereco> enderecoList);

}
