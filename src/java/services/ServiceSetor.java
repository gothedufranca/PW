/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import bo.BOSetor;
import to.TOSetor;
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
@Path("setor")
public class ServiceSetor {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceSetor() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TOSetor salvar(TOSetor setor) throws Exception{
        BOSetor.inserir(setor);
        return setor;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public TOSetor alterar(TOSetor setor) throws Exception {
        BOSetor.alterar(setor);
        return setor;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TOSetor> obterSetores() throws Exception{
        return BOSetor.lista();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TOSetor obterFornecedores(@PathParam("id") int id) throws Exception{
        return BOSetor.obter(id);
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TORetorno excluir(@PathParam("id") int id) throws Exception {
        TORetorno r = new TORetorno();
        try {
            BOSetor.excluir(id);
            r.setSucesso(true);
        } catch (Exception e) {
            r.setSucesso(false);
        }
        return r;
    }
    
}
