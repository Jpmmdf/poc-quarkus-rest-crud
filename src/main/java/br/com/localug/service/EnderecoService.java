package br.com.localug.service;

import br.com.localug.entity.Endereco;
import br.com.localug.repository.EnderecoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class EnderecoService {

    @Inject
    EnderecoRepository enderecoRepository;



    public Optional<List<Endereco>> listtAll(){
        List<Endereco> enderecos = enderecoRepository.listAll();
        System.out.println("Enderecos :" + enderecos);
        return Optional.ofNullable(enderecos);
    }


}
