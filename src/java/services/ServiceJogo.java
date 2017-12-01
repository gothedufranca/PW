/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import bo.BOJogo;
import to.TOJogo;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import to.TORetorno;


/**
 * REST Web Service
 *
 * @author usuario
 */
@Path("jogo")
public class ServiceJogo {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceJogo() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TOJogo salvar(TOJogo jogo) throws Exception{
        BOJogo.inserir(jogo);
        return jogo;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public TOJogo alterar(TOJogo jogo) throws Exception {
        BOJogo.alterar(jogo);
        return jogo;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TOJogo> obterJogos() throws Exception{
        return BOJogo.lista();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TOJogo obterJogos(@PathParam("id") int id) throws Exception{
        return BOJogo.obter(id);
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TORetorno excluir(@PathParam("id") int id) throws Exception {
        TORetorno r = new TORetorno();
        try {
            BOJogo.excluir(id);
            r.setSucesso(true);
        } catch (Exception e) {
            r.setSucesso(false);
        }
        return r;
    }
    
}
