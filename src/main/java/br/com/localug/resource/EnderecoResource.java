package br.com.localug.resource;


import br.com.localug.mapper.EnderecoMapper;
import br.com.localug.service.EnderecoService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/endereco")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EnderecoResource {

    @Inject
    EnderecoService enderecoService;

    @Inject
    EnderecoMapper enderecoMapper;

    @GET
    public Response listAll(){
        return enderecoService.listtAll()
                .map(result -> Response.ok(enderecoMapper.toList(result)).build())
                .orElseGet(() -> Response.status(Response.Status.NOT_FOUND).build());
    }
}
